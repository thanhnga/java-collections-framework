package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        // Tạo một danh sách số nguyên mới
        List<Integer> numbers = new ArrayList<>();

        // Thêm các số vào danh sách
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20); // thêm 1 phần tử trùng lặp
        numbers.add(20);
        numbers.add(null);

        // Hiển thị số lượng phần tử trong danh sách
        System.out.println("Số lượng phần tử trong danh sách: " + numbers.size());

        // Hiển thị tất cả các số trong danh sách
        System.out.println("Các số trong danh sách:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Lấy phần tử tại vị trí chỉ định
        final int elementAtIndex2 = numbers.get(2);
        System.out.println("Phần tử tại vị trí index 2: " + elementAtIndex2);

        // Thay đổi giá trị của phần tử tại vị trí chỉ định
        numbers.set(1, 100);
        System.out.println("Danh sách sau khi thay đổi phần tử tại index 1:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Loại bỏ phần tử khỏi danh sách
        numbers.remove(0);
        System.out.println("Danh sách sau khi loại bỏ phần tử đầu tiên:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Xóa tất cả các phần tử khỏi danh sách
        numbers.clear();
        // Kiểm tra xem danh sách có trống không
        final boolean isEmpty = numbers.isEmpty();
        System.out.println("Danh sách có trống không? " + isEmpty);

    }
}
