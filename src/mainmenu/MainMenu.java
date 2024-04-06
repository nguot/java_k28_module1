package mainmenu;
import java.util.Scanner;

public class MainMenu {

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Đăng nhập");
        System.out.println("2.Tạo tài khoản");
        System.out.println("3.Thoát");
        int choice = 3;
        try
        {
            choice = scanner.nextInt();
        }catch (Exception e)
        {
            System.out.println("M k hiểu Tiếng việt à");
            System.exit(0);
        }

        switch (choice)
        {
            case 1 :
            {
                UserMainMenu.login();
            }
            case 2 :
            {
                UserMainMenu.register();
            }
            case 3 :
            {
                System.exit(0);
            }
        }
    }
}
