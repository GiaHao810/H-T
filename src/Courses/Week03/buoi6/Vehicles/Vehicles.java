package Courses.Week03.buoi6.Vehicles;

import java.util.Scanner;

public class Vehicles {
    Scanner input = new Scanner(System.in);

    //Attributes
    private String tenChuxe;
    private String loaiXe;
    private int dungTich;
    private double triGia;
    private double thueXe;

    //Contrucstor
    public Vehicles(){}

    public Vehicles(String tenChuxe, String loaiXe, int dungTich, double triGia, double thueXe){
        this.tenChuxe = tenChuxe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
        this.thueXe = thueXe;
    }

    //Methods
    public String getTenchuxe(){
        return this.tenChuxe;
    }

    public String setTenchuxe(String tenChuxe){
        return this.tenChuxe = tenChuxe;
    }

    public String getLoaixe(){
        return this.loaiXe;
    }

    public String setLoaixe(String loaiXe){
        return this.loaiXe = loaiXe;
    }

    public int getDungtich(){
        return this.dungTich;
    }

    public int setDungtich(int dungTich){
        return this.dungTich = dungTich;
    }

    public double getTrigia(){
        return this.triGia;
    }

    public double setTrigia(double triGia){
        return this.triGia = triGia;
    }

    public double getThuexe(){
        return this.thueXe;
    }

    public double setThuexe(double thueXe){
        return this.thueXe = thueXe;
    }

    public double tinhTienthue(){
        double tienThue = 0;

        if(this.dungTich < 100){
            tienThue = this.triGia * (1/100);
        } else if(this.dungTich >= 100 & this.dungTich < 200){
            tienThue = this.triGia * (3/100);
        } else if(this.dungTich >= 200){
            tienThue = this.triGia * (5/100);
        }

        return tienThue;
    }

    public void nhapThongtin(){
        System.out.print("Nhap ten Chu Xe: ");
        setTenchuxe(input.nextLine());
        System.out.print("Nhap loai xe: ");
        setLoaixe(input.nextLine());
        System.out.print("Nhap dung tich xi-lanh: ");
        setDungtich(input.nextInt());
        System.out.print("Nhap tri gia: ");
        setTrigia(input.nextDouble());
    }


    public String xuatThongtin(){
        String string = this.tenChuxe + "\t\t" + this.loaiXe + "\t" + this.triGia + "\t" + this.thueXe;

        return string;
    }
}
