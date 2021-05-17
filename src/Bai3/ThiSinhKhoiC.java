package Bai3;

public class ThiSinhKhoiC extends ThiSinh{
    private String[] MonThi = {"Văn", "Sử", "Địa"};

    public ThiSinhKhoiC(String SBD, String name, String diaChi,String mucUuTien, String[] monThi) {
        super(SBD, name, diaChi, mucUuTien);
        MonThi = monThi;
    }

    public ThiSinhKhoiC(String[] monThi) {
        MonThi = monThi;
    }
    public ThiSinhKhoiC(){
    }

    public String[] getMonThi() {
        return MonThi;
    }

    public void setMonThi(String[] monThi) {
        MonThi = monThi;
    }
}
