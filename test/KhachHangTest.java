
import java.time.LocalDate;

public class KhachHangTest {
    public static void TestKhachHang() {
        KhachHang khachHang1 = new KhachHang("001", "Dang Dac Tu", "0987654321", "5", null);
        System.out.println("Test Case 1:");
        System.out.println("Ma: " + khachHang1.getMaDon());
        System.out.println("Ten: " + khachHang1.getTenKhach());
        System.out.println("SDT: " + khachHang1.getSoDienThoai());
        System.out.println("Ma xe: " + khachHang1.getMaXe());
        System.out.println("Ngay ban: " + (khachHang1.getNgayBan() != null ? khachHang1.getNgayBan() : "Not set"));
    }

    public static void main(String[] args) {
        TestKhachHang();
    }
}