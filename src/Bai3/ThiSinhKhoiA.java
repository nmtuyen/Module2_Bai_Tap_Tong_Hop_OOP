package Bai3;

import java.util.Arrays;

public class ThiSinhKhoiA extends ThiSinh{
    private static final String[] MonThi = {"Toán", "Lý", "Hóa"};

    public ThiSinhKhoiA(String SBD, String name, String diaChi, String mucUuTien) {
        super(SBD, name, diaChi, mucUuTien);
    }

    public ThiSinhKhoiA() {
    }

    public String[] getMonThi() {
        return MonThi;
    }


    @Override
    public String toString() {
        return "ThiSinhKhoiA{" +
                "SBD=" + SBD +
                ", name='" + name + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", mucUuTien=" + mucUuTien +
                ", MonThi=" + Arrays.toString(MonThi) +
                '}';
    }
}
