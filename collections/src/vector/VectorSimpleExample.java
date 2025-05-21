package vector;

import java.util.Vector;

public class VectorSimpleExample {
    public static void main(String[] args) {
        // Tạo một đối tượng Vector
        final Vector<Object> vector = new Vector<>();

        // Thêm các phần tử vào Vector
        vector.addElement("Apple");
        vector.addElement(123); // Số nguyên
        vector.addElement(3.14); // Số thực
        vector.addElement(true); // Boolean
        vector.addElement('A'); // Ký tự

        //  Hiển thị các phần tử của Vector
        System.out.println("Vector Elements: " + vector);

        // Hiển thị phần tử đầu tiên và phần tử cuối cùng của Vector
        System.out.println("First Element: " + vector.firstElement());
        System.out.println("Last Element: " + vector.lastElement());

        // Thêm một phần tử mới vào vị trí chỉ định
        vector.add(1, "Grapes");

        // Hiển thị số lượng phần tử và dung lượng của Vector
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());

        // Sao chép các phần tử của Vector vào một mảng
        final Object[] array = new Object[vector.size()];
        vector.copyInto(array);
        System.out.println("Copied Array:");
        for (Object item : array) {
            System.out.println(item);
        }

        // Loại bỏ một phần tử khỏi Vector
        vector.removeElement(123); // Loại bỏ số nguyên 123

        // Loại bỏ phần tử tại vị trí chỉ định khỏi Vector
        vector.removeElementAt(2); // Loại bỏ số thực 3.14

        // Hiển thị các phần tử còn lại của Vector
        System.out.println("Remaining Elements:");
        for (Object item : vector) {
            System.out.println(item);
        }

        // Giảm kích thước nội bộ của Vector để phù hợp với số lượng phần tử hiện tại
        vector.trimToSize();

        // Hiển thị lại dung lượng của Vector sau khi đã giảm kích thước
        System.out.println("Capacity After Trimming: " + vector.capacity());
    }
}
