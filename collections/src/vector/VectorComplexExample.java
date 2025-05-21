package vector;

import java.util.Vector;

public class VectorComplexExample {
    public static void main(String[] args) {
        // Tạo một Vector
        final Vector<Integer> vector = new Vector<>();

        // Tạo và khởi chạy các luồng cùng thực hiện thêm và xóa phần tử khỏi Vector
        final Thread addThread = new Thread(new AddTask(vector));
        final Thread removeThread = new Thread(new RemoveTask(vector));

        addThread.start();
        removeThread.start();

        // Đợi các luồng hoàn thành
        try {
            addThread.join();
            removeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Hiển thị Vector sau khi các luồng đã thêm và xóa phần tử
        System.out.println("Vector: " + vector);
    }
}

