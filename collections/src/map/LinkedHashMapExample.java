package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        // Tạo một LinkedHashMap với kiểu key là String và kiểu value là Integer
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Thêm các phần tử vào LinkedHashMap
        // Có thể put các POJO vào Map
        linkedHashMap.put("Short", 1);
        linkedHashMap.put("Medium", 2);
        linkedHashMap.put("LongText", 3);
        linkedHashMap.put("VeryLongText", 4);
        linkedHashMap.put("ThisIsAnExtremelyLongTextKeyInHashMap", 5);
        linkedHashMap.put("A", 6);
        linkedHashMap.put("B", 7);

        // Duyệt qua các phần tử và in ra màn hình
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
