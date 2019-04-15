import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LocalDateTest15 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate java8Release = LocalDate.of(2014, Month.MARCH, 14);
        Period periodToNextJavaRelease =
                Period.between(today, java8Release);
        System.out.println("Months left between today and Java 8 release : " + periodToNextJavaRelease.getMonths());

    }
}

