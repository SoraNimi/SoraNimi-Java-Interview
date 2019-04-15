import java.time.LocalDate;

public class LocalDateTest4 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date1 = LocalDate.of(2014, 01, 14);
        if (date1.equals(today)) {
            System.out.printf("Today %s and date1 %s are same date %n", today, date1);
        }
    }
}
