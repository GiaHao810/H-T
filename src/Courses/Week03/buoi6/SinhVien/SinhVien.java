package Courses.Week03.buoi6.SinhVien;

public class SinhVien {
    //Attributes
    private String mssv;
    private String hoten;
    private float diemLT,
                  diemTH;

    //Constructor
    public SinhVien(){}

    public SinhVien(String mssv, String hoten, float diemLT, float diemTH){
        this.mssv = mssv;
        this.hoten = hoten;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    //Methods
    public String getMSSV(){
        return this.mssv;
    }

    public String setMSSV(String mssv){
        return this.mssv = mssv;
    }


    public String getHoten(){
        return this.hoten;
    }

    public String setHoten(String hoten){
        return this.hoten = hoten;
    }

    public float getDiemLT(){
        return this.diemLT;
    }

    public float setDiemLT(float diemLT){
        return this.diemLT = diemLT;
    }

    public float getDiemTH(){
        return this.diemTH;
    }

    public float setDiemTH(float diemTH){
        return this.diemTH = diemTH;
    }

    public float tinhDiemTB(){
        return (this.diemLT + this.diemTH) /2;
    }

    public String toString(){
        String string = "\tThong tin sinh vien\n" + "MSSV: " + getMSSV() + "\tHo Ten: " + getHoten() + "\tDiem LT: " + getDiemLT()
         + "\tDiem TH: " + getDiemTH() + "\tDiem TB: " + tinhDiemTB() + "\n";

        return string;
    }
}
