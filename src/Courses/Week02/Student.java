package Courses.Week02;

public class Student {
    boolean gioiTinh;
    float tuoi;
    String name;
    String khoa;
    double diemTB;

    //method - functions - behavior
    //constructor
    public Student(){
        this.name = "Tuan";
        this.tuoi = 20;
        this.gioiTinh = false;
        this.khoa = "CNTT";
        this.diemTB = 4.5;
    }

    public Student(String name, float tuoi){
        this.name = name;
        this.tuoi = tuoi;
    }

    public Student(boolean gioiTinh, float tuoi, String name, String khoa, double diemTB){
        
        this(name, tuoi); //Gọi hàm tạo 2 tham số // Phải được đặt ở dòng đầu tiên

        this.diemTB = diemTB;
        this.khoa = khoa;
        this.gioiTinh = gioiTinh;
    }

    void inThongTin(){
        
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Diem Trung Binh: " + diemTB);
        System.out.println("Khoa: " + khoa);
        System.out.print("Gioi Tinh: ");
        if(gioiTinh){
            System.out.println("Nu");
        } else {
            System.out.println("Nam");
        }
    }
    
    void hoc(){
        System.out.println(name + " " + tuoi + " tuoi" + " dang hoc");
    }
}
