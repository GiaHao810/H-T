package Courses.Outline.LopVaDoiTuong;

public class SanPham_TestDrive {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();

        sp1.nhap();
        sp2.nhap();

        System.out.println("Xuat thong tin");
        sp1.xuat();
        sp2.xuat();

    }
}
