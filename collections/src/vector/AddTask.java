package vector;

import java.util.Vector;

class AddTask implements Runnable {
    private final Vector<Integer> vector;

    public AddTask(Vector<Integer> vector) {
        this.vector = vector;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            vector.add(i);
            System.out.println("Added: " + i);
            System.out.println("Vector elements: " + vector);
            try {
                Thread.sleep(100); // Giả lập việc xử lý
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
