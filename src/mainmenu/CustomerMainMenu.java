package mainmenu;
import models.Customer;
import models.Room;
import service.CustomerService;

import java.util.Scanner;

public class CustomerMainMenu {
    public static Scanner scanner = new Scanner(System.in);
    public static void choiceManagement()
    {
        System.out.println("1.In ra danh sách khách hàng");
        System.out.println("2.Lưu lại thông tin khách hàng");
        System.out.println("3.Xóa thông tin khách hàng");
        System.out.println("4.Thêm thông tin khách hàng mới");

        int choice = scanner.nextInt();
        CustomerService customer_service = new CustomerService();

        switch (choice)
        {
            case 1 :
            {
                customer_service.printList();
            }
            case 2 :
            {
                System.out.println("Nhập id khách hàng :");
                int id = scanner.nextInt();
                Room new_room = new Room();
                System.out.println("Nhập số phòng mới :");
                new_room.id = scanner.nextInt();
                System.out.println("Nhập số phòng ngủ của phòng mới :");
                new_room.bedrooms = scanner.nextInt();
                System.out.println("Nhập thời gian thuê phòng mới :");
                new_room.time = scanner.nextInt();
                System.out.println("Nhập giá thuê phòng mới :");
                new_room.price = scanner.nextInt();

                customer_service.updateById(id,new_room);
            }
            case 3 :
            {
                System.out.println("Nhập id khách hàng :");
                int id = scanner.nextInt();
                customer_service.delete(id);
            }
            case 4 :
            {
                Customer new_customer = new Customer();

                System.out.println("Nhập tên khách hàng mới :");
                new_customer.name = scanner.nextLine();

                System.out.println("Nhập số phòng mới :");
                new_customer.customer_room.id = scanner.nextInt();
                System.out.println("Nhập số phòng ngủ của phòng mới :");
                new_customer.customer_room.bedrooms = scanner.nextInt();
                System.out.println("Nhập thời gian thuê phòng mới :");
                new_customer.customer_room.time = scanner.nextInt();
                System.out.println("Nhập giá thuê phòng mới :");
                new_customer.customer_room.price = scanner.nextInt();

                customer_service.add(new_customer);
            }
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
        UserMainMenu.choiceManagement();
    }
}
