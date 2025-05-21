package QLSP.test;
import QLSP.main.DonDatCoc;

public class DonDatCocTest {
    public static void TestDatCoc() {    
        DonDatCoc dondatcoc = new DonDatCoc("01", "Honda SH", "Honda", 80000000, 5, "Còn hàng");

        System.out.println("Thông tin đơn đặt cọc:");
        System.out.println("Mã xe: " + dondatcoc.getMaXe());
        System.out.println("Tên xe: " + dondatcoc.getTenXe());
        System.out.println("Hãng xe: " + dondatcoc.getHangXe());
        System.out.println("Giá: " + dondatcoc.getGia());
        System.out.println("Số lượng: " + dondatcoc.getSoLuong());
        System.out.println("Trạng thái: " + dondatcoc.getTrangThai());
    }
}
