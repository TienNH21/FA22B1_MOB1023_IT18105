package lesson2_lt1;

public class SinhVien extends Nguoi {
    private String maSv;
    private String cNganh;

    public SinhVien() {
    }

    public SinhVien(String maSv, String cNganh, String hoTen, String diaChi, int gioiTinh) {
        super(hoTen, diaChi, gioiTinh);
        this.maSv = maSv;
        this.cNganh = cNganh;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getcNganh() {
        return cNganh;
    }

    public void setcNganh(String cNganh) {
        this.cNganh = cNganh;
    }
    
    
}
