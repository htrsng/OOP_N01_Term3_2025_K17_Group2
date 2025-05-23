import java.util.ArrayList;
import java.util.Scanner;

public class DonDatCocTest {
    public void testDonDatCocCRUD() {
        App app = new App();

        // dữ liệu mẫu
        DonDatCoc don1 = new DonDatCoc("DON001", "XE001", "Toyota Camry", "Toyota", 50000.0, 1, "Pending");
        app.addDonDatCoc(don1);

        Scanner scanner = new Scanner(System.in);

        // thêm đơn đặt cọc
        System.out.println("nhap thon tin do moi:");

        System.out.println("Ma don:");
        String maDon = scanner.nextLine();

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

        app.addDonDatCoc(new DonDatCoc(maDon, maXe, tenXe, hangXe, gia, soLuong, trangThai));
        System.out.println("danh sach cac don:");
        app.printDonDatCocList();

        //  sửa đơn đặt cọc
        System.out.println("nhap thong tin ma don can sua:");

        maDon = scanner.nextLine();
        System.out.println("nhap thong tin moi cho don dot coc:");

        System.out.println("Ma xe:");
        maXe = scanner.nextLine();

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

        app.editDonDatCoc(maDon, maXe, tenXe, hangXe, gia, soLuong, trangThai);
        System.out.println("Danh sach don dat coc sau khi sua:");
        app.printDonDatCocList();

        // xóa đơn đặt cọc
        System.out.println("nhap ma don can xoa:");
        maDon = scanner.nextLine();
        app.deleteDonDatCoc(maDon);
        
        System.out.println("danh sach cac don sau khi xoa:");
        app.printDonDatCocList();

    }

    public static void main(String[] args) {
        DonDatCocTest test = new DonDatCocTest();
        test.testDonDatCocCRUD();
    }
}