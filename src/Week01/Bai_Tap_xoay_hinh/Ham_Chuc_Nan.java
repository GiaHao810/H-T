package Week01.Bai_Tap_xoay_hinh;

import java.util.Scanner;

import Week01.Bai_Tap_xoay_hinh.cac_vat_the.*;


public class Ham_Chuc_Nan {

    
    void menu(){
        Circle cir = new Circle();
        Square squa = new Square();
        Triangle tri = new Triangle();

        Scanner input = new Scanner(System.in);
            do{
                System.out.println("===========================================");
                System.out.println("[1] Hình Tròn");
                System.out.println("[2] Hình Vuông");
                System.out.println("[3] Hình Tam Giác");
                System.out.println("[0] Thoát");
                System.out.println("===========================================");
                System.out.print("Chọn: ");
                int key = input.nextInt();
                input.nextLine();
                switch(key){
                    case 1:
                        System.out.println("[1] Chọn Hình Tròn");
                        cir.hinh_tron.Xoay_Hinh();
                        break;
                    case 2: 
                        System.out.println("[2] Chọn Hình Vuông");
                        squa.hinh_vuong.Xoay_Hinh();
                        break;
                    case 3:
                        System.out.println("[3] Chọn Hình Tam Giác");
                        tri.hinh_tam_giac.Xoay_Hinh();
                        break;
                    case 0:
                        System.out.println("Chương trình kết thúc");
                        System.exit(0);
                        break;
                    
                    default:
                        System.out.println("Không có chức năng này");
                        break;
                    }
                    System.out.print("Quay tro ve MENU lua chon ?(y/n): ");
                }
                    while(input.nextLine().equalsIgnoreCase("y"));         
            }
        }


