// Inline comments
/* 
  Block comments
*/
import java.util.Scanner;

public class Main {

  public static void main (String[] args) {
    // Print value
    System.out.println("Hello!");

    // Read value
    Scanner myObj = new Scanner(System.in);
    System.out.println("What's your name?");

    String userName = myObj.nextLine();
    System.out.println("Hello " + userName);

  }

}
