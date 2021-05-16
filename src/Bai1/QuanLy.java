package Bai1;

public interface QuanLy<T> {
    void add(T t);
    int search(String name);

    default void disPlay() {

    }

    void exit();
}
