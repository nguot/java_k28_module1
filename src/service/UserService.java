package service;
import models.Customer;
import models.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    public static User user;
    public static List<User> user_list = new ArrayList<>();

    public boolean checkLogin(String user_name,String password) {
        for (int i = 0; i < user_list.size(); i++) {
            if (user_list.get(i).user_name.equals(user_name) && user_list.get(i).password.equals(password)) {
                return true;
            }
        }
        return false;
    }


    public void printUser() {
        for (int i = 0; i < user_list.size(); i++) {
            System.out.println(user_list.get(i));
        }
    }

    public void addUser(User user) {
        user.setId(user_list.size() + 1);
        user_list.add(user);
    }
}
