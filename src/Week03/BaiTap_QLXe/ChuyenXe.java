package Week03.BaiTap_QLXe;

import java.util.Scanner;

public class ChuyenXe {
    private String maSoChuyen;
    private String hoTenTX;
    private String bienSoXe;
    private double doanhThu;

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenTX() {
        return hoTenTX;
    }

    public void setHoTenTX(String hoTenTX) {
        this.hoTenTX = hoTenTX;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    Scanner input = new Scanner(System.in);

    protected void nhapChuyenXe() {
        System.out.println("------------------Nhap thong tin-----------------");
        System.out.print("Ma so chuyen: ");
        setMaSoChuyen(input.nextLine());

        System.out.print("Ho ten tai xe: ");
        setHoTenTX(input.nextLine());

        System.out.print("So xe: ");
        setBienSoXe(input.nextLine());

        System.out.print("Doanh thu: ");
        setDoanhThu(input.nextInt());
    }

    public void xuatChuyenXe(){
        System.out.println("------------------Thong tin chuyen xe-----------------");
        System.out.println("Ma so chuyen: " + getMaSoChuyen());
        System.out.println("Ho ten tai xe: " + getHoTenTX());
        System.out.println("So xe: " + getBienSoXe());
        System.out.println("Doanh thu: " + getDoanhThu());
    }

    public ChuyenXe(){}

    public ChuyenXe(String maSoChuyen, String hoTenTX, String bienSoXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTX = hoTenTX;
        this.bienSoXe = bienSoXe;
        this.doanhThu = doanhThu;
    }

    @Override
    public String toString() {
        return "ChuyenXe [bienSoXe=" + bienSoXe + ", doanhThu=" + doanhThu + ", hoTenTX=" + hoTenTX +
                ", maSoChuyen=" + maSoChuyen + "]";
    }

    
}
