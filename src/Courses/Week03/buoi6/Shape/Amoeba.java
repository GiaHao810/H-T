package Courses.Week03.buoi6.Shape;

public class Amoeba extends Shape {
    private double xPoint;
    private double yPoint;

    public void setxPoint(double xPoint){
        this.xPoint = xPoint;
    }

    public void setyPoint(double yPoint){
        this.yPoint = yPoint;
    }

    @Override
    void rotate(){
        System.out.println("Rotating 360 at xPoint: " + this.xPoint + " yPoint: " + this.yPoint);
    }

    @Override
    void playSound(){
        System.out.println("Play file .hif " + this.getSoundFile() + " music");
    }
}
