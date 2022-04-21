package Courses.Tests;

import java.text.ParseException;

public class Testing {
    public static void main(String[] args) throws ParseException {
        User_Data user = new User_Data();
        
        while (true) {
            user.createUser();

        System.out.println(user.getSize());
        }
    }
}
