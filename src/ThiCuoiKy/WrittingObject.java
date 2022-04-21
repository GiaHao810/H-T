package ThiCuoiKy;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;


public class WrittingObject {
    public static void main(String[] args) throws IOException {
        //1.
        FileOutputStream outFile = new FileOutputStream("Hao.text");

        //2.
        ObjectOutputStream objOut = new ObjectOutputStream(outFile);

        //HangThucPham
         HangHoa sanpham1 = new HangThucPham("A01" ,"trung ", 35, 35_0 , new Date() , new Date() , " êfffff");
         HangHoa sanpham2 = new HangThucPham("A02" ,"trung ", 35, 35_0 , new Date() , new Date() , " êfffff");
         HangHoa sanpham3 = new HangThucPham("A03" ,"trung ", 35, 35_0 , new Date() , new Date() , " êfffff");
        //3.
        objOut.writeObject(sanpham1);
        objOut.writeObject(sanpham2);

        System.out.println(sanpham1);

        //4. 
        objOut.close();
    }
    
}

