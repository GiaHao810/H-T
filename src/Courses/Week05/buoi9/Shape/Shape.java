package Courses.Week05.buoi9.Shape;

public abstract class Shape {
    protected int x,y;
    Shape(int _x, int _y){
        x = _x;
        y = _y;
    }

    public abstract void draw();
    public abstract void erase();
    public void moveTo(int _x, int _y){
        erase();
        x = _x;
        y = _y;
        draw();
    }
}
