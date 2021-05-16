package Bai1;

public class CongNhan extends CanBo{
    int bac;

    public CongNhan(String name, int tuoi, String gioitinh, String diachi, int bac) {
        super(name, tuoi, gioitinh, diachi);
        this.bac = bac;
    }

    public CongNhan(int bac) {
        this.bac = bac;
    }

    public CongNhan(){
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }
}
