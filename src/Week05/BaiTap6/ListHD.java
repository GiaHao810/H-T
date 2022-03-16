package Week05.BaiTap6;

public class ListHD {
    HoaDon[] HD = new HoaDon[100];
    private int countGD = 0;
    private int slPTG = 0;
    private int slPTN = 0;

    public void ListHDL(){
        for(int i = 0; i < 100; i++){
            HD[i] = new HoaDon();
        }
    }

    public void nhapHD(int loaiGD){
        if(countGD == 100){
            System.out.println("Drive is full!");
        } else {
            if(loaiGD == 1){
                HD[countGD] = new HoaDonTheoGio();
                HoaDonTheoGio hdGio = new HoaDonTheoGio();
                hdGio.nhapHD();
                slPTG++;
            } else {
                HD[countGD] = new HoaDonTheoNgay();
                HoaDonTheoNgay gdTienTe = new HoaDonTheoNgay();
                gdTienTe.nhapHD();
                slPTN++;
            }
            countGD++;
        }
    }

    public void xuatHD(){
        for(int i = 0; i < countGD; i++){
            System.out.println("/-------------------/");
            HD[i].xuatHD();
        }
        System.out.println("_______________________________");
        System.out.println("So luong Giao Dich Vang: " + slPTG);
        System.out.println("So luong Giao Dich Tien Te: " + slPTN);
    }
}
