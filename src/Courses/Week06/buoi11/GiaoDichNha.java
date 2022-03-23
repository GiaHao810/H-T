package Courses.Week06.buoi11;

import java.util.Date;

public class GiaoDichNha extends GiaoDich {
    private String loaiNha;
    private String diaChi;
    
    public GiaoDichNha(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich, String loaiNha,
            String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public GiaoDichNha() {

    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public double tinhTien() {
        double tien = 0;
        if(this.loaiNha.equalsIgnoreCase("CaoCap")){
            tien = this.getDienTich() * this.getDonGia();
        } else {
            tien = this.getDienTich() * this.getDonGia() * 0.9;
        }
        return tien;
    }

    @Override
    public String toString() {
        String string = "\n/----Giao Dich Nha----/\n" + super.toString() + "Loai Nha: " + loaiNha + "\nDia Chi: " + diaChi;
        return string + "\n";
    }
}
