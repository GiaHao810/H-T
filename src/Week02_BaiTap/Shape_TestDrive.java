package Week02_BaiTap;

public class Shape_TestDrive {
    public static void main(String[] args) {
        Circle cirOb = new Circle();
        Square squaOb = new Square();
        Triangle triOb = new Triangle();

        cirOb.soundFile = "hinhtron.aif";
        squaOb.soundFile = "hinhvuong.aif";
        triOb.soundFile = "hinhtamgiac.aif";

        cirOb.playSound();
        cirOb.rotate();

        squaOb.playSound();
        squaOb.rotate();

        triOb.playSound();
        triOb.rotate();
    }
}
