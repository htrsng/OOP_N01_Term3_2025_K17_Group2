import java.util.Scanner;
import java.util.ArrayList;

public class XeTest {
    public void testXeCRUD() {
        App app = new App();
        // du lieu mau
        Xe xe1 = new Xe("XE001", "Toyota Camry", "Toyota", 50000.0, 10, "Available");
        Xe xe2 = new Xe("XE002", "Honda Civic", "Honda", 40000.0, 5, "Available");
        app.addXe(xe1);
        app.addXe(xe2);

        Scanner scanner = new Scanner(System.in);
        // them
        System.out.println("Nhap thong tin xe moi:");

        System.out.println("Ma xe:");
        String maXe = scanner.nextLine();

        System.out.println("Ten xe:");
        String tenXe = scanner.nextLine();

        System.out.println("Hang xe:");
        String hangXe = scanner.nextLine();

        System.out.println("Gia:");
        double gia = scanner.nextDouble();

        System.out.println("So luong:");
        int soLuong = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Trang thai:");
        String trangThai = scanner.nextLine();

        app.addXe(new Xe(maXe, tenXe, hangXe, gia, soLuong, trangThai));
        System.out.println("Danh sach xe sau khi them:");
        app.printXeList();

        // sua
        System.out.println("Nhap ma xe can sua:");

        maXe = scanner.nextLine();
        System.out.println("Nhap thong tin moi cho xe:");

        System.out.println("Ten xe:");
        tenXe = scanner.nextLine();

        System.out.println("Hang xe:");
        hangXe = scanner.nextLine();

        System.out.println("Gia:");
        gia = scanner.nextDouble();

        System.out.println("So luong:");
        soLuong = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Trang thai:");
        trangThai = scanner.nextLine();

        app.editXe(maXe, tenXe, hangXe, gia, soLuong, trangThai);
        System.out.println("Danh sach xe sau khi sua:");
        app.printXeList();

        // xoa
        System.out.println("Nhap ma xe can xoa:");
        maXe = scanner.nextLine();
        app.deleteXe(maXe);
        
        System.out.println("Danh sach xe sau khi xoa:");
        app.printXeList();

    }

    public static void main(String[] args) {
        XeTest test = new XeTest();
        test.testXeCRUD();
    }
}