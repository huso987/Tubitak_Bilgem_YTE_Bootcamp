import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.time.Period;


public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("-----Doğum Günü Tebrik Programı------");
      System.out.print("Doğum Gününüzü ve Saatini Girin:(örn: 2000-09-15 14:30)= ");
      String dogumGunu = scanner.nextLine();

      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
      LocalDateTime dogumG = LocalDateTime.parse(dogumGunu, formatter);

      LocalDateTime bugun = LocalDateTime.now();

      if(dogumG.getMonthValue() == bugun.getMonthValue() && dogumG.getDayOfMonth() == bugun.getDayOfMonth()) {
          System.out.println("Bugun Doğum gününüz! İyi ki doğdunuz!");
      }
      scanner.close();
    }
}