import java.util.HashSet;

public class HashSetCar {
    public static void main(String[] args) {
        // Tạo danh sách ArrayList
        HashSet<Car> cars = new HashSet<>();

        // Thêm các phần tử
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Honda", 2019);
        cars.add(car1);
        cars.add(car2);


        // Tạo một đối tượng mới có nội dung giống car1
        Car car3 = new Car("Toyota", 2020);
        System.out.println(car3);

        // So sánh
        System.out.println("car1 equals car3: " + car1.equals(car3)); // true

        // Sử dụng contains để kiểm tra sự tồn tại
        System.out.println("cars contains car3: " + cars.contains(car3)); // true

        // Xóa đối tượng car3 (gọi equals để so sánh)
        cars.remove(car3);

        // Kiểm tra lại danh sách
        System.out.println("cars after removing car3: " + cars); // [Car{make='Honda', year=2019}]
    }
}
