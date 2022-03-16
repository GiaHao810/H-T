package Week05.BaiTap7;

public class Employee extends Person{
    private double heSoLuong;

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double tinhLuong(){
        return 5.5;
    }

    public String danhGia(){
        return "";
    }

    @Override
    public String toString() {
        System.out.println("/---Bang luong nhan vien---/");
        String val = "He so luong: " + getHeSoLuong() + "\nTien luong: " + tinhLuong();
        return val;
    }
}
