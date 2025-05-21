package vector;

import java.util.Vector;

class RemoveTask implements Runnable {
    private final Vector<Integer> vector;

    public RemoveTask(Vector<Integer> vector) {
        this.vector = vector;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            if (!vector.isEmpty()) {
                final int removed = vector.remove(0);
                System.out.println("Removed: " + removed);
                //System.out.println("Vector elements: " + vector);
            }
            try {
                Thread.sleep(100); // Giả lập việc xử lý
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
