import java.util.HashMap;
import java.util.Map;

public class HashMapPerson {

    public static void main(String[] args) {
        // Tạo HashMap lưu Person, với key là mã định danh (ID)
        Map<String, Person> personMap = new HashMap<>();

        // Thêm các đối tượng Person vào HashMap
        personMap.put("P001", new Person("Nguyễn Văn A", 25));
        personMap.put("P002", new Person("Trần Thị B", 30));
        personMap.put("P003", new Person("Lê Hoàng C", 22));

        // Duyệt qua các phần tử trong HashMap
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
        System.out.println("Sau khi xóa, danh sách: " + personMap);
    }
}
