package Week05.BaiTap6;

public class HoaDonTheoGio extends HoaDon{
    private double soGioThue;
    private double thanhTien = soGioThue * getDonGia();

    public double getSoGioThue() {
        return soGioThue;
    }
    public void setSoGioThue(double soGioThue) {
        this.soGioThue = soGioThue;
    }
    public double getThanhTien() {
        return thanhTien;
    }
    protected void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    public HoaDonTheoGio() {
    }
    public HoaDonTheoGio(String maHD, String ngayHD, String tenKH, String maPhong, double donGia, double soGioThue,
            double thanhTien) {
        super(maHD, ngayHD, tenKH, maPhong, donGia);
        this.soGioThue = soGioThue;
        this.thanhTien = thanhTien;
    }

    @Override
    public void nhapHD() {
        super.nhapHD();
        System.out.print("So gio thue: ");
        this.setSoGioThue(input.nextDouble());
    }

    @Override
    public void xuatHD() {
        System.out.println("/---Theo Gio---/");
        super.xuatHD();
        System.out.println("So gio thue: " + getSoGioThue());
    }
}
