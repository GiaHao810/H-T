package Week03.BaiTap_QLXe;

public class Xe_NgoaiThanh extends Vehicles_Infomation{
    private int trip_Code;
    private String driver_Name;
    private String license_Plate;
    private Double total_Revenue;
    private String noi_Den;
    private int ngay_Diduoc;

    protected void nhap_chuyen_xe() {
        System.out.print("Ma so chuyen: ");
        this.trip_Code = input.nextInt();

        System.out.print("Ho ten tai xe: ");
        this.driver_Name = input.nextLine();

        System.out.print("So xe: ");
        this.license_Plate = input.nextLine();

        System.out.print("So tuyen: ");
        this.noi_Den = input.nextLine();

        System.out.print("So km di duoc: ");
        this.noi_Den = input.nextLine();

        System.out.print("Doanh thu: ");
        this.ngay_Diduoc = input.nextInt();
    }

    public void xuat_chuyen_xe(){
        System.out.println("Ma so chuyen: " + this.trip_Code);
        System.out.println("Ho ten tai xe: " + this.driver_Name);
        System.out.println("So xe: " + this.license_Plate);
        System.out.println("Doanh thu: " + this.total_Revenue);
    }
}
