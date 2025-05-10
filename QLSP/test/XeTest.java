package QLSP.test;

import QLSP.Xe;
import java.io.PrintStream;

public class XeTest {
    public static void main(String[] args) throws Exception {
        Xe xe = new Xe("01", "Honda SH", "Honda", 80000000, 5, "Còn hàng");

        System.out.println("Ma: " + xe.getMaXe());
        System.out.println("Hang: " + xe.getHangXe());
        System.out.println("Ten: " + xe.getTenXe());
        System.out.println("Gia: " + xe.getGia());
        System.out.println("Sl: " + xe.getSoLuong());
        System.out.println("Tt: " + xe.getTrangThai());
    }
}
