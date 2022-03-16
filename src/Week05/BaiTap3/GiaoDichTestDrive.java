package Week05.BaiTap3;

import java.util.Scanner;

public class GiaoDichTestDrive {
    public static void main(String[] args) {
        ListGiaoDich dsGD = new ListGiaoDich();
        Scanner input = new Scanner(System.in);

        boolean loopCondtion = true;

        do {
            System.out.println("/---------------------/");
            System.out.println("1. Nhap Giao Dich Vang.");
            System.out.println("2. Nhap Giao Dich Tien Te.");
            System.out.println("3. Xuat cac Giao Dich.");
            System.out.println("0. Thoat.");
            System.out.println("/---------------------/");
            System.out.print("Nhap lua chon: ");
            int userOption = input.nextInt();
            
            switch (userOption) {
                case 0:
                    loopCondtion = false;
                    break;
                case 1:
                    dsGD.nhapGD(1);
                    break;
                case 2:
                    dsGD.nhapGD(2);
                    break;
                case 3:
                    dsGD.xuatGD();
                    break;
                default:
                    break;
            }
        } while (loopCondtion);

        input.close();
    }
}
