package equals;

import java.util.ArrayList;

public class ArrayListCar {
    public static void main(String[] args) {
        // Tạo danh sách ArrayList
        ArrayList<Car> cars = new ArrayList<>();

        // Thêm các phần tử
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Honda", 2019);
        cars.add(car1);
        cars.add(car2);

        // Tạo một đối tượng mới có nội dung giống car1
        Car car3 = new Car("Toyota", 2020);

        // Sử dụng contains để kiểm tra sự tồn tại
        System.out.println("List contains car3: " + cars.contains(car3)); // true

        // Xóa đối tượng car3 (gọi equals để so sánh)
        cars.remove(car3);

        // Kiểm tra lại danh sách
        System.out.println("List after removing car3: " + cars); // [Car{make='Honda', year=2019}]
    }
}
