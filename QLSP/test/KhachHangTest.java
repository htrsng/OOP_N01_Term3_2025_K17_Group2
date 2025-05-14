package QLSP.test;

import QLSP.KhachHang;
import java.io.PrintStream;

public class KhachHangTest {

    public static void main(String[] args) {
        QLSP.src.KhachHang khachhang = new KhachHang("001", "Dang Dac Tu", 2243456789, 05);

        System.out.println("Ma:"+khachhang.getMaDon());
        System.out.println("Ten:"+khachhang.getTenKhach());
        System.out.println("SDT:"+khachhang.getSDT());
        System.out.println("Ma xe:" + khachhang.getMaXe());
    }
}

