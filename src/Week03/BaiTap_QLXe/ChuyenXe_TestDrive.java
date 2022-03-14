package Week03.BaiTap_QLXe;

import java.util.Scanner;

public class ChuyenXe_TestDrive {
    public static void main(String[] args) {
        Boolean loopCondition = true;
        
        Scanner input = new Scanner(System.in);
        ListChuyenXe dsCX = new ListChuyenXe();

        do {
            System.out.println("----------------------------");
            System.out.println("1. Nhap chuyen xe Noi thanh.");
            System.out.println("2. Nhap chuyen xe Ngoai thanh.");
            System.out.println("3. Xuat danh sach chuyen xe.");
            System.out.println("0. Thoat chuong trinh.");
            System.out.println("----------------------------");
            System.out.print("Choose: ");
            int userSelect = input.nextInt();
            switch (userSelect) {
                case 0:
                    loopCondition = false;
                    break;
                case 1:
                    dsCX.nhapDSXe(1);
                    break;
                case 2:
                    dsCX.nhapDSXe(2);
                    break;
                case 3:
                    dsCX.xuatDSXe();
                    break;
                default:
                    break;
            }
        } while (loopCondition);
    }
}
