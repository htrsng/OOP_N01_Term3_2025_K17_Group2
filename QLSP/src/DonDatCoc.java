public class DonDatCoc {
    private String maDon;
    private KhachHang khachHang;
    private Xe xe;
    private String ngayDat;
    private String ngayGiao;
    private int tienCoc;
    private String trangThai;

    public DonDatCoc(String maDon, KhachHang khachHang, Xe xe, String ngayDat, String ngayGiao, int tienCoc, String trangThai) {
        this.maDon = maDon;
        this.khachHang = khachHang;
        this.xe = xe;
        this.ngayDat = ngayDat;
        this.ngayGiao = ngayGiao;
        this.tienCoc = tienCoc;
        this.trangThai = trangThai;
    }

    public void displayOrderInfo() {
        System.out.println("Mã đơn: " + maDon);
        System.out.println("Khách hàng: " + khachHang); 
        System.out.println("Xe: " + xe); // tương tự
        System.out.println("Ngày đặt: " + ngayDat);
        System.out.println("Ngày giao: " + ngayGiao);
        System.out.println("Tiền cọc: " + tienCoc);
        System.out.println("Trạng thái: " + trangThai);
    }
}
