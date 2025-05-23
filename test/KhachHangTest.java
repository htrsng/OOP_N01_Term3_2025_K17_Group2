import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;

public class KhachHangTest {
    public void testKhachHangCRUD() {
        App app = new App();

        //mau
        KhachHang khach1 = new KhachHang("DON001", "Nguyen Van A", "0123456789", "XE001", LocalDate.now());
        app.addKhachHang(khach1);

        Scanner scanner = new Scanner(System.in);

        // them
        System.out.println("nhap thong tin khach hang moi:");
        System.out.println("Ma đơn:");
        String maDon = scanner.nextLine();

        System.out.println("Ten khach:");
        String tenKhach = scanner.nextLine();

        System.out.println("So đienn thoai:");
        String soDienThoai = scanner.nextLine();

        System.out.println("Ma xe:");
        String maXe = scanner.nextLine();

        System.out.println("Ngay ban (YYYY-MM-DD):");
        LocalDate ngayBan = LocalDate.parse(scanner.nextLine());

        app.addKhachHang(new KhachHang(maDon, tenKhach, soDienThoai, maXe, ngayBan));
        System.out.println("danh sach khach hang sau khi them:");
        app.printKhachHangList();

        //sửa khách hàng
        System.out.println("nhap ma don khach hang can sua:");

        maDon = scanner.nextLine();
        System.out.println("nhap thong tin moi cho khach hang:");

        System.out.println("Ten khach:");
        tenKhach = scanner.nextLine();

        System.out.println("So đien thoai:");
        soDienThoai = scanner.nextLine();

        System.out.println("Ma xe:");
        maXe = scanner.nextLine();

        System.out.println("Ngay ban (YYYY-MM-DD):");
        ngayBan = LocalDate.parse(scanner.nextLine());

        app.editKhachHang(maDon, tenKhach, soDienThoai, maXe, ngayBan);
        System.out.println("danh sahc khach hang sau khi sua:");
        app.printKhachHangList();

        // xóa 
        
        System.out.println("nhap ma don khach hang can xoa:");
        maDon = scanner.nextLine();
        app.deleteKhachHang(maDon);
        System.out.println("danh sach khach hang sau khi xoa:");
        app.printKhachHangList();
    }

    public static void main(String[] args) {
        KhachHangTest test = new KhachHangTest();
        test.testKhachHangCRUD();
    }
}