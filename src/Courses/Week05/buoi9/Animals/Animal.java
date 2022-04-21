package Courses.Week05.buoi9.Animals;

public abstract class Animal {
    protected abstract void makeNoise();

    protected void roam() {
        System.out.println("roaming...");
    }

    protected void sleep() {
        System.out.println("sleeping...");
    }

    protected abstract void eat(); // Phương thức abstract này giống như hợp đồng ràng buộc lớp con. Nếu muốn lớp Animal làm lớp cha thì lớp con cần phải ghi đè phương thức eat(); 
}
