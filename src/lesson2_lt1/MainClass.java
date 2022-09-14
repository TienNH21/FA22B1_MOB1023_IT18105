package lesson2_lt1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NguoiService service = new NguoiService();
        
        while(true) {
            printMenu();
            int chon = Integer.parseInt(sc.nextLine());
            if (chon == 0) {
                return;
            }
            
            switch (chon) {
                case 1:
                    System.out.println("Nhập họ tên:");
                    String hoTen = sc.nextLine();
                    System.out.println("Nhập địa chỉ:");
                    String diaChi = sc.nextLine();
                    System.out.println("Chọn 1 - Nam, 0 - Nữ:");
                    int gt = Integer.parseInt(sc.nextLine());
                    
                    Nguoi n = new Nguoi(hoTen, diaChi, gt);
                    service.insert(n);
                    break;
                case 2:
                    for (Nguoi ng : service.getDs()) {
                        System.out.println(ng.xuatThongTin());
                    }
                    break;
                default:
                    break;
            }
        }
    }
    
    public static void printMenu()
    {
        System.out.println("\nNhập:");
        System.out.println("\n\t1. Thêm đối tượng");
        System.out.println("\n\t2. Xuất danh sách");
        System.out.println("\n\t0. Dừng chương trình");
    }
}
