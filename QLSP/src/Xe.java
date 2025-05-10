package QLSP;

public class Xe {
    private String maXe;
    private String tenXe;
    private String hangXe;
    private double gia;
    private int soLuong;
    private String trangThai;

    public Xe(String maXe, String tenXe, String hangXe, double gia, int soLuong, String trangThai) {
        this.maXe = maXe;
        this.tenXe = tenXe;
        this.hangXe = hangXe;
        this.gia = gia;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
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
