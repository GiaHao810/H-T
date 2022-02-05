package Week02_BaiTap;

public class Amoeba {
    String soundFile;
    double xPoint;
    double yPoint;

    public Amoeba(String soundFile){
        this.soundFile = soundFile;
    }

    public Amoeba(String soundFile, double xPoint, double yPoint){
        this(soundFile);
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    void rotate(){
        System.out.println("Triangle rotating with xPoint" + xPoint + " and yPoint" + yPoint);
        this.playSound();
    }

    void playSound(){
        System.out.println("Amoeba playing sound: " + soundFile);
    }
}
