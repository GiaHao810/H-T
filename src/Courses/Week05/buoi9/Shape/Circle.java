package Courses.Week05.buoi9.Shape;

public class Circle extends Shape{
    private int radius; //Độ
    public Circle(int _x, int _y, int _r){
        super(_x, _y);
        radius = _r;
    }

    public void draw() {
        System.out.println("Draw circle at " + x + ", " + y);
    }

    public void erase() {
        System.out.println("Erase circle at " + x + ", " + y);
    }
}
