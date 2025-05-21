package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSortingExample {
    public static void main(String[] args) {
        // Khởi tạo một ArrayList kiểu Integer
        ArrayList<Integer> numbers = new ArrayList<>();

        // Thêm các phần tử vào ArrayList
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        // Sắp xếp các phần tử trong ArrayList tăng dần bằng Collections util
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList ASC: " + numbers);

        // Đảo ngược 1 mảng
        Collections.reverse(numbers);
        System.out.println("Revert ArrayList: " + numbers);

        // Sắp xếp các phần tử trong ArrayList tăng dần
        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println("Sorted ArrayList ASC: " + numbers);

        // Sắp xếp các phần tử trong ArrayList giảm dần
        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println("Sorted ArrayList DESC: " + numbers);

    }
}
