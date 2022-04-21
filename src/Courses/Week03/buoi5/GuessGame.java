package Courses.Week03.buoi5;

import java.util.Random;

public class GuessGame {
    
    //attribute
    private Player p1;
    private Player p2;
    private Player p3;


    //methods
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int p1Guess = 0;
        int p2Guess = 0;
        int p3Guess = 0;

        boolean loopCond = true;

        Random rand = new Random(10);

        int targetNumb = rand.nextInt(10);

        System.out.println("The right number is: " + targetNumb);
        
        while(loopCond){
            p1.guess();
            p1Guess = p1.number;
            if(p1Guess == targetNumb){
                System.out.println("Player 1 have the right answer!");
            }
            
            
            p2.guess();
            p2Guess = p2.number;
            if(p2Guess == targetNumb){
                System.out.println("Player 2 have the right answer!");
            }
            
            
            p3.guess();
            p3Guess = p3.number;
            if(p3Guess == targetNumb){
                System.out.println("Player 3 have the right answer!");
            }
            loopCond = false;
        }
    }
}
