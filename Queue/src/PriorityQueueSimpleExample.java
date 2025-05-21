import java.util.PriorityQueue;

public class PriorityQueueSimpleExample {

    public static void main(String[] args) {
        // Khởi tạo một PriorityQueue với Integer
        final PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Thêm các phần tử vào hàng đợi
        pq.add(9);
        pq.add(5);
        pq.add(7);
        pq.add(3);
        pq.add(1);

        // Không duy trì thứ tự các phần tử
        System.out.println("Phần tử trong queue: " + pq);

        // Đảm bảo phần tử đầu tiên là nhỏ nhất
        System.out.println("Phần tử nhỏ nhất: " + pq.peek());

        // Lặp qua các phần tử trong hàng đợi và loại bỏ chúng
        // Lúc này thì phẩn tử đầu tiên sau khi lấy ra luôn là phẩn tử nhỏ nhất
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
