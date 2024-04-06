package mainmenu;
import models.Customer;
import models.Room;
import java.util.Scanner;

import service.CustomerService;
import service.RoomService;

public class RoomMainMenu {
    public static Scanner scanner = new Scanner(System.in);
    public static void choiceManagement()
    {
        System.out.println("1.In ra danh sách phòng");
        System.out.println("2.Xóa phòng");
        System.out.println("3.Phòng xịn nhất");
        System.out.println("4.Phòng rẻ nhất");
        System.out.println("5.Thêm phòng mới");

        int choice = scanner.nextInt();
        RoomService room_service = new RoomService();

        switch (choice)
        {
            case 1 :
            {
                room_service.printList();
                break;
            }
            case 5 :
            {
                Room new_room = new Room();
                System.out.println("Nhập số phòng mới :");
                new_room.id = scanner.nextInt();
                System.out.println("Nhập số phòng ngủ của phòng mới :");
                new_room.bedrooms = scanner.nextInt();
                System.out.println("Nhập thời gian thuê phòng mới :");
                new_room.time = scanner.nextInt();
                System.out.println("Nhập giá thuê phòng mới :");
                new_room.price = scanner.nextInt();

                room_service.add(new_room);
                break;
            }
            case 2 :
            {
                System.out.println("Nhập số phòng :");
                int id = scanner.nextInt();
                room_service.delete(id);
                break;
            }
            case 3 :
            {
                System.out.println(room_service.maxById());
                break;
            }
            case 4 :
            {
                System.out.println(room_service.minById());
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
        UserMainMenu.choiceManagement();
    }
}
