package equals;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInteger {
    public static void main(String[] args) {

        // Tạo một danh sách số nguyên mới
        List<Integer> numbers = new ArrayList<>();

        // Thêm các số vào danh sách
        numbers.add(5);
        numbers.add(10);
        numbers.add(20);

        Integer value = 10;

        // Sử dụng contains để kiểm tra sự tồn tại
        System.out.println("List contains car3: " + numbers.contains(value)); // true

        // Xóa đối tượng (gọi equals để so sánh)
        numbers.remove(value);

        // Kiểm tra lại danh sách 1
        System.out.println("List after removing: " + numbers); // [5, 20]

    }
}
