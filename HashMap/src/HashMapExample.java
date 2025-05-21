import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        // Tạo một HashMap
        // Key là 1 kiểu String và Value là 1 kiểu Integer
        Map<String, Integer> hashMap = new HashMap<>();

        // Thêm các phần tử vào HashMap
        hashMap.put("Short", 1);
        hashMap.put("Medium", 2);
        hashMap.put("LongText", 3);
        hashMap.put("VeryLongText", 4);
        hashMap.put("ThisIsAnExtremelyLongTextKeyInHashMap", 5);
        hashMap.put("A", 6);
        hashMap.put("B", 7);

        // Các phần tử trong HashMap
        System.out.println("Các phần tử của HashMap: " + hashMap);

        // Truy cập phần tử từ HashMap
        System.out.println("Giá trị liên kết với key 'B': " + hashMap.get("B"));

        // Kiểm tra sự tồn tại của một key
        if (hashMap.containsKey("C")) {
            System.out.println("Key 'C' tồn tại trong HashMap.");
        }

        // Xóa một phần tử từ HashMap
        hashMap.remove("A");

        // Hiển thị tất cả các phần tử trong HashMap
        System.out.println("HashMap sau khi xóa key 'A': " + hashMap);

        // Duyệt qua tất cả các phần tử của HashMap
        System.out.println("Duyệt qua HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

}
