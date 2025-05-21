import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

    public static void main(String[] args) {
        // Tạo một Hashtable
        // Key là 1 kiểu String và Value là 1 kiểu Integer
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Thêm các phần tử vào Hashtable
        hashtable.put("Short", 1);
        hashtable.put("Medium", 2);
        hashtable.put("LongText", 3);
        hashtable.put("VeryLongText", 4);
        hashtable.put("ThisIsAnExtremelyLongTextKeyInHashtable", 5);

        // Lỗi khi thêm phần tử có key hoặc value là null
//        hashtable.put("A", null);
//        hashtable.put(null, 7);

        // Các phần tử trong Hashtable
        System.out.println("Các phần tử của Hashtable: " + hashtable);

        // Truy cập phần tử từ Hashtable
        System.out.println("Giá trị liên kết với key 'B': " + hashtable.get("B"));

        // Kiểm tra sự tồn tại của một key
        if (hashtable.containsKey("C")) {
            System.out.println("Key 'C' tồn tại trong Hashtable.");
        }

        // Xóa một phần tử từ Hashtable
        hashtable.remove("A");

        // Hiển thị tất cả các phần tử trong Hashtable
        System.out.println("Hashtable sau khi xóa key 'A': " + hashtable);

        // Duyệt qua tất cả các phần tử của Hashtable
        System.out.println("Duyệt qua Hashtable:");
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

}
