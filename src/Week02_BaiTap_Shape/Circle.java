package Week02_BaiTap_Shape;

public class Circle {
    //Attribute
    private String soundFile;

    //Method
    public Circle(String soundFile){
        this.soundFile = soundFile;
    }

    void rotate(){
        System.out.println("Circle rotating!");
        this.playSound();
    }

    void playSound(){
        System.out.println("Circle playing sound: " + soundFile);
    }
}
