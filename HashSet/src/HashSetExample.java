import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        final HashSet<String> fruits = new HashSet<>();

        // Thêm phần tử vào Set.
        // Không đảm bảo thứ tự phần tử giống như khi thêm vào.
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Hiển thị các phần tử Set
        System.out.println("HashSet: " + fruits);

        // Set không chứa các phần tử trùng lặp
        fruits.add("Apple");

        // Hiển thị các phần tử Set sau khi add phần tử trùng lặp
        System.out.println("HashSet: " + fruits);

        // Loại bỏ một phần tử
        fruits.remove("Banana");

        // Hiển thị các phần tử Set sau khi add phần tử trùng lặp
        System.out.println("HashSet after removal: " + fruits);

        // Kiểm tra xem Set có chứa một phần tử cụ thể không
        if (fruits.contains("Orange")) {
            System.out.println("HashSet contains Orange");
        }

        // Duyệt qua Set và in ra màn hình
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

}
