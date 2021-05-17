package Bai3;

public class ThiSinhKhoiB extends ThiSinh{
    private String[] MonThi = {"Toán", "Hóa", "Sinh"};

    public ThiSinhKhoiB(String SBD, String name, String diaChi, String mucUuTien, String[] monThi) {
        super(SBD, name, diaChi, mucUuTien);
        MonThi = monThi;
    }

    public ThiSinhKhoiB(String[] monThi) {
        MonThi = monThi;
    }

    public ThiSinhKhoiB(){
    }

    public String[] getMonThi() {
        return MonThi;
    }

    public void setMonThi(String[] monThi) {
        MonThi = monThi;
    }
}
