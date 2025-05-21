import java.util.ArrayDeque;

public class ArrayDequeExample {

    public static void main(String[] args) {
        final ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addLast(4);

        System.out.println("Deque: " + deque); // Output: Deque: [3, 1, 2, 4]

        System.out.println("First element: " + deque.getFirst()); // Output: First element: 3
        System.out.println("Last element: " + deque.getLast()); // Output: Last element: 4

        deque.removeFirst();
        deque.removeLast();

        System.out.println("Deque after removal: " + deque); // Output: Deque after removal: [1, 2]
    }
}
