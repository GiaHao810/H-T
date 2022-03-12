package Courses.Week03.buoi6.Thegioidongvat;

public class Animal {

    //Attributes - thuoc tinh - state
    private String picture;
    private String food;
    private String hunger; //mức độ đói bụng ( 1 - 3 )

    //Methods - behaviors
    protected void makeNoice(){
        System.out.println("is making noise...");
    }

    protected void sleep(){
        System.out.println("is sleeping...");
    }

    protected void eat(){
        System.out.println("is eatting...");
    }

    protected void roam(){
        System.out.println("is roamming...");
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getHunger() {
        return hunger;
    }

    public void setHunger(String hunger) {
        this.hunger = hunger;
    }
    
    
}
