package QLSP.test;

import QLSP.KhachHang;


public class KhachHangTest {

    public void testKhanhHang(){
        QLSP.src.KhachHang khachhang = new KhachHang("001", "Dang Dac Tu", 2243456789, 05);

        System.out.println("Ma:"+khachhang.getMaDon());
        System.out.println("Ten:"+khachhang.getTenKhach());
        System.out.println("SDT:"+khachhang.getSDT());
        System.out.println("Ma xe:" + khachhang.getMaXe());
    }
}

