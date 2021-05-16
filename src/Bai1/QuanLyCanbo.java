package Bai1;

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

    }

    public static void main(String[] args) {
        QuanLyCanbo ql = new QuanLyCanbo();
        CanBo cb1 = new CanBo("Tuyen", 27, "Nam", "Hà Nội");
        CanBo cb2 = new CanBo("Nam", 25, "Nam", "Quảng Ninh");
        CanBo cb3 = new CanBo("Xuyen", 26, "Nu", "Hai Phong");
        ql.add(cb1);
        ql.add(cb2);
        ql.add(cb3);
        ql.disPlay();
        System.out.println(ql.search("Tuyen"));

    }
}
