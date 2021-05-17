package Bai3;

import java.util.Arrays;

public class QuanLyThiSinh {
    private ThiSinh [] arr = new ThiSinh[10];
    private int size = 0;

    public QuanLyThiSinh(ThiSinh[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }
    public QuanLyThiSinh(){
    }

    public ThiSinh[] getArr() {
        return arr;
    }

    public void setArr(ThiSinh[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "QuanLyThiSinh{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public void addThiSinh(ThiSinh A){
        arr[size] = A;
        size++;
    }
    public void disPlay(){
        for (int i = 0; i< size; i++){
            System.out.println(arr[i].toString());
        }
    }
    public int timKiemThiSinh(String sbd){
        for (int i = 0; i<size; i++){
            if (sbd == arr[i].getSBD()){
                return i;
            }
        }
        return -1;
    }
}
