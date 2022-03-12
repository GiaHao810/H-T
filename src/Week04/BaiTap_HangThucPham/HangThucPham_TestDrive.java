package Week04.BaiTap_HangThucPham;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class HangThucPham_TestDrive {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sDF = new SimpleDateFormat("dd/MM/yyyy");

        String ngaySX = "20/01/2022";
        String ngayHetHan = "15/04/2022";
        
        HangThucPham htp = new HangThucPham("TP01", "Mi Hao Hao", 8000, sDF.parse(ngayHetHan), sDF.parse(ngaySX));

        System.out.println(htp);
    }
}
