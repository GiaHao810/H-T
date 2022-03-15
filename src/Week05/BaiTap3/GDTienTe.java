package Week05.BaiTap3;

import java.sql.Date;

public class GDTienTe extends GiaoDich{
    private double tiGia;
    private int loaiTienTe; //1. USD 2. Euro 3. VN
    private double thanhTien;

    public GDTienTe(){}

    public GDTienTe(String maGD, Date ngayGD, double donGia, int soLuong, double tiGia, int loaiTienTe) {
        super(maGD, ngayGD, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
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
