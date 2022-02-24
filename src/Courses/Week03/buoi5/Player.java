package Courses.Week03.buoi5;

import java.util.Random;

public class Player {
    int number = 0;

    public void guess() {
        Random rand = new Random(10);

        int randNumb = rand.nextInt(10);

        System.out.println("I'm guessing " + randNumb);

        number = randNumb;
    }
}
