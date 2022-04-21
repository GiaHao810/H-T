package Courses.Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import ThiCuoiKy.HangHoa;

public class ReadingObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.
    FileInputStream inFile = new FileInputStream("Hao.text");

        //2.
    ObjectInputStream objIn = new ObjectInputStream(inFile);

        //3. Read Object stream
   List<HangHoa> list = (List) objIn.readObject();

   for (HangHoa hangThucPham : list) {
            System.out.println(hangThucPham);
   }

   objIn.close();
    }
}
