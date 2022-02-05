package Courses.Outline;

import java.util.Random;

public class Rnadom {
    public static void main(String[] args) {
        Random rand = new Random();

        int random = rand.nextInt(3);

        if(random == 0){
            System.out.println("Hen xui");
        } else if(random == 1){
            System.out.println("Kô");
        } else if(random == 2){
            System.out.println("Kó");
        }
    }
}
