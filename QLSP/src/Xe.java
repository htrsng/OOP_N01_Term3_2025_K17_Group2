public class Xe {
    private String maXe;
    private String tenXe;
    private String hangXe;
    private double gia;
    private int soLuong;
    private String trangThai;

    // Constructor
    public Xe(String maXe, String tenXe, String hangXe, double gia, int soLuong, String trangThai) {
        this.maXe = maXe;
        this.tenXe = tenXe;
        this.hangXe = hangXe;
        this.gia = gia;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    
    // Get
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

    // Set
    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public void setGia(double gia) {
        if (gia >= 0) this.gia = gia;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) this.soLuong = soLuong;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
