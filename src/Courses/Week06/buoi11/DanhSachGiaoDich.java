package Courses.Week06.buoi11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class DanhSachGiaoDich {
    List<GiaoDich> danhSach = new ArrayList<>();

    SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");

    private int soLuongGiaoDichDat;
    private int soLuongGiaoDichNha;

    public void them(GiaoDich themGiaoDich){
        danhSach.add(themGiaoDich);
    }

    public void inDanhSach(){
        for(GiaoDich giaoDich : danhSach){
            System.out.println(giaoDich);
        }
    }

    public void tinhTongSLTungLoai(){
        for (GiaoDich giaoDich : danhSach) {
            if(giaoDich instanceof GiaoDichDat){
                this.soLuongGiaoDichDat++;
            } else {
                this.soLuongGiaoDichNha++;
            }
        }
        System.out.println("So luong Giao Dich Dat: " + this.soLuongGiaoDichDat);
        System.out.println("So luong Giao Dich Nha: " + this.soLuongGiaoDichNha);
    }

    public double tinhTongTBDat(){
        double val = 0;
        int count = 0; //Dùng để đếm số lượng

        for (GiaoDich giaoDich : danhSach) {
            if(giaoDich instanceof GiaoDichDat){
                val += giaoDich.tinhTien();
                count++;
            }
        }
        return val/count;
    }

    public void xuatGDcua9thang3() throws ParseException{
        String ngayChuan = "09/2013";

        for (GiaoDich giaoDich : danhSach) {
            if(sdf.format(giaoDich.getNgayGiaoDich()).contains(ngayChuan)){
                System.out.println(giaoDich.toString());
            }
        }
    }
}
