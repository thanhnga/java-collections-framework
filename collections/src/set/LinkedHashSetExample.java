package set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        final LinkedHashSet<String> fruits = new LinkedHashSet<>();

        // Thêm phần tử vào Set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Hiển thị các phần tử Set
        System.out.println("LinkedHashSet: " + fruits);

        // Set không chứa các phần tử trùng lặp
        fruits.add("Apple");

        // Hiển thị các phần tử Set sau khi add phần tử trùng lặp
        System.out.println("LinkedHashSet: " + fruits);

        // Loại bỏ một phần tử
        fruits.remove("Banana");

        // Hiển thị các phần tử Set sau khi add phần tử trùng lặp
        System.out.println("LinkedHashSet after removal: " + fruits);

        // Kiểm tra xem Set có chứa một phần tử cụ thể không
        if (fruits.contains("Orange")) {
            System.out.println("LinkedHashSet contains Orange");
        }

        // Duyệt qua Set và in ra màn hình
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

}
