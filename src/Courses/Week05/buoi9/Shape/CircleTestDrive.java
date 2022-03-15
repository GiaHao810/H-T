package Courses.Week05.buoi9.Shape;

public class CircleTestDrive {
    public static void main(String[] args) {
        Circle circleA = new Circle(5, 7, 10);

        circleA.draw();
        circleA.erase();

        System.out.println("Circle Move");
        circleA.moveTo(20, 60);
    }
}
