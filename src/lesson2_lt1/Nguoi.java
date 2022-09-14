package lesson2_lt1;

public class Nguoi {
    private String hoTen;
    private String diaChi;
    private int gioiTinh;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String diaChi, int gioiTinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public String xuatThongTin()
    {
        return this.hoTen + " | " +
            this.diaChi + " | " +
            (this.gioiTinh == 1 ? "Nam" : "Nữ");
    }
}
