import java.util.Objects;

public class Car {
    private String make; // Hãng xe
    private int year;    // Năm sản xuất

    // Constructor
    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(make, car.make);
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
