package linkedlist;

import java.util.LinkedList;

public class LinkedSimpleExample {
    public static void main(String[] args) {
        // Khởi tạo một LinkedList
        final LinkedList<String> linkedList = new LinkedList<>();

        // Thêm phần tử vào đầu và cuối của LinkedList
        linkedList.addFirst("Apple");
        linkedList.addLast("Lemon");
        linkedList.addLast("Banana");

        // In ra các phần tử của LinkedList
        System.out.println("Nội dung của LinkedList: " + linkedList);

        // Lấy và in ra phần tử đầu tiên và phần tử cuối cùng của LinkedList
        System.out.println("Phần tử đầu tiên: " + linkedList.getFirst());
        System.out.println("Phần tử cuối cùng: " + linkedList.getLast());

        // Xoá phần tử đầu tiên và cuối cùng của LinkedList
        linkedList.removeFirst();
        linkedList.removeLast();

        // In ra các phần tử của LinkedList sau khi xoá
        System.out.println("Nội dung của LinkedList sau khi xoá phần tử đầu tiên và cuối cùng: " + linkedList);

        // Thêm phần tử vào đầu và cuối của LinkedList sử dụng phương thức offer
        linkedList.offerFirst("Grapes");
        linkedList.offerLast("Orange");

        // In ra các phần tử của LinkedList sau khi thêm mới
        System.out.println("Nội dung của LinkedList sau khi thêm phần tử mới: " + linkedList);

        // Lấy và in ra phần tử đầu tiên và phần tử cuối cùng của LinkedList sử dụng peek
        System.out.println("Phần tử đầu tiên: " + linkedList.peekFirst());
        System.out.println("Phần tử cuối cùng: " + linkedList.peekLast());

        // Xoá phần tử đầu tiên và cuối cùng của LinkedList sử dụng poll
        linkedList.pollFirst();
        linkedList.pollLast();

        // In ra các phần tử của LinkedList sau khi poll
        System.out.println("Nội dung của LinkedList sau khi xoá phần tử đầu tiên và cuối cùng: " + linkedList);
    }
}
