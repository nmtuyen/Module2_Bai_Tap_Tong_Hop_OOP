package Bai1;

import java.util.Scanner;

public class QuanLyCanbo implements QuanLy<CanBo> {
    private CanBo[] list =new CanBo[10];
    private int size = 0;

    @Override
    public void add(CanBo canBo) {
        list[size] = canBo;
        size++;

    }

    @Override
    public int search(String name) {
        for (int i = 0; i < size; i++){
            if (name == list[i].getName()){
                return i;
            }
        }return -1;

    }

    @Override
    public void disPlay() {
        for (int i = 0; i < size; i++){
            System.out.println(list[i]);
        }
        System.out.println("====================================");

    }

    @Override
    public void exit() {
        System.exit(0);

    }

    public static void main(String[] args) {
        QuanLyCanbo ql = new QuanLyCanbo();
        CanBo cb1 = new CanBo("Tuyen", 27, "Nam", "Hà Nội");
        CanBo cb2 = new CanBo("Nam", 25, "Nam", "Quảng Ninh");
        CanBo cb3 = new CanBo("Xuyen", 26, "Nu", "Hai Phong");
        Scanner sc = new Scanner(System.in);
        int choice;
        String name;

        do {
            menu();
            System.out.println("Nhập lệnh muốn thực hiện: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    ql.add(cb1);
                    ql.add(cb2);
                    ql.add(cb3);
                    ql.disPlay();
                    break;
                case 2:
                    ql.add(cb1);
                    ql.add(cb2);
                    ql.add(cb3);
                    ql.disPlay();
                    System.out.println("Nhập tên cán bộ muốn tìm kiếm: ");
                    name = sc.nextLine();
                    ql.search(name);
                    for (int i = 0; i< ql.size; i++){
                        if (name == ql.list[i]){

                        }

                    }
                    break;

            }
        }while (choice>=1 && choice <= 3);


    }
    static void menu(){
        System.out.println("Nhập các lựa chọn");
        System.out.println("1. Thêm mới cán bộ");
        System.out.println("2. Tìm kiếm theo họ tên.");
        System.out.println("3. Hiện thị thông tin về danh sách các cán bộ");
        System.out.println("4. Thoát khỏi chương trình");
    }
}
