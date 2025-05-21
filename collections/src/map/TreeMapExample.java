package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        // Tạo một TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Chèn các phần tử vào TreeMap
        treeMap.put(3, "Ba");
        treeMap.put(1, "Một");
        treeMap.put(2, "Hai");

        // Lặp qua các phần tử và in ra màn hình
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
