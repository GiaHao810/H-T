package ThiCuoiKy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User_Data extends User{

    public User_Data(String user, String password) {
        super(user, password);
        //TODO Auto-generated constructor stub
    }

    public User_Data() {
	}

	Scanner input = new Scanner(System.in);
    List<User> listUser = new ArrayList<>();

    public int getSize(){
        for (User user : listUser) {
            System.out.println(user.getUser());
            System.out.println(user.getPassword());
        }
        return listUser.size();
    }
    public void createUser(){
        boolean check = true;
        boolean isDone = true;

        do {
            System.out.print("Nhap tai khoan: ");
            String user_ID = input.next();
            System.out.print("Nhap mat khau: ");
            String password = input.next();

            User user_Add = new User(user_ID, password);

            for (User user2 : listUser) {
                if(user2.getUser() == user_ID){
                    check = false;
                    break;
                }
            }

            if(check){
                listUser.add(user_Add);
                System.out.println("System: Tao nguoi dung thanh cong!");
                isDone = false;
            } else {
                System.out.println("Error: Ten nguoi dung da duoc su dung!");
            }
        } while (isDone);
    }

    public boolean login(String userID, String password){
        boolean result = false;

        for (User user : listUser) {
            if(user.getUser() == userID && user.getPassword() == password){
                result = true;
                break;
            }
        }

        return result;
    }

    public void menuLogin(){
        System.out.println("1. Dang nhap");
        System.out.println("2. Tao nguoi dung");
        System.out.print("-   Lua chon: ");
        int key = input.nextInt();
        boolean condition = true;

        do {
            switch (key) {
                case 1:
                    condition = false;
                    break;
                case 2:
                    createUser();
                    condition = false;
                    break;
                default:
                    break;
            }
        } while (condition);
    }
}
