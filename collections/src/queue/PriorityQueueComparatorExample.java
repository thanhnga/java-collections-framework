package queue;

import arraylist.Person;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueComparatorExample {

    public static void main(String[] args) {

        // Khởi tạo một PriorityQueue với Comparator
        final PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        // Thêm các chuỗi vào hàng đợi và ghi chú độ dài của mỗi chuỗi
        pq.add("apple");      // Độ dài: 5
        pq.add("banana");     // Độ dài: 6
        pq.add("orange");     // Độ dài: 6
        pq.add("grape");      // Độ dài: 5
        pq.add("pineapple");  // Độ dài: 9

        // In ra các chuỗi theo thứ tự độ dài tăng dần
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }


}
