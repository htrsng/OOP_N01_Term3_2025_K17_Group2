import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    private ArrayList<Xe> xeList = new ArrayList<>();
    private ArrayList<DonDatCoc> donDatCocList = new ArrayList<>();
    private ArrayList<KhachHang> khachHangList = new ArrayList<>();

    public ArrayList<Xe> addXe(Xe xe) {
        xeList.add(xe);
        return xeList;
    }

    public void printXeList() {
        for (Xe xe : xeList) {
            System.out.println("Ma Xe: " + xe.getMaXe() + ", Ten Xe: " + xe.getTenXe() +
                    ", Hang Xe: " + xe.getHangXe() + ", Gia: " + xe.getGia() +
                    ", So Luong: " + xe.getSoLuong() + ", Trang Thai: " + xe.getTrangThai());
        }
    }

    // DonDatCoc
    public ArrayList<DonDatCoc> addDonDatCoc(DonDatCoc don) {
        donDatCocList.add(don);
        return donDatCocList;
    }

    public void printDonDatCocList() {
        for (DonDatCoc don : donDatCocList) {
            System.out.println(don);
        }
    }

    public void editDonDatCoc(String maDon, String maXe, String tenXe, String hangXe, double gia, int soLuong, String trangThai) {
    
    }

    public void deleteDonDatCoc(String maDon) {
       
    }

    // KhachHang
    public ArrayList<KhachHang> addKhachHang(KhachHang khach) {
        khachHangList.add(khach);
        return khachHangList;
    }

    public void printKhachHangList() {
        for (KhachHang kh : khachHangList) {
            System.out.println(kh);
        }
    }

    public void editKhachHang(String maDon, String tenKhach, String soDienThoai, String maXe, LocalDate ngayBan) {
        
    }

    public void deleteKhachHang(String maDon) {
    }



    // Xe
    public void editXe(String maXe, String tenXe, String hangXe, double gia, int soLuong, String trangThai) {
       
    }

    public void deleteXe(String maXe) {
       
    }

    public static void main(String[] args) {
        XeTest test = new XeTest();
        test.testXeCRUD();
    }
}