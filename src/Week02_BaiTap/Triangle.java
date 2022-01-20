package Week02_BaiTap;

public class Triangle {
    String soundFile;

    public Triangle(String soundFile){
        this.soundFile = soundFile;
    }

    void rotate(){
        System.out.println("Triangle rotating!");
        this.playSound();
    }

    void playSound(){
        System.out.println("Triangle playing sound: " + soundFile);
    }
}
