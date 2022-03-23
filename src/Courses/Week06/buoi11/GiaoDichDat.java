package Courses.Week06.buoi11;

import java.util.Date;

public class GiaoDichDat extends GiaoDich {

    private char loaiDat; //A, B, C

    public char getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(char loaiDat) {
        this.loaiDat = loaiDat;
    }

    public GiaoDichDat(){

    }

    public GiaoDichDat(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich, char loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    @Override
    public double tinhTien() {
        double tien = 0;
        if(this.loaiDat == 'B' || this.loaiDat == 'C'){
            tien = this.getDienTich() * this.getDonGia();
        } else {
            tien = this.getDienTich() * this.getDonGia() * 1.5;
        }
        return tien;
    }

    @Override
    public String toString() {
        String string = "\n/----Giao Dich Dat----/\n" + super.toString() + "Loai Dat: " + loaiDat;
        return string + "\n";
    }
}
