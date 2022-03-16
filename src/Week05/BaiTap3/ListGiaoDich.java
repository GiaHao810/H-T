package Week05.BaiTap3;

public class ListGiaoDich {
    GiaoDich[] GD = new GiaoDich[100];
    private int countGD = 0;
    private int slGDV = 0;
    private int slGDTT = 0;
    private double sumAvg = 0;

    public void ListGD(){
        for(int i = 0; i < 100; i++){
            GD[i] = new GiaoDich();
        }
    }

    public void nhapGD(int loaiGD){
        if(countGD == 100){
            System.out.println("Drive is full!");
        } else {
            if(loaiGD == 1){
                GD[countGD] = new GDVang();
                GDVang gdVang = new GDVang();
                gdVang.nhapGD();
                slGDV += gdVang.getSoLuong();
                sumAvg += gdVang.getThanhTien();
            } else {
                GD[countGD] = new GDTienTe();
                GDTienTe gdTienTe = new GDTienTe();
                gdTienTe.nhapGD();
                slGDTT += gdTienTe.getSoLuong();
                sumAvg += gdTienTe.getThanhTien();
            }
            countGD++;
        }
    }

    public void xuatGD(){
        for(int i = 0; i < countGD; i++){
            System.out.println("/-------------------/");
            System.out.println(GD[i].xuatDS());
        }
        System.out.println("_______________________________");
        System.out.println("So luong Giao Dich Vang: " + slGDV);
        System.out.println("So luong Giao Dich Tien Te: " + slGDTT);
        System.out.println("Thanh tien Trung Binh: " + (sumAvg / countGD));
    }
}
