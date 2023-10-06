import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
      Date date = new Date();
      System.out.println("Date: "+date);

        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime: "+localTime);
        System.out.println(LocalTime.of(1,1));
        System.out.println("getHour: "+ localTime.getHour());
        System.out.println("getMinute: "+ localTime.getMinute());

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println("Max: "+ LocalDate.MAX);
        System.out.println("Min: "+ LocalDate.MIN);
        System.out.println("getYear: "+ localDate.getYear());
        System.out.println("getMonth: "+ localDate.getMonth());
        System.out.println("getMonthValue: "+ localDate.getMonthValue());
        System.out.println("getDayofMonth: "+ localDate.getDayOfMonth());
        System.out.println("getDayofWeek: "+ localDate.getDayOfWeek());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println("Max: "+LocalDateTime.MAX);
        System.out.println(LocalDateTime.of(localDate, localTime));

    }
}