package Week05.BaiTap3;

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
        this.setLoaiVang(input.next());
    }

    @Override
    public double tinhThanhTien(int soLuong, double donGia) {
        return super.tinhThanhTien(soLuong, donGia);
    }

    @Override
    public String xuatDS() {
        System.out.println("-----------Danh sach Giao Dich Vang--------------");
        super.xuatDS();
        System.out.println("Thanh tien: " + this.tinhThanhTien(getSoLuong(), getDonGia()));
        return "Loai vang: " + this.loaiVang;
    }
}

