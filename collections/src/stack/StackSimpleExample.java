package stack;

import java.util.Stack;

public class StackSimpleExample {
    public static void main(String[] args) {
        final Stack<Integer> stack = new Stack<>();

        // Thêm phần tử vào stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // In ra stack
        System.out.println("Stack: " + stack);

        // Lấy phần tử ở đỉnh stack
        final int top = stack.peek();
        System.out.println("Phần tử ở đỉnh của stack: " + top);

        // Loại bỏ phần tử ở đỉnh stack
        final int removed = stack.pop();
        System.out.println("Phần tử được loại bỏ: " + removed);

        // Kiểm tra xem stack có rỗng không
        final boolean isEmpty = stack.empty();
        System.out.println("Stack rỗng: " + isEmpty);

        // Tìm kiếm một phần tử trong stack
        final int position = stack.search(2);
        System.out.println("Vị trí của phần tử 2 trong stack: " + position);
    }
}
