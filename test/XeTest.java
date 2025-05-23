
public class XeTest {
    public static void TestXe() {
        Xe xe = new Xe("01", "Honda SH", "Honda", 80000000, 5, "Con");
        System.out.println("Ma xe: " + xe.getMaXe());
        System.out.println("Ten xe: " + xe.getTenXe());
        System.out.println("Hang xe: " + xe.getHangXe());
        System.out.println("Gia: " + xe.getGia());
        System.out.println("Soluong: " + xe.getSoLuong());
        System.out.println("Trangthai: " + xe.getTrangThai());
    }

    public static void main(String[] args) {
        TestXe();
    }
}
