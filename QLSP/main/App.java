package QLSP.main;

import QLSP.test.KhachHangTest;
import QLSP.test.DonDatCocTest;
import QLSP.test.XeTest;

public class App {
    public static void main(String[] args) {

        System.out.println(" KhachHang:");
        KhachHangTest.TestKhachHang();

        System.out.println(" DonDatCoc:");
        DonDatCocTest.TestDatCoc();

        System.out.println(" Xe:");
        XeTest.TestXe();
    }
}
