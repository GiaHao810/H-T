package Courses.Week03.buoi6.Vehicles;

import java.util.Scanner;

public class Vehicles_TestDrive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loopCond = true;

        Vehicles xe1;
        Vehicles xe2;
        Vehicles xe3;

        xe1 = new Vehicles();
        xe2 = new Vehicles();
        xe3 = new Vehicles();

        do {
            System.out.println("1. Nhap thong tin moi");
            System.out.println("2. Xuat bang ke khai tien thue truoc ba cua cac xe");
            System.out.println("0. Thoat");

            switch (input.nextInt()) {
                case 1:
                    xe1.nhapThongtin();
                    xe2.nhapThongtin();
                    xe3.nhapThongtin();

                    break;
                case 2:
                    System.out.println("Ten chu xe \t\tLoai xe\tDung tich\tTri gia\tThue phai nop");
                    System.out.println("===============================================================================");

                    xe1.xuatThongtin();
                    xe2.xuatThongtin();
                    xe3.xuatThongtin();
                    break;
                case 0:
                    loopCond = false;
                    break;
                default:
                    break;
            }
        } while (loopCond);

        input.close();
    }
}
