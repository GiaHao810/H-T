package Courses.Outline.Random;

import java.util.Random;

public class Randomness {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int randomizedNum = rand.nextInt(9);

            char randomizedCharacter = (char) (rand.nextInt(26) + 'a');

            System.out.print(randomizedCharacter + "" + randomizedNum);
        } 
    }
}
