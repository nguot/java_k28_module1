package service;
import models.Customer;
import models.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomService implements Management<Room> {
    public static Room room;
    public static List<Room> room_list = new ArrayList<>();

    @Override
    public Room findById(int id) {
        for (int i = 0; i < room_list.size(); i++) {
            if (room_list.get(i).getId() == id) {
                return room_list.get(i);
            }
        }
        return null;
    }

    @Override
    public void printList() {
        for (int i = 0; i < room_list.size(); i++) {
            room_list.get(i).RoomPrint();
        }
    }



    @Override
    public void add(Room room) {
        room.setId(room_list.size() + 1);
        room_list.add(room);
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < room_list.size(); i++) {
            if (room_list.get(i).getId() == id) {
                room_list.remove(i);
                return;
            }
        }
    }

    @Override
    public int maxById() {
        int price = 0;
        int id = 0;
        for (int i = 0; i < room_list.size(); i++) {
            if(price < room_list.get(i).getPrice())
            {
                price = room_list.get(i).getPrice();
                id = room_list.get(i).getId();
            }
        }
        return id;
    }

    @Override
    public int minById() {
        int price = 1000000000;
        int id = 0;
        for (int i = 0; i < room_list.size(); i++) {
            if(price > room_list.get(i).getPrice())
            {
                price = room_list.get(i).getPrice();
                id = room_list.get(i).getId();
            }
        }
        return id;
    }
}
