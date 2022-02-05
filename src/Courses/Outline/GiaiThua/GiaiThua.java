package Courses.Outline.GiaiThua;

import java.util.Scanner;

public class GiaiThua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap X: ");
        long X = input.nextLong();

        System.out.println("Giai thua cua " + X + " = " + tinhGiaiThua(X));

        input.close();
    }

    public static long tinhGiaiThua(long X){
        if(X > 0){
            return X * tinhGiaiThua(X - 1);
        } else {
            return 1;
        }
    }
}
