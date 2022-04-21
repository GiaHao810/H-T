package ThiCuoiKy;

public class User {
    private String user;
    private String password;

    public User(){}
    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    /* 
        User_Data screenLogin = new User_Data();
        screenLogin.menuLogin();

        while (condition) {
            System.out.print("Nhap tai khoan: ");
            String userID = input.nextLine();
            System.out.print("Nhap mat khau: ");
            String password = input.nextLine();
            if(screenLogin.login(userID, password)){
                condition = false;
                System.out.println("System: Dang nhap thanh cong!");
            } else {
                System.out.println("Error: Sai thong tin dang nhap!");
            }
        }
    */
}
