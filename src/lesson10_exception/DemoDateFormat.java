package lesson10_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoDateFormat {
    public static void main(String[] args) {
        String s = "28/09/2022"; // -> java.util.Date
        
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("dd/MM/YYYY");
        // https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
        Date d;
        
        try {
            d = sdf.parse(s);
            System.out.println("Đúng định dạng ngày tháng");
        } catch (ParseException e) {
            System.out.println("Sai định dạng ngày tháng");
            e.printStackTrace();
        }
        
        // Date -> String
//        sdf.applyPattern("dd/MM/YYYY");
//        String s1 = sdf.format(d);
        try {
            print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void print() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
