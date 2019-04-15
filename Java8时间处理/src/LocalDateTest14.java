import java.time.LocalDate;

public class LocalDateTest14 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        if (today.isLeapYear()) {
            System.out.println("This year is Leap year");
        } else {
            System.out.println("2018 is not a Leap year");
        }
    }
}
