package Courses.KiemtraGK;

import java.text.ParseException;
import java.util.InputMismatchException;

public class GDNha extends GiaoDich {
    private String loaiNha; //Cao cap, Thuong
    private String diaChi;
    private double dienTich;

    protected String getLoaiNha() {
        return loaiNha;
    }

    protected void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    protected String getDiaChi() {
        return diaChi;
    }

    protected void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    protected double getDienTich() {
        return dienTich;
    }

    protected void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public GDNha(String maGD, String ngayGD, double donGia, String loaiNha, String diaChi, double dienTich) {
        super(maGD, ngayGD, donGia);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
        this.dienTich = dienTich;
    }
    
    public GDNha(){}

    @Override
    public void nhapGD() throws InputMismatchException{
        super.nhapGD();
        System.out.print("Nhap loai nha: ");
        setLoaiNha(input.next());

        System.out.print("Nhap dien tich: ");
        setDienTich(input.nextDouble());

        System.out.print("Nhap dia chi: ");
        setDiaChi(input.next());
    }

    @Override
    public String xuat() throws ParseException{
        System.out.println("/----Giao dich Nha----/");

        return super.xuat() + "\nLoai nha: " + this.loaiNha + "\nDia chi: " + this.diaChi + "\nDien tich: " + this.dienTich + "\nThanh tien: " + getThanhTien();
    }

    @Override
    protected double getThanhTien() {
        boolean loop = true;
        double val = 0;

        while(loop){
            if(this.getLoaiNha().equalsIgnoreCase("cao cap")){
                val = this.getDienTich() * this.getDonGia();
                loop = false;
            } else if(this.getLoaiNha().equalsIgnoreCase("Thuong")){
                val = this.getDienTich() * this.getDonGia() * 0.9;
                loop = false;
            } else {
                loop = true;
            }
        }
        return val;
    }
}
