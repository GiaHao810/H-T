package Courses.Week03.buoi6.Shape;

public class Shape_TestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle();   
        circle.setSoundFile("Circles");
        circle.rotate();
        circle.playSound();

        Square square = new Square();
        square.setSoundFile("Squares");
        square.rotate();
        square.playSound();

        Triangle triangle = new Triangle();
        triangle.setSoundFile("Trianglés");
        triangle.rotate();
        triangle.playSound();

        Amoeba amoeba = new Amoeba();
        amoeba.setxPoint(5);
        amoeba.setyPoint(6);
        amoeba.setSoundFile("Amoeba");
        amoeba.rotate();
        amoeba.playSound();
    }
}
