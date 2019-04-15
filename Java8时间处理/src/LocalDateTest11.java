import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class LocalDateTest11 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = LocalDate.of(2014, 1, 15);
        if (tomorrow.isAfter(today)) {
            System.out.println("Tomorrow comes after today");
        }
        LocalDate yesterday = today.minus(1, DAYS);
        if (yesterday.isBefore(today)) {
            System.out.println("Yesterday is day before today");
        }

    }
}
