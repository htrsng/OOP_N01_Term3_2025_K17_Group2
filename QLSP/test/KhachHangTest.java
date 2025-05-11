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

/*import java.util.Scanner;

public class KhachHangTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("list name customer for testing");
        System.out.println("amount of customer");
        int amount = scan.nextInt();
        
        String[] name = new String[amount];

        System.out.println("input name:");
        for(int i =0; i < amount; i++){
            name[i] = scan.next();
        }
        // output
        /*System.out.println("list customer");
        for(int i = 0; i < amount; i++){
            System.out.println(name[i]);
        }*
    }*
}
*/