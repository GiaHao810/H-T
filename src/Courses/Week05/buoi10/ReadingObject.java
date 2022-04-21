package Courses.Week05.buoi10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import Week04.BaiTap_HangThucPham.HangThucPham;

public class ReadingObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream inFile = new FileInputStream("data.dat");

        ObjectInputStream objIn = new ObjectInputStream(inFile);

        HangThucPham htp = (HangThucPham)objIn.readObject();
        HangThucPham htp2 = (HangThucPham)objIn.readObject();

        System.out.println(htp);
        System.out.println(htp2);

        objIn.close();
    }
}
