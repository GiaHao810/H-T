package Week05.BaiTap3;

import java.sql.Date;

public class GDTienTe extends GiaoDich{
    private double tiGia;
    private int loaiTienTe; //1. USD 2. Euro 3. VN
    private double thanhTien;

    
    public double getTiGia() {
        return tiGia;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    public int getLoaiTienTe() {
        return loaiTienTe;
    }

    public void setLoaiTienTe(int loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
    }

    public GDTienTe(){}

    public GDTienTe(String maGD, String ngayGD, double donGia, int soLuong, double tiGia, int loaiTienTe) {
        super(maGD, ngayGD, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }

    @Override
    public void nhapGD() {
        super.nhapGD();
        System.out.print("Nhap ti gia: ");
        setTiGia(input.nextDouble());
        System.out.println("1. USD / 2. Euro / 3. VN");
        System.out.print("Nhap loai tien te: ");
        setLoaiTienTe(input.nextInt());

    }
    @Override
    public double tinhThanhTien(int soLuong, double donGia) {
        if(loaiTienTe == 1 & loaiTienTe == 2){
            thanhTien = super.tinhThanhTien(soLuong, donGia) * tiGia;
        } else {
            thanhTien = super.tinhThanhTien(soLuong, donGia);
        }

        return thanhTien;
    }
}
