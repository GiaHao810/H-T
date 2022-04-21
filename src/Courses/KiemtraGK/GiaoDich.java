package Courses.KiemtraGK;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;

public class GiaoDich {
    private String maGD;
    private String ngayGD;
    private double donGia;
    private double thanhTien;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    Scanner input = new Scanner(System.in);

    protected String getMaGD() {
        return maGD;
    }

    protected void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    protected String getNgayGD() {
        return ngayGD;
    }

    protected void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }

    protected double getDonGia() {
        return donGia;
    }

    protected void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    protected double getThanhTien() {
        return thanhTien;
    }

    protected void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public GiaoDich(String maGD, String ngayGD, double donGia) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
    }

    public GiaoDich(){}

    public void nhapGD(){
        System.out.print("Nhap ma giao dich: ");
        setMaGD(input.nextLine());

        System.out.println("\nFormat(dd/MM/yyyy)");
        System.out.print("Nhap ngay giao dich: ");
        setNgayGD(input.nextLine());

        System.out.print("Nhap don gia: ");
        setDonGia(input.nextDouble());
    }

    public String xuat() throws ParseException{
        return "Ma giao dich: " + this.maGD + "\nNgay giao dich: " + sdf.parse(this.ngayGD) + "\nDon gia: " + this.donGia;
    }

}
