package QLSP;

public class KhachHang {
    private String maDon;
    private String tenKhach;
    private long sdt;
    private String maXe;

    public KhachHang(String maDon, String tenKhach, long sdt, String maXe){
        this.maDon = maDon;
        this.tenKhach = tenKhach;
        this.sdt = sdt;
        this.maXe = maXe;
    }

    public String getMaDon(){
        return maDon;
    }

    public String getTenKhach(){
        return tenKhach;
    }

    public long getSDT(){
        return sdt;
    }

    public String getMaXe(){
        return maXe;
    }
    
}
    

