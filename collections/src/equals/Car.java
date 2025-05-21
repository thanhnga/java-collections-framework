package equals;

import java.util.Objects;

public class Car {
    private String make; // Hãng xe
    private int year;    // Năm sản xuất

    // Constructor
    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    // Override equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // So sánh cùng tham chiếu
        if (obj == null || getClass() != obj.getClass()) return false; // So sánh lớp
        Car car = (Car) obj;
        return year == car.year && Objects.equals(make, car.make); // So sánh nội dung
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", year=" + year +
                '}';
    }
}
