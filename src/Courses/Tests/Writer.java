package Courses.Tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("data.text"));

        writer.newLine();
        writer.newLine();

        writer.close();
        BufferedReader reader = new BufferedReader(new FileReader("data.text"));
        while((reader.readLine()) != null){
            System.out.println(reader.readLine());
        }
        
        reader.close();
    }
}
