package Week03.BaiTap_QLXe;

public class Xe_NgoaiThanh extends ChuyenXe {
    private String noiDen;
    private double ngayDadi;

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public double getNgayDadi() {
        return ngayDadi;
    }

    public void setNgayDadi(double ngayDadi) {
        this.ngayDadi = ngayDadi;
    }

    protected void nhapXeNgoaiThanh() {
        nhapChuyenXe();

        System.out.print("Noi den: ");
        setNoiDen(input.next());

        System.out.print("So ngay di duoc: ");
        setNgayDadi(input.nextDouble());
    }

    public void xuatXeNgoaiThanh(){
        xuatChuyenXe();
        System.out.println("Noi den: " + getNoiDen());
        System.out.println("So ngay di duoc: " + getNgayDadi());
    }

    public Xe_NgoaiThanh(){}

    public Xe_NgoaiThanh(String maSoChuyen, String hoTenTX, String bienSoXe, double doanhThu, String noiDen,
            double ngayDadi) {
        super(maSoChuyen, hoTenTX, bienSoXe, doanhThu);
        this.noiDen = noiDen;
        this.ngayDadi = ngayDadi;
    }
}
