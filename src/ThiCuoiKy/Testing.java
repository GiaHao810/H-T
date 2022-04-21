package ThiCuoiKy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testing {
    public static void main(String[] args) throws ParseException {
        User_Data user = new User_Data();
        
        while (true) {
            user.createUser();

        System.out.println(user.getSize());
        }
    }
}
