
public class DonDatCocTest {
    public static void TestDatCoc() {
        DonDatCoc donDatCoc = new DonDatCoc("001", "Dang Dac Tu", "0987654321", "5", 5000000.0, 1, "Còn hàng");

        System.out.println("Test Case 1:");
        System.out.println("Ma xe: " + donDatCoc.getMaXe());
        System.out.println("Ten xe: " + donDatCoc.getTenXe());
        System.out.println("Hang xe: " + donDatCoc.getHangXe());
        System.out.println("Gia: " + donDatCoc.getGia());
        System.out.println("So luong: " + donDatCoc.getSoLuong());
        System.out.println("Trang thai: " + donDatCoc.getTrangThai());
    }

    public static void main(String[] args) {
        TestDatCoc();
    }
}
