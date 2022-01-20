package Courses.Outline.Quay_Thuong;

import java.util.Random;
import java.util.Scanner;

public class Data_Quay_Thuong {
    String name_User;
    int id_User;
    int soLuong_luot;

    int codeW = 99;

    Scanner input = new Scanner(System.in);

    void user(String name_User, int id_User, int soLuong_luot){
        this.id_User = id_User;
        this.id_User = id_User;
        this.soLuong_luot = soLuong_luot;
    }

    int xoay_thuong(){
        if(nhap_ma() == 0){
            System.exit(0);
        }
        if(soLuong_luot < 0){
            System.out.println("Khong du luot!");
        }

        Random rand = new Random();

        int soquaythuong = rand.nextInt(4);

        if(soquaythuong == 0){
            System.out.println("Da trung giai 0");
        } else if(soquaythuong == 1){
            System.out.println("Da trung giai 1");
        } else if(soquaythuong == 2){
            System.out.println("Da trung giai 2");
        } else if(soquaythuong == 3){
            System.out.println("Da trung giai 3");
        } else if(soquaythuong == 4){
            System.out.println("Da trung giai 4");
        }

        return soquaythuong;
    }

    int nhap_ma(){
        System.out.print("Nhap ma: ");
        int code = input.nextInt();

        if(code == codeW){
            return 1;
        } else {
            System.out.println("Ma khong hop le!");
            return 0;
        }
    }
}
