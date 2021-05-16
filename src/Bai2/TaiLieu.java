package Bai2;

public class TaiLieu {
    public int id;
    public String nhaXuatBan;
    public int soLuong;

    public TaiLieu(int id, String nhaXuatBan, int soLuong) {
        this.id = id;
        this.nhaXuatBan = nhaXuatBan;
        this.soLuong = soLuong;
    }
    public TaiLieu(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "id=" + id +
                ", nhaXuatBan: '" + nhaXuatBan + '\'' +
                ", soLuong: " + soLuong +
                '}';
    }
}
