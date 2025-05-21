import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSortingObject2Example {

    public static void main(String[] args) {
        // Khởi tạo một ArrayList kiểu Integer
        final ArrayList<Person> people = new ArrayList<>();

        // Thêm các phần tử vào ArrayList
        people.add(new Person("A", 10));
        people.add(new Person("B", 30));
        people.add(new Person("C", 30));
        people.add(new Person("D", 20));

        // Đảo ngược 1 mảng
        Collections.reverse(people);
        System.out.println("Revert ArrayList: " + people);

        // Sắp xếp Person tăng dần theo độ tuổi và tên
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                final int result = o1.getAge() - o2.getAge();
                // nếu tuổi bằng nhau thì so sánh tên
                if (result == 0)
                    return o1.getName().compareTo(o2.getName());
                else
                    return result;
            }
        });
        System.out.println("Sorted ArrayList ASC by age and name: " + people);

        // Sắp xếp Person giảm dần theo độ tuổi và tên
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                final int result = o2.getAge() - o1.getAge();
                // nếu tuổi bằng nhau thì so sánh tên
                if (result == 0)
                    return o2.getName().compareTo(o1.getName());
                else
                    return result;
            }
        });
        System.out.println("Sorted ArrayList DESC by age and name: " + people);


    }
}
