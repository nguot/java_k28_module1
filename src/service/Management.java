package service;

public interface Management<T> {
    T findById(int id);
    void printList();
    void add(T t);
    void delete(int id);
    int maxById();
    int minById();
}
