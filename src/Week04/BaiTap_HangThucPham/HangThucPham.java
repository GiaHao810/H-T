package Week04.BaiTap_HangThucPham;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham {
    private String maHang;
    private String tenHang;
    private double donGia;
    private Date ngayHetHan;
    private Date ngaySX;

    private void setMaHang(String maHang) {
        if(maHang != null){
            this.maHang = maHang;
        } else {
            System.out.println("Ma hang khong duoc rong!");
            this.maHang = "default";
        }
        this.maHang = maHang;
    }
    
    public String getMaHang() {
        return maHang;
    }

    public void setDonGia(double donGia) {
        if(donGia >= 0){
            this.donGia = donGia;
        } else {
            System.out.println("Don gia phai lon hon 0!");
            this.donGia = 1;
        }
    }

    public double getDonGia() {
        return donGia;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        if(ngayHetHan != null){
            if(ngayHetHan.after(this.ngaySX)){
                this.ngayHetHan = ngayHetHan;
            } else {
                System.out.println("Ngay het han phai sau ngay san xuat.");
                this.ngayHetHan = new Date();
            }
            this.ngayHetHan = ngayHetHan;
        } else {
            System.out.println("Ngay het han khong duoc de rong!");
            this.ngayHetHan = new Date();
        }
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgaySX(Date ngaySX) {
        if(ngaySX != null){
            if(ngaySX.before(this.ngayHetHan)){
                this.ngaySX = ngaySX;
            } else {
                System.out.println("Ngay san xuat phai truoc ngay het han.");
            }
            this.ngaySX = ngaySX;
        } else {
            System.out.println("Ngay san xuat khong duoc de rong!");
            this.ngaySX = new Date();
        }
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setTenHang(String tenHang) {
        if(tenHang != null){
            this.tenHang = tenHang;
        } else {
            System.out.println("Ten hang khong duoc rong!!");
            this.tenHang = "Default";
        }
    }

    public String getTenHang() {
        return tenHang;
    }

    public HangThucPham(String maHang, String tenHang, double donGia, Date ngayHetHan, Date ngaySX) {
        this.setMaHang(maHang);
        this.setTenHang(tenHang);
        this.setDonGia(donGia);
        this.setNgayHetHan(ngayHetHan);
        this.setNgaySX(ngaySX);
    }

    public HangThucPham(String maHang) {
        this.setMaHang(maHang);
    }

    @Override
    public String toString() {
        SimpleDateFormat ngayVN = new SimpleDateFormat("dd/MM/yyyy");

        return "HangThucPham [donGia=" + donGia + ", maHang=" + maHang + ", ngayHetHan=" + ngayVN.format(ngayHetHan) + ", ngaySX="
        + ngayVN.format(ngaySX) + ", tenHang=" + tenHang + "]";
    }

    public void kiemtraHSD(){
        if(ngaySX.after(new Date())){
            System.out.println("Hang thuc pham da het han su dung!");
        } else {
            System.out.println("Hang thuc pham chua het han su dung");;
        }
    }
}
