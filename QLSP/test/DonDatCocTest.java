package QLSP.test;
import QLSP.main.DonDatCoc;

public class DonDatCocTest {
    public static void TestDatCoc() {    
        DonDatCoc dondatcoc = new DonDatCoc("DDC01", "01", "Honda SH", "Honda", 80000000.0, 5, "Còn hàng");

        System.out.println("Thông tin đơn đặt cọc:");
        System.out.println("Ma xe: " + dondatcoc.getMaXe());
        System.out.println("Ten xe: " + dondatcoc.getTenXe());
        System.out.println("Hang xe: " + dondatcoc.getHangXe());
        System.out.println("Gia: " + dondatcoc.getGia());
        System.out.println("So luong: " + dondatcoc.getSoLuong());
        System.out.println("Trang thai: " + dondatcoc.getTrangThai());
    }
}
