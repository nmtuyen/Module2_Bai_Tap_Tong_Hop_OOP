package Bai2;

import java.util.Date;

public class Newspaper extends TaiLieu{
    public Date ngayPhatHanh;

    public Newspaper(int id, String nhaXuatBan, int soLuong, Date ngayPhatHanh) {
        super(id, nhaXuatBan, soLuong);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Newspaper(Date ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Date getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(Date ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
}
