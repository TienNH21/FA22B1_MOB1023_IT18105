package lesson1_oop;

public class SinhVien extends Nguoi {
    private String maSv;

    public SinhVien() {
    }

    public SinhVien(String maSv, String ten, int tuoi) {
        super(ten, tuoi);
        this.maSv = maSv;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }
    
    @Override
    public String xuatThongTin()
    {
        return super.xuatThongTin() + " | " + this.maSv;
    }
    
    public String xuatThongTin(boolean printAll)
    {
        if (printAll == true) {
            return super.xuatThongTin() + " | " + this.maSv;
        }
        
        return this.maSv;
    }
}
