package Week03.BaiTap_Animal;

public class Lion extends Animal{
    private String colorMane;

    public String setColorMane(String colorMane){
        return this.colorMane = colorMane;
    }

    public String getColorMane(){
        return this.colorMane;
    }

    @Override
    protected void roam(){
        System.out.println(getAnimal() + " is running!");
    }

    @Override
    protected void makeNoice(){
        System.out.println(getAnimal() + " is roarrrrrrrrr!");
    }
}
