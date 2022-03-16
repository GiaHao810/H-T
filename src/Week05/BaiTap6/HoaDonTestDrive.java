package Week05.BaiTap6;

import java.util.Scanner;

public class HoaDonTestDrive {
    public static void main(String[] args) {
        ListHD dsHD = new ListHD();
        Scanner input = new Scanner(System.in);

        boolean loopCondtion = true;

        do {
            System.out.println("/---------------------/");
            System.out.println("1. Nhap Hoa Don Gio.");
            System.out.println("2. Nhap Hoa Don Ngay.");
            System.out.println("3. Xuat cac Hoa Don.");
            System.out.println("0. Thoat.");
            System.out.println("/---------------------/");
            System.out.print("Nhap lua chon: ");
            int userOption = input.nextInt();
            
            switch (userOption) {
                case 0:
                    loopCondtion = false;
                    break;
                case 1:
                    dsHD.nhapHD(1);
                    break;
                case 2:
                    dsHD.nhapHD(2);
                    break;
                case 3:
                    dsHD.xuatHD();
                    break;
                default:
                    break;
            }
        } while (loopCondtion);

        input.close();
    }
}