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
        
        // Tạo một đối tượng DonDatCoc
        DonDatCoc donDatCoc = new DonDatCoc("DDC01", "01", "Honda SH", "Honda", 8000000, 1, "Con");
        
        // In thông tin đơn đặt cọc
        System.out.println("\n Thong tin Don Dat Coc\n");
        System.out.println("Ma don: " + donDatCoc.getMaDon());
        System.out.println("Ma xe: " + donDatCoc.getMaXe());
        System.out.println("Ten xe: " + donDatCoc.getTenXe());
        System.out.println("Hang xe: " + donDatCoc.getHangXe());
        System.out.println("Gia: " + donDatCoc.getGia());
        System.out.println("Soluong: " + donDatCoc.getSoLuong());
        System.out.println("Trangthai: " + donDatCoc.getTrangThai());
    }
}
