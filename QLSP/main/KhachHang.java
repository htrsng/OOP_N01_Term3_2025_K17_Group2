package QLSP.main;
import java.time.LocalDate;
public class KhachHang {
    private String maDon;
    private String tenKhach;
    private String soDienThoai;
    private int maXe;
    private LocalDate ngayBan;

    public KhachHang(String maDon, String tenKhach, String soDienThoai, int maXe, LocalDate ngayBan) {
        this.maDon = maDon;
        this.tenKhach = tenKhach;
        this.soDienThoai = soDienThoai;
        this.maXe = maXe;
        this.ngayBan = ngayBan;
    }

    public String getMaDon() {
        return maDon;
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public int getMaXe() {
        return maXe;
    }

    public LocalDate getNgayBan() {
        return ngayBan;
    }
}
