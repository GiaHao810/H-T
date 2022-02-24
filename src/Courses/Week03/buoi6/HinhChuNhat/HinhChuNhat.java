package Courses.Week03.buoi6.HinhChuNhat;

public class HinhChuNhat {
    //Attributes
    private double chieuDai;
    private double chieuRong;

    //Methods
    public double getChieuDai(){
        return this.chieuDai;
    }

    public double setChieuDai(double chieuDai){
        return this.chieuDai = chieuDai;
    }

    public double getChieuRong(){
        return this.chieuRong;
    }

    public double setChieuRong(double chieuRong){
        return this.chieuRong = chieuRong;
    }

    public double tinhChuVi(){
        return (this.chieuDai * this.chieuRong) * 2;
    }

    public double tinhDienTich(){
        return this.chieuDai * this.chieuRong;
    }

    public String toString(){
        String string = "Chieu dai: " + this.chieuDai + "\tChieu Rong: " + this.chieuRong + "\nDien tich: " + this.tinhDienTich() + "\tChu vi: " + this.tinhChuVi();
        return string;
    }
}
