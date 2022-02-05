package Courses.Outline.Multiply;

import java.util.ArrayList;

public class BoiSo_Array {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int X = 10; X <= 200; X++){
            if(X % 7 == 0 && X % 5 != 0){
                arr.add(X);
            }
        }

        showList(arr);
    }

    public static void showList(ArrayList<Integer> arr){
        if(!arr.isEmpty() && arr != null){
            for(int i = 0; i < arr.size() - 1; i++){
                System.out.print(arr.get(i) + ", ");
            }
            System.out.println(arr.get(arr.size() - 1));
        }
        
    }
}
