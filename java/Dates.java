import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Dates {
  public static void main(String[] args) {
    // Date
    LocalDate myDate = LocalDate.now();
    System.out.println(myDate);
    
    // Time
    LocalTime myTime = LocalTime.now();
    System.out.println(myTime);

    // Date and time
    LocalDateTime myDateTime = LocalDateTime.now();
    System.out.println(myDateTime); 

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
    System.out.println(myDateTime.format(dtf));

  }
}