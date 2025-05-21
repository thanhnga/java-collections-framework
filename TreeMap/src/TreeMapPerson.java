import java.util.Map;
import java.util.TreeMap;

public class TreeMapPerson {
    public static void main(String[] args) {
        // Tạo TreeMap lưu Person, với key là mã định danh (ID)
        Map<String, Person> personMap = new TreeMap<>();

        // Thêm các đối tượng Person vào TreeMap
        personMap.put("P003", new Person("Lê Hoàng C", 22));
        personMap.put("P001", new Person("Nguyễn Văn A", 25));
        personMap.put("P002", new Person("Trần Thị B", 30));

        // Duyệt qua các phần tử trong TreeMap
        System.out.println("Danh sách các Person (theo thứ tự key tăng dần):");
        for (Map.Entry<String, Person> entry : personMap.entrySet()) {
            String id = entry.getKey();
            Person person = entry.getValue();
            System.out.println("ID: " + id + ", Person: " + person);
        }

        // Tìm kiếm Person theo key
        String searchId = "P002";
        Person foundPerson = personMap.get(searchId);
        if (foundPerson != null) {
            System.out.println("Tìm thấy: " + foundPerson);
        } else {
            System.out.println("Không tìm thấy Person với ID: " + searchId);
        }

        // Xóa một Person theo key
        personMap.remove("P003");
        System.out.println("Sau khi xóa, danh sách (theo thứ tự key tăng dần):");
        for (Map.Entry<String, Person> entry : personMap.entrySet()) {
            String id = entry.getKey();
            Person person = entry.getValue();
            System.out.println("ID: " + id + ", Person: " + person);
        }
    }
}
