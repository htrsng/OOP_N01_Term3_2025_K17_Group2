import java.time.LocalDate;
public class KhachHang {
    private String maDon;
    private String tenKhach;
    private String soDienThoai;
    private String maXe;
    private LocalDate ngayBan;

    // Constructor
    public KhachHang(String maDon, String tenKhach, String soDienThoai, String maXe, LocalDate ngayBan) {
        this.maDon = maDon;
        this.tenKhach = tenKhach;
        this.soDienThoai = soDienThoai;
        this.maXe = maXe;
        this.ngayBan = ngayBan;
    }

    // Get
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

    // Set
    public void setMaDon(String maDon) {
        this.maDon = maDon;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public void setNgayBan(LocalDate ngayBan) {
        this.ngayBan = ngayBan;
    }
}
