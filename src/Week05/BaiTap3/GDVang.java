package Week05.BaiTap3;

import java.sql.Date;

public class GDVang extends GiaoDich{

    private String loaiVang;

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public GDVang(){}

    public GDVang(String maGD, String ngayGD, double donGia, int soLuong, String loaiVang) {
        super(maGD, ngayGD, donGia, soLuong);
        this.loaiVang = loaiVang;
    }
    
    public void nhapGD(){
        super.nhapGD();
        System.out.print("Nhap loai Vang: ");
        setLoaiVang(input.next());
    }

    @Override
    public double tinhThanhTien(int soLuong, double donGia) {
        return super.tinhThanhTien(soLuong, donGia);
    }

    
}

