
import java.time.LocalDate;
public class KhachHang {
    private String maDon;
    private String tenKhach;
    private String soDienThoai;
    private String maXe;
    private LocalDate ngayBan;

    // Đổi int maXe thành String maXe ở đây
    public KhachHang(String maDon, String tenKhach, String soDienThoai, String maXe, LocalDate ngayBan) {
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

    public String getMaXe() {
        return maXe;
    }

    public LocalDate getNgayBan() {
        return ngayBan;
    }
}
