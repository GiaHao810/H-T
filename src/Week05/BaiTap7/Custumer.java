package Week05.BaiTap7;

public class Custumer extends Person{
    private String tenCongty;
    private double triGiaHD;
    private String danhGia;

    public String getTenCongty() {
        return tenCongty;
    }
    public void setTenCongty(String tenCongty) {
        this.tenCongty = tenCongty;
    }
    public double getTriGiaHD() {
        return triGiaHD;
    }
    public void setTriGiaHD(double triGiaHD) {
        this.triGiaHD = triGiaHD;
    }
    public String getDanhGia() {
        return danhGia;
    }
    public void setDanhGia(String danhGia) {
        this.danhGia = danhGia;
    }

    @Override
    public String toString() {
        System.out.println("/---Thong tin hoa don---/");
        String val = "Ten cong ty: " + getTenCongty() + "\nTri gia hoa don: " + getTriGiaHD() + "\nDanh gia: " + getDanhGia();
        return val;
    }
}
