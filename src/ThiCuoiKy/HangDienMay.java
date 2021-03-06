package ThiCuoiKy;

public class HangDienMay extends HangHoa{
    private int tGbaoHanh;
    private double congSuat;
    private double VAT = 0.1;

    public HangDienMay(){}

    public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia, int tGbaoHanh,
            double congSuat) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.tGbaoHanh = tGbaoHanh;
        this.congSuat = congSuat;
    }
    public double getVAT() {
        return VAT;
    }
    public int gettGbaoHanh() {
        return tGbaoHanh;
    }
    public void settGbaoHanh(int tGbaoHanh) {
        while(getLoop()){
            if(tGbaoHanh < 0){
                System.out.println("Warning: Thoi gian bao hanh phai la 1 thang tro len!");
            } else {
                this.tGbaoHanh = tGbaoHanh;
                setLoop(false);
            }
        }
    }
    public double getCongSuat() {
        return congSuat;
    }
    public void setCongSuat(double congSuat) {
        while (getLoop()) {
            if(congSuat <= 0){
                System.out.println("Warning: Cong suat khong duoc nho hon hoac bang 0!");
            } else {
                this.congSuat = congSuat;
                setLoop(false);
            }
        }
    }
    @Override
    public String toString() {
        return super.toString() + "\tThoi gian bao hanh: " + gettGbaoHanh() + "\tCong suat: " + getCongSuat();
    }
    @Override
    public String getDanhGia() {
        String danhGia = "Khong co danh gia";
        if(getSoLuongTon() < 3){
            danhGia = "Ban duoc";
        }
        return danhGia;
    }
}
