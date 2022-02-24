package Courses.Week03.buoi6.SinhVien;

import java.util.Scanner;

public class SinhVien_TestDrive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SinhVien sv1 = new SinhVien("300", "Gia Hao", 8.0f, 9.0f);
        SinhVien sv2 = new SinhVien("200", "Ha", 8.2f, 9.1f);
        SinhVien sv3 = new SinhVien();

        System.out.print("Nhap MSSV: ");
        String mssv = input.nextLine();
        sv3.setMSSV(mssv);

        System.out.print("Nhap Ho va Ten: ");
        String hoten = input.nextLine();
        sv3.setHoten(hoten);

        System.out.print("Nhap diem LT: ");
        float diemLT = input.nextFloat();
        sv3.setDiemLT(diemLT);

        System.out.print("Nhap diem TH: ");
        float diemTH = input.nextFloat();
        sv3.setDiemTH(diemTH);

        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        System.out.println(sv3.toString());

        input.close();
    }
}
