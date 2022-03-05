package Week02_BaiTap_Shape;

public class Square {
    private String soundFile;

    public Square(String soundFile){
        this.soundFile = soundFile;
    }

    void rotate(){
        System.out.println("Square rotating!");
        this.playSound();
    }

    void playSound(){
        System.out.println("Square playing sound: " + soundFile);
    }
}
