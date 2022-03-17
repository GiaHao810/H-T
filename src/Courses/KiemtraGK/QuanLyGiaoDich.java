package Courses.KiemtraGK;

import java.text.ParseException;
import java.util.Scanner;

public class QuanLyGiaoDich {
    public static void main(String[] args) throws ParseException{
        Scanner input = new Scanner(System.in);
        boolean loopCond = true;

        
        ListGiaoDich dsGD = new ListGiaoDich();

        do{
            System.out.println("/-------Menu--------/");
            System.out.println("0. Thoat.");
            System.out.println("1. Nhap Giao Dich Dat.");
            System.out.println("2. Nhap Giao Dich Nha.");
            System.out.println("3. Xuat cac Giao Dich.");
            System.out.print("Nhap lua chon: ");
            int userOption = input.nextInt();

            switch (userOption) {
                case 0:
                    loopCond = false;
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
                case 4:
                    
                    break;
                default:
                    break;
            }
        }while(loopCond);


        input.close();
    }
}
