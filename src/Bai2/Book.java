package Bai2;

public class Book extends TaiLieu{
    public String tacGia;
    public int soTrang;

    public Book(int id, String nhaXuatBan, int soLuong, String tacGia, int soTrang) {
        super(id, nhaXuatBan, soLuong);
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }
    public Book(){
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
}
