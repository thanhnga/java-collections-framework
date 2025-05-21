package map;

import java.util.Hashtable;

public class HashTableExample {

    public static void main(String[] args) {
        // Tạo một đối tượng HashTable
        Hashtable<String, Integer> numbers = new Hashtable<>();

        // Thêm các cặp khóa-giá trị, bao gồm cả key và value là null
        // Thêm các cặp khóa-giá trị
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        // Lỗi NullPointerException nếu thêm value là null
        //numbers.put("Four", null);
        // Lỗi NullPointerException nếu thêm key là null
        //numbers.put(null, 4);

        // Lấy giá trị dựa trên khóa
        int value = numbers.get("Two");
        System.out.println("Value of key 'Two': " + value);

        // Xóa một phần tử
        numbers.remove("Three");

        // Duyệt qua tất cả các phần tử trong Hashtable
        for (String key : numbers.keySet()) {
            System.out.println("Key: " + key + ", Value: " + numbers.get(key));
        }
    }

}
