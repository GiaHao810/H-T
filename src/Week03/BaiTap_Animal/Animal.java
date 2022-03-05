package Week03.BaiTap_Animal;

public class Animal {
    //Attributes - thuoc tinh - state
    private String picture;
    private String food;
    private String hunger; //mức độ đói bụng ( 1 - 3 )

    //Methods - behaviors
    public String setAnimal(String picture){
        return this.picture = picture;
    }

    public String getAnimal(){
        return this.picture;
    }

    public String setFood(String food){
        return this.food = food;
    }

    public String getFood(){
        return this.food;
    }

    public String setHunger(String hunger){
        return this.hunger = hunger;
    }

    public String getHunger(){
        return this.hunger;
    }

    protected void makeNoice(){
        System.out.println(this.picture + " is making noise...");
    }

    protected void sleep(){
        System.out.println(this.picture + " is sleeping...");
    }

    protected void eat(){
        System.out.println(this.picture + " is eatting...");
    }

    protected void roam(){
        System.out.println(this.picture + " is roamming...");
    }
}
