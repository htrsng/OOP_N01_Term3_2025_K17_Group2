package QLSP.test;

import java.util.Scanner;

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
        }*/
    }
}
