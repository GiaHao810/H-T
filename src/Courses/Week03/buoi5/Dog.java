package Courses.Week03.buoi5;

public class Dog {
    
    //attribute - data

    //Implementation: private - không cho phép truy cập
    private int size;

    //Mặc định là default
    String name;
    String breed;

    //methods
    //interface
    public void setSize(int size) {
        if(size > 0){
            this.size = size;
        } else {
            System.out.println("Size khong hop le!");
        }
    }

    public int getSize(){
        return this.size;
    }
}
