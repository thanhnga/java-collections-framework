import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTablePerson {

    public static void main(String[] args) {
        // Tạo Hashtable lưu Person, với key là mã định danh (ID)
        Map<String, Person> personHashTable = new Hashtable<>();

        // Thêm các đối tượng Person vào Hashtable
        personHashTable.put("P001", new Person("Nguyễn Văn A", 25));
        personHashTable.put("P002", new Person("Trần Thị B", 30));
        personHashTable.put("P003", new Person("Lê Hoàng C", 22));

        // Duyệt qua các phần tử trong Hashtable
        for (Map.Entry<String, Person> entry : personHashTable.entrySet()) {
            String id = entry.getKey();
            Person person = entry.getValue();
            System.out.println("ID: " + id + ", Person: " + person);
        }

        // Tìm kiếm Person theo key
        String searchId = "P002";
        Person foundPerson = personHashTable.get(searchId);
        if (foundPerson != null) {
            System.out.println("Tìm thấy: " + foundPerson);
        } else {
            System.out.println("Không tìm thấy Person với ID: " + searchId);
        }

        // Xóa một Person theo key
        personHashTable.remove("P003");
        System.out.println("Sau khi xóa, danh sách: " + personHashTable);
    }
}
