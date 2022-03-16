package Week05.BaiTap3;

import java.sql.Date;
import java.util.Scanner;

public class GiaoDich {
    private String maGD;
    private String ngayGD;
    private double donGia;
    private int soLuong;
    private double thanhTien;

    Scanner input = new Scanner(System.in);

    public GiaoDich(){}
    
    public GiaoDich(String maGD, String ngayGD, double donGia, int soLuong) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    protected double getThanhTien(){
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

    public String getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(String ngayGD) {
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

    public void nhapGD(){
        System.out.println("---------------------");
        System.out.print("Nhap ma GD: ");
        this.setMaGD(input.nextLine());
        System.out.print("Ngay GD (dd/MM/yyy):");
        this.setNgayGD(input.nextLine());
        System.out.print("Don gia: ");
        this.setDonGia(input.nextDouble());
        System.out.print("So luong: ");
        this.setSoLuong(input.nextInt());
    }

    public int tinhTongSL(){
        return soLuong;
    }

    public void xuatDS(){
        System.out.println("Ma GD: " + getMaGD());
        System.out.println("Ngay GD: " + getNgayGD());
        System.out.println("Don gia: " + getDonGia());
        System.out.println("So luong: " + getSoLuong());
    }
}
