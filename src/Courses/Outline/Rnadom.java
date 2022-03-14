package Courses.Outline;

import java.util.Random;

public class Rnadom {
    public static void main(String[] args) {
        Random rand = new Random();

        int random = rand.nextInt(2);
        System.out.print("Ket qua la: ");
        if(random == 0){
            System.out.println("1");
        } else if(random == 1){
            System.out.println("2");
        }
    }
}
