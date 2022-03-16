package Week05.BaiTap6;

public class HoaDonTheoNgay extends HoaDon{
    private double soNgayThue;
    private double thanhTien = soNgayThue * getDonGia();
    
    public double getSoNgayThue() {
        return soNgayThue;
    }
    public void setSoNgayThue(double soNgayThue) {
        this.soNgayThue = soNgayThue;
    }
    public double getThanhTien() {
        return thanhTien;
    }
    private void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public HoaDonTheoNgay(String maHD, String ngayHD, String tenKH, String maPhong, double donGia,
            double soNgayThue, double thanhTien) {
        super(maHD, ngayHD, tenKH, maPhong, donGia);
        this.soNgayThue = soNgayThue;
        this.thanhTien = thanhTien;
    }
    public HoaDonTheoNgay(){}

    @Override
    public void nhapHD() {
        super.nhapHD();
        System.out.print("Nhap so ngay thue: ");
        setSoNgayThue(input.nextDouble());
    }

    @Override
    public void xuatHD() {
        System.out.println("/---Theo Ngay---/");
        super.xuatHD();
        System.out.println("So ngay thue: " + getSoNgayThue());
    }
}
