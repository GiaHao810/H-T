package Courses.KiemtraGK;

import java.text.ParseException;

public class GDDat extends GiaoDich{
    private String loaiDat;
    private double dienTich;

    protected String getLoaiDat() {
        return loaiDat;
    }

    protected void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public GDDat(String maGD, String ngayGD, double donGia, String loaiDat) {
        super(maGD, ngayGD, donGia);
        this.loaiDat = loaiDat;
    }

    protected double getDienTich() {
        return dienTich;
    }

    protected void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public GDDat() {
    }

    @Override
    public void nhapGD() {
        super.nhapGD();
        System.out.print("Nhap loai dat: ");
        setLoaiDat(input.next());
    }

    @Override
    public String xuat() throws ParseException{
        System.out.println("/----Giao dich Dat----/");
        
        return super.xuat()  + "\nLoai dat: " + this.loaiDat + "\nThanh tien: " + getThanhTien();
    }

    @Override
    protected double getThanhTien() {
        boolean loop = true;
        double val = 0;

        while(loop){
            if(this.getLoaiDat().equalsIgnoreCase("b") || this.getLoaiDat().equalsIgnoreCase("c")){
                val = this.getDienTich() * this.getDonGia();
                loop = false;
            } else if(this.getLoaiDat().equalsIgnoreCase("a")){
                val = this.getDienTich() * this.getDonGia() * 1.5;
                loop = false;
            } else {
                loop = true;
            }
        }
        return val;
    }
}
