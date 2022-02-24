package Courses.Outline.LopVaDoiTuong;

import java.util.Scanner;

public class SanPham {
    Scanner input = new Scanner(System.in);

    String tenSp;
    Double donGia;
    Double giamGia;

    public SanPham(){}

    public SanPham(String tenSp, double donGia, double giamGia){
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double donGia){
        this(tenSp,donGia,0);
    }

    private Double getThueNhapKhau(){
        donGia *= 10/100;
        return donGia;
    }

    public void xuat(){
        System.out.println("Ten san pham: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
    }

    void nhap(){
        System.out.println("Nhap thong tin san pham");
        System.out.print("Ten san pham: ");
        tenSp = input.nextLine();

        System.out.print("Don gia: ");
        donGia = input.nextDouble();
        
        System.out.print("Giam gia: ");
        giamGia = input.nextDouble();
    }
}
