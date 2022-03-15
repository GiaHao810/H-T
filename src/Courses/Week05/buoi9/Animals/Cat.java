package Courses.Week05.buoi9.Animals;

public class Cat extends Feline implements Pet{
    
    protected void makeNoise() {
        System.out.println("Cat is making cat noise");
    }

    protected void eat() {
        System.out.println("Cat is eatting");
    }

    @Override
    public void beFriendly() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        
    }
}
