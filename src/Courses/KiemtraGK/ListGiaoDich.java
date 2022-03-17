package Courses.KiemtraGK;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ListGiaoDich {
    private GiaoDich[] dsGD = new GiaoDich[100];
    SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
    
    private int countGD = 0;
    private int slGDDat = 0;
    private int slGDNha = 0;
    private double avgGDD = 0;

    protected int getCountGD(){
        return countGD;
    }

    public void ListGD(){
        for(int i = 0; i < 100; i++){
            dsGD[i] = new GiaoDich(); 
        }
    }

    public void nhapGD(int loaiGD){
        if(countGD == 100){
            System.out.println("Du lieu da day!");
        } else {
            if(loaiGD == 1){
                dsGD[countGD] = new GDDat();
                GDDat gdDat = new GDDat();
                gdDat.nhapGD();
                dsGD[countGD] = gdDat;
                avgGDD += gdDat.getThanhTien();
                slGDDat++;

            } else {
                dsGD[countGD] = new GDNha();
                GDNha gdNha = new GDNha();
                gdNha.nhapGD();
                dsGD[countGD] = gdNha;
                slGDNha++;

            }
            countGD++;
        }
    }

    public void xuatGD() throws ParseException{
        for(int i = 0; i < countGD; i++){
            System.out.println(dsGD[i].xuat());
        }

        System.out.println("-----------------------");
        System.out.println("Tong so luong Giao Dich Dat: " + slGDDat);
        System.out.println("Tong so luong Giao Dich Nha: " + slGDNha);
        System.out.println("Trung binh thanh tien cua Giao Dich Dat: " + (avgGDD / countGD));
    }

    public void tinhNgay(){
        for(int i = 0; i < countGD; i++){
            sdf.format(dsGD[i].getNgayGD());
        }
    }
}
