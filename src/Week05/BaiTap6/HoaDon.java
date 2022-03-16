package Week05.BaiTap6;

import java.util.Scanner;

public class HoaDon {
    private String maHD, ngayHD, tenKH, maPhong;
    private double donGia;

    Scanner input = new Scanner(System.in);

    public String getMaHD() {
        return maHD;
    }
    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }
    public String getNgayHD() {
        return ngayHD;
    }
    public void setNgayHD(String ngayHD) {
        this.ngayHD = ngayHD;
    }
    public String getTenKH() {
        return tenKH;
    }
    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
    public String getMaPhong() {
        return maPhong;
    }
    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public HoaDon(){}

    public HoaDon(String maHD, String ngayHD, String tenKH, String maPhong, double donGia, Scanner input) {
        this.maHD = maHD;
        this.ngayHD = ngayHD;
        this.tenKH = tenKH;
        this.maPhong = maPhong;
        this.donGia = donGia;
        this.input = input;
    }

    public void nhapHD(){
        System.out.print("Ma hoa don: ");
        setMaHD(input.nextLine());
        System.out.print("Ngay xuat hoa don: ");
        setNgayHD(input.nextLine());
        System.out.print("Ten khach: ");
        setTenKH(input.nextLine());
        System.out.print("Ma phong: ");
        setMaPhong(input.nextLine());
        System.out.print("Don gia: ");
        setDonGia(input.nextDouble());
    }

    public void xuatHD(){
        System.out.println("Ma hoa don: " + getMaHD());
        System.out.println("Ngay xuat: " + getNgayHD());
        System.out.println("Ten khach: " + getTenKH());
        System.out.println("Ma phong: " + getMaPhong());
        System.out.println("Don gia: " + getDonGia());
    }
}
