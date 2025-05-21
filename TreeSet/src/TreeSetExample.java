import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        // Tạo một TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Thêm phần tử vào TreeSet
        // Sau khi thêm các phần tử được sắp xếp tăng dần theo tự nhiên
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(10);

        // In ra TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Set không chứa các phần tử trùng lặp
        treeSet.add(3);

        // Hiển thị các phần tử Set sau khi add phần tử trùng lặp
        System.out.println("TreeSet: " + treeSet);

        // Xóa một phần tử từ TreeSet
        treeSet.remove(3);
        System.out.println("TreeSet sau khi xóa phần tử 3: " + treeSet);

        // Duyệt qua Set và in ra màn hình
        for (Integer i : treeSet) {
            System.out.println(i);
        }
    }

}
