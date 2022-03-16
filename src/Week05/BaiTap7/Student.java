package Week05.BaiTap7;

public class Student extends Person{
    private double diemMon1, diemMon2;

    public double getDiemMon1() {
        return diemMon1;
    }

    public void setDiemMon1(double diemMon1) {
        this.diemMon1 = diemMon1;
    }

    public double getDiemMon2() {
        return diemMon2;
    }

    public void setDiemMon2(double diemMon2) {
        this.diemMon2 = diemMon2;
    }

    public double tinhDiemTB(){
        return 5.5;
    }

    public String danhGia(){
        return "";
    }

    @Override
    public String toString() {
        System.out.println("/---Bang diem sinh vien---/");
        String val = "Diem mon hoc 1: " + getDiemMon1() + "\nDiem mon hoc 2: " + getDiemMon2()
        + "\nDiem trung binh: " + tinhDiemTB();
        return val;
    }
}
