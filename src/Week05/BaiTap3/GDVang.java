package Week05.BaiTap3;

import java.sql.Date;

public class GDVang extends GiaoDich{

    private String loaiVang;

    public GDVang(){}

    public GDVang(String maGD, Date ngayGD, double donGia, int soLuong, String loaiVang) {
        super(maGD, ngayGD, donGia, soLuong);
        this.loaiVang = loaiVang;
    }
    
    @Override
    public double tinhThanhTien(int soLuong, double donGia) {
        return super.tinhThanhTien(soLuong, donGia);
    }
}

