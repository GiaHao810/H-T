package Week05.BaiTap3;

import java.sql.Date;

public class GiaoDich {
    private String maGD;
    private Date ngayGD;
    private double donGia;
    private int soLuong;
    private double thanhTien;

    public GiaoDich(){}
    
    public GiaoDich(String maGD, Date ngayGD, double donGia, int soLuong) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    private double getThanhTien(){
        return thanhTien;
    }

    private void setThanhTien(){
        this.thanhTien = thanhTien;
    }
    
    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public Date getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(Date ngayGD) {
        this.ngayGD = ngayGD;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double tinhThanhTien(int soLuong, double donGia){
        return thanhTien = this.soLuong * this.donGia;
    }
}
