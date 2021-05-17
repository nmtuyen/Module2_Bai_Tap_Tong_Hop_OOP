package Bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyThiSinh qlts = new QuanLyThiSinh();
        int i;
        int luachon;
        int khoithi;
        ThiSinh ts1 = new ThiSinhKhoiA("123", "tuyen", "ha noi", "a");
        do {
            System.out.println("Quản lý thí sinh ");
            menu();
            System.out.println("Nhập lựa chọn: ");
            Scanner scanner = new Scanner(System.in);
            luachon = scanner.nextInt();
            khoithi = scanner.nextInt();
            switch (luachon){
                case 1:
                    qlts.addThiSinh(input());
                    qlts.disPlay();
                case 2:
                    qlts.disPlay();
            }
        }while ( luachon>=1 && luachon <=4);

    }
    public static void menu(){
        System.out.println("1. Thêm mới thí sinh");
        System.out.println("2. Hiện thị thông tin của thí sinh và khối thi của thí sinh");
        System.out.println("3. Tìm kiếm theo số báo danh");
        System.out.println("4. Thoát khỏi chương trình");
    }
    public static ThiSinh input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số báo danh thí sinh");
        String sbd = sc.nextLine();
        System.out.println("Nhập tên thí sinh");
        String ten = sc.nextLine();
        System.out.println("Nhập địa chỉ thí sinh");
        String diachi = sc.nextLine();
        System.out.println("Nhập mức ưu tiên thí sinh");
        String mucUuTien = sc.nextLine();
        ThiSinh ts1 = new ThiSinh(sbd, ten, diachi, mucUuTien);
        return ts1;
    }
}
