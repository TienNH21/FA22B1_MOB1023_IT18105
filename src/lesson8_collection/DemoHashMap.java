package lesson8_collection;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoHashMap {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(500.00); // 0
        list.add(600.00); // 1
        list.add(900.00); // 2
        list.add(200.00); // 3
        
        // double
        HashMap<String, Double> map = new HashMap<>();
        map.put("Nokia", 500.00);
        map.put("Samsung", 600.00);
        map.put("iPhone", 900.00);
        map.put("Oppo", 200.00);

        for (String key : map.keySet()) {
            System.out.println(key + "-" + map.get(key));
        }
    }
}
