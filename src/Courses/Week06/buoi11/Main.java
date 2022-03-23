package Courses.Week06.buoi11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        DanhSachGiaoDich dsGD = new DanhSachGiaoDich();

        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        boolean condition = true;

        do {
            System.out.println("/---------------------/");
            System.out.println("1 - Nhap Giao Dich Dat.");
            System.out.println("2 - Nhap Giao Dich Nha.");
            System.out.println("3 - In danh sach cac Giao Dich.");
            System.out.println("4 - Tinh tong so luong tung loai.");
            System.out.println("5 - In danh sach cac Giao Dich cua ngay 9 thang 3.");
            System.out.println("6 - Tinh trung binh thanh tien Giao Dich Dat.");
            System.out.println("/---------------------/");
            System.out.print("Nhap lua chon: ");

            switch (input.nextInt()) {
                case 1:
                    System.out.println("/-Vui long nhap thong tin giao dich-/");
                    System.out.print("Ma Giao Dich: ");
                    String maGD = input.next();
                    System.out.print("Ngay Giao Dich: ");
                    String ngayGD = input.next();
                    System.out.print("Don Gia: ");
                    double donGia = input.nextDouble();
                    System.out.print("Dien Tich: ");
                    double dienTich = input.nextDouble();

                    System.out.print("Loai Dat: ");
                    char loaiDat = input.next().charAt(0);

                    //Dữ liệu mồi
                    // String maGD = "GDD01", ngayGD = "26/03/2020";
                    // double donGia = 50_000_000, dienTich = 500;
                    // char loaiDat = 'A';

                    GiaoDichDat gdDat = new GiaoDichDat(maGD, sdf.parse(ngayGD), donGia, dienTich, loaiDat);
                    
                    dsGD.them(gdDat);
                    break;
                case 2:
                    System.out.println("/-Vui long nhap thong tin giao dich-/");
                    System.out.print("Ma Giao Dich: ");
                    maGD = input.next();
                    System.out.print("Ngay Giao Dich: ");
                    ngayGD = input.next();
                    System.out.print("Don Gia: ");
                    donGia = input.nextDouble();
                    System.out.print("Dien Tich: ");
                    dienTich = input.nextDouble();
                    
                    System.out.print("Loai Nha: ");
                    String loaiNha = input.next();
                    System.out.print("Dia Chi: ");
                    String diaChi = input.next();

                    //Dữ liệu mồi
                    // maGD = "GDN02";
                    // ngayGD = "21/09/2013";
                    // donGia = 100_000_000;
                    // dienTich = 1_000;
                    // String loaiNha = "CaoCap", diaChi = "Quan 1";

                    GiaoDichNha gdNha = new GiaoDichNha(maGD, sdf.parse(ngayGD), donGia, dienTich, loaiNha, diaChi);
                    
                    dsGD.them(gdNha);
                    break;
                case 3:
                    dsGD.inDanhSach();
                    break;
                case 4:
                    dsGD.tinhTongSLTungLoai();
                    break;
                case 5:
                    dsGD.xuatGDcua9thang3();
                    break;
                case 6:
                    System.out.println(dsGD.tinhTongTBDat());
                    break;
                case 0:
                    condition = false;
                    break;
                default:
                    break;
            }
        } while (condition);
        input.close();
    }
}
