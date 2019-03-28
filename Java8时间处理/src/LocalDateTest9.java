import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.YEARS;

public class LocalDateTest9 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate previousYear = today.minus(1, YEARS);
        System.out.println("Date before 1 year : " + previousYear);
        LocalDate nextYear = today.plus(1, YEARS);
        System.out.println("Date after 1 year : " + nextYear);
    }
}
