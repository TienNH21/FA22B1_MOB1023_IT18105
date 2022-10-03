package lesson12_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoFileIOStream {
    public static void main(String[] args) {
        String filename = "demo_file_io.txt";
        System.out.println("Ghi file");
        ghiFile(filename);
        System.out.println("Ghi file ket thuc");
        
        System.out.println("Doc file");
        docFile(filename);
        System.out.println("Doc file ket thuc");
    }
    
    public static void docFile(String filename)
    {
        // Kiểm tra file tồn tại
        File f = new File(filename);
        if (f.exists() == false) {
            System.out.println("File không tồn tại");
            return ;
        }
        
        try {
            // Mở luồng để đọc file
            FileInputStream fis = new FileInputStream(f);
            while(true) {
                // Đọc từng byte dữ liệu
                int i = fis.read();
                if (i == -1) {
                    break;
                }
                
                char c = (char) i;
                System.out.print(c);
            }
            
            System.out.println("");

            // Đóng luồng
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void ghiFile(String filename)
    {
        File f = new File(filename);
        
        if (f.exists() == false) {
            System.out.println("File không tồn tại");
            return ;
        }
        
        try {
            FileOutputStream fos = new FileOutputStream(f);
            String txt = "Hello Poly";
            byte[] b = txt.getBytes();
            fos.write(b);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
