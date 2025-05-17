package QLSP.test;  

import QLSP.main.KhachHang; 

public class KhachHangTest {
    public static void TestKhanhHang(){
        KhachHang khachhang = new KhachHang("001", "Dang Dac Tu", "0987654321", 05);
        System.out.println("Ma:"+khachhang.getMaDon());
        System.out.println("Ten:"+khachhang.getTenKhach());
        System.out.println("SDT:"+khachhang.getSoDienThoai());
        System.out.println("Ma xe:" + khachhang.getMaXe());
    }
}

