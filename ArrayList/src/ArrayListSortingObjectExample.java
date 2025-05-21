import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSortingObjectExample {

    public static void main(String[] args) {
        // Khởi tạo một ArrayList kiểu đối tượng Person
        ArrayList<Person> people = new ArrayList<>();

        // Thêm các phần tử vào ArrayList
        final Person a = new Person("A", 10);
        people.add(a);

        final Person b = new Person("B", 30);
        people.add(b);

        final Person c = new Person("C", 30);
        people.add(c);

        final Person d = new Person("D", 20);
        people.add(d);

        System.out.println("ArrayList: " + people);

        // Xóa phần tử khỏi mảng
        people.remove(c);
        System.out.println("ArrayList after removing C: " + people);

        // Đảo ngược 1 mảng
        Collections.reverse(people);
        System.out.println("Revert ArrayList: " + people);

        // Sắp xếp Person tăng dần theo độ tuổi
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("Sorted ArrayList ASC by age: " + people);

        // Sắp xếp Person giảm dần theo độ tuổi
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        System.out.println("Sorted ArrayList DESC by age: " + people);


    }
}
