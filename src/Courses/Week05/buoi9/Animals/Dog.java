package Courses.Week05.buoi9.Animals;

public class Dog extends Canine implements Pet{
    protected void makeNoise() {
        System.out.println("Dog is making dog noise");
    }

    protected void eat() {
        System.out.println("Dog is eatting");
    }

    @Override
    public void beFriendly() {
        
    }

    @Override
    public void play() {
        
    }

    
}
