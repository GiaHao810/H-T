package ThiCuoiKy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) throws IOException {
        // BufferedWriter writer = new BufferedWriter(new FileWriter("data.text"));


        // writer.write("Halo halo halo");

        // writer.close();
        BufferedReader reader = new BufferedReader(new FileReader("data.text"));
        String line;
        while((line = reader.readLine()) != null){
            System.out.println(reader.readLine());
        }
        
        reader.close();
    }
}
