package service;

import models.Customer;
import models.Room;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements Management<Customer> {
    public static Customer customer;
    public static List<Customer> customer_list = new ArrayList<>();

    @Override
    public Customer findById(int id) {
        for (int i = 0; i < customer_list.size(); i++) {
            if (customer_list.get(i).getId() == id) {
                return customer_list.get(i);
            }
        }
        return null;
    }

    @Override
    public void printList() {
        for (int i = 0; i < customer_list.size(); i++) {
            customer_list.get(i).CustomerPrint();
        }
    }

    public void updateById(int id, Room customer_room) {
        for (int i = 0; i < customer_list.size(); i++) {
            if (customer_list.get(i).getId() == id) {
                customer_list.get(i).setCustomerRoom(customer_room);
                break;
            }
        }
    }

    @Override
    public void add(Customer customer) {
        customer.setId(customer_list.size() + 1);
        customer_list.add(customer);
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < customer_list.size(); i++) {
            if (customer_list.get(i).getId() == id) {
                customer_list.remove(i);
                return;
            }
        }
    }
    @Override
    public int maxById() {return 0;}
    @Override
    public int minById() {return 0;}
}
