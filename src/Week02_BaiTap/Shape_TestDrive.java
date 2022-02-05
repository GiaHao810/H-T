package Week02_BaiTap;

public class Shape_TestDrive {
    public static void main(String[] args) {
        Circle cirOb = new Circle("Vong tron");
        cirOb.rotate();

        Square squaOb = new Square("Hinh Vuong");
        squaOb.rotate();
        
        Triangle triOb = new Triangle("Hinh Tam Giac");
        triOb.rotate();

        Amoeba amoOb = new Amoeba("Amoeba", 5.5, 4.2);
        amoOb.rotate();
    }
}
