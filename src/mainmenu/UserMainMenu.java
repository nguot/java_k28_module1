package mainmenu;
import models.Customer;
import models.User;
import service.UserService;
import java.util.Scanner;
public class UserMainMenu {
    public static UserService user_service = new UserService();
    public static Scanner scanner = new Scanner(System.in);

    public static void login()
    {
        while(true)
        {
            System.out.println("Tên đăng nhập :");
            String user_name = scanner.nextLine();
            System.out.println("Mật Khẩu :");
            String password = scanner.nextLine();
            boolean check = user_service.checkLogin(user_name,password);

            if(check)
            {
                System.out.println("Đăng nhập thành công");
                choiceManagement();
            }
            else
            {
                System.out.println("Sai tên Đăng nhập hoặc Mật Khẩu");
            }
        }
    }
    public static void choiceManagement()
    {
        System.out.println("1.Quản lý Khách Hàng");
        System.out.println("2.Quản lý Phòng");
        switch (scanner.nextInt())
        {
            case 1 :
            {
                CustomerMainMenu.choiceManagement();
            }
            case 2 :
            {
                RoomMainMenu.choiceManagement();
            }
            default : {System.exit(0);}
        }
    }
    public static void register()
    {
        System.out.println("Tên đăng nhập mới :");
        String user_name = scanner.nextLine();
        System.out.println("Mật Khẩu mới :");
        String password = scanner.nextLine();
        User new_user = new User();
        new_user.user_name = user_name;
        new_user.password = password;
        user_service.addUser(new_user);
        login();
    }
}
