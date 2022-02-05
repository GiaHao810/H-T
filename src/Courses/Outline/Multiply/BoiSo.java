package Courses.Outline.Multiply;

public class BoiSo {
    public static void main(String[] args) {
        // X Chia het cho 7 - X khong phai boi so cua 5 (X % 5 = 1)

        for(int X = 10; X <= 200; X++){
            if(X % 7 == 0 && X % 5 != 0){
                    System.out.print(X + ", ");
            }
        }
    }
}
