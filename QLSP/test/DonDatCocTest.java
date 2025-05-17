package QLSP.test;
import QLSP.main.DonDatCoc;
public class DonDatCocTest {
    public void test(){    
        DonDatCoc dondatcoc = new DonDatCoc("01", "Honda SH", "Honda", 80000000, 5, "Còn hàng");

        System.out.println("Ma: " + dondatcoc.getMaXe());
        System.out.println("Hang: " + dondatcoc.getHangXe());
        System.out.println("Ten: " + dondatcoc.getTenXe());
        System.out.println("Gia: " + dondatcoc.getGia());
        System.out.println("Sl: " + dondatcoc.getSoLuong());
        System.out.println("Tt: " + dondatcoc.getTrangThai());
        
    }

}