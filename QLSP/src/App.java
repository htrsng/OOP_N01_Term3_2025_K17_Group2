import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        // Tạo một đối tượng Xe
        System.out.println("\n Thong tin xe trong cua hang\n");
        Xe xe = new Xe("01", "Honda SH", "Honda", 80000000, 5, "Con");

        System.out.println("Ma xe: " + xe.getMaXe());
        System.out.println("Ten xe: " + xe.getTenXe());
        System.out.println("Hang xe: " + xe.getHangXe());
        System.out.println("Gia: " + xe.getGia());
        System.out.println("Soluong: " + xe.getSoLuong());
        System.out.println("Trangthai: " + xe.getTrangThai());
        
        // Tạo một đối tượng khach hang
         KhachHang kh = new KhachHang(
            "KH01",                 
            "Nguyen Van A",          
            "0123456789",           
            xe.getMaXe(),          
            LocalDate.of(2025, 5, 16) 
        );

        // In thông tin khách hàng
        System.out.println("\n Thong tin Khach hang\n");
        System.out.println("Ma: " + kh.getMaDon());
        System.out.println("Ten: " + kh.getTenKhach());
        System.out.println("Sdt: " + kh.getSoDienThoai());
        System.out.println("Maxe: " + kh.getMaXe());
        System.out.println("Ngayban: " + kh.getNgayBan());
        
    }
}