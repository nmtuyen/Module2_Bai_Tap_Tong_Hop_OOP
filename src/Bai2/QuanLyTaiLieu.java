package Bai2;

public abstract class QuanLyTaiLieu implements QuanLyThuVien<TaiLieu>{
    private TaiLieu[] list = new TaiLieu[10];
    private int size = 0;
    @Override
    public void add(TaiLieu taiLieu) {
        list[size] = taiLieu;
        size++;

    }

    @Override
    public void delete() {

    }

    @Override
    public int search() {
        return 0;
    }

    @Override
    public void print() {

    }
}
