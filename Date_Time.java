package Java_Advance_3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalDate ld1 = LocalDate.of(10, 11, 15);
        System.out.println(ld1);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E-dd-MM-yyyy  HH:mm:ss");
        System.out.println(ldt.format(dtf));
        // We can not add any other text in the DateTimeFormatter
    }
}
