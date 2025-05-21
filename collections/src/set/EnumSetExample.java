package set;

import java.util.EnumSet;

public class EnumSetExample {

    public static void main(String[] args) {
        // Tạo một EnumSet chứa các ngày từ MONDAY đến FRIDAY
        EnumSet<Days> workingDays = EnumSet.range(Days.MONDAY, Days.FRIDAY);
        System.out.println("Working Days: " + workingDays);

        // Thêm SATURDAY vào EnumSet
        workingDays.add(Days.SATURDAY);
        System.out.println("Updated Working Days: " + workingDays);

        // Loại bỏ MONDAY khỏi EnumSet
        workingDays.remove(Days.MONDAY);
        System.out.println("Updated Working Days after removing MONDAY: " + workingDays);

    }
}