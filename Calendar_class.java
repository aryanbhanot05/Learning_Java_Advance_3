package Java_Advance_3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Calendar_class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType() + " calendar");
        System.out.println();
        System.out.println(c.getTimeZone());
        System.out.println();
        System.out.println(c.getTime());
        System.out.println();
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + " : " + c.get(Calendar.MINUTE));

        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c1.getCalendarType() + " calendar");
        System.out.println();
        System.out.println(c1.getTimeZone().getID());
        System.out.println();
        System.out.println(c1.getTime() + " in Singapore Time Zone");

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2023));
        System.out.println(gc.isLeapYear(2024));
        System.out.println();
        for (String id :TimeZone.getAvailableIDs()){
            System.out.println(id);
        };
    }
}