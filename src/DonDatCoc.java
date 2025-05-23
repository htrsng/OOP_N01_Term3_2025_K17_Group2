
public class DonDatCoc {
    private String maDon;
    private String maXe;
    private String tenXe;
    private String hangXe;
    private double gia;
    private int soLuong;
    private String trangThai;

    // Constructor
    public DonDatCoc(String maDon, String maXe, String tenXe, String hangXe, double gia, int soLuong, String trangThai) {
        this.maDon = maDon;
        this.maXe = maXe;
        this.tenXe = tenXe;
        this.hangXe = hangXe;
        this.gia = gia;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    // Các phương thức getter
    public String getMaDon() {
        return maDon;
    }

    public String getMaXe() {
        return maXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public String getHangXe() {
        return hangXe;
    }

    public double getGia() {
        return gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getTrangThai() {
        return trangThai;
    }
}
