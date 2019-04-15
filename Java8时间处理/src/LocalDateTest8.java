import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateTest8 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Today is : " + today);
        System.out.println("Date after 1 week : " + nextWeek);

    }
}
