import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Thêm phần tử vào hàng đợi (enqueue)
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Hàng đợi sau khi thêm: " + queue);

        // Loại bỏ phần tử đầu tiên (dequeue)
        System.out.println("Phần tử bị loại bỏ: " + queue.poll()); // 10
        System.out.println("Hàng đợi sau khi loại bỏ: " + queue);

        // Thêm phần tử mới
        queue.add(40);
        System.out.println("Hàng đợi sau khi thêm 40: " + queue);

        // Loại bỏ tiếp
        System.out.println("Phần tử bị loại bỏ: " + queue.poll()); // 20
        System.out.println("Hàng đợi cuối cùng: " + queue);
    }
}
