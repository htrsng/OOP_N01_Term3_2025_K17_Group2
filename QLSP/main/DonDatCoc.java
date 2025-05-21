package QLSP.main;

public class DonDatCoc {
    private String maXe;
    private String tenXe;
    private String hangXe;
    private int gia;
    private int soLuong;
    private String trangThai;

    // Constructor
    public DonDatCoc(String maXe, String tenXe, String hangXe, int gia, int soLuong, String trangThai) {
        this.maXe = maXe;
        this.tenXe = tenXe;
        this.hangXe = hangXe;
        this.gia = gia;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    // Getters and Setters
    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
