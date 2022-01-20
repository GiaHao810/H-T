package Week02_BaiTap;

public class Square {
    String soundFile;

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
