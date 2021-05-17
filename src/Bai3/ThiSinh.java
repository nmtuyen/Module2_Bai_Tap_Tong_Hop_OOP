package Bai3;

public class ThiSinh {
    public String SBD;
    public String name;
    public String diaChi;
    public String mucUuTien;

    public ThiSinh(String SBD, String name, String diaChi, String mucUuTien) {
        this.SBD = SBD;
        this.name = name;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public ThiSinh(){
    }

    public String getSBD() {
        return SBD;
    }

    public void setSBD(String SBD) {
        this.SBD = SBD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(String mucUuTien) {
        this.mucUuTien = mucUuTien;
    }
}
