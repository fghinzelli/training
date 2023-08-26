### 1. Comments ###
```java
//Inline comment
/*
  Block comment
*/
```

### 2. Printing ###
```java
System.out.println("Output text");
System.out.print("Output text without ln");
```

### 3. Reading ###
```java
import java.util.Scanner;

class Reader {
  public static void main (String[] args) {
    Scanner myScan = new Scanner(System.in);
    System.out.println("What's your age?");
    String name = myScan.nextLine();
    System.out.println("Hi " + name);
  }
}
```
### 4. Variables and Data Types ###
Variables are **statically** typed
```java
  // Primitive
  byte myByte = 100;
  short myShort = 500;
  int myInt = 50000;
  long myLong = 1555555L;
  float myFloat = 23424f;
  double myDouble = 234234d;
  char myChar = 'B'; 
  boolean isTrue = true;
  // No primitive
  String txt = "Text";
  // Wrapper Classes
  Byte, Short, Integer, Long, Float, Double, Boolean, Character

  // Lists
  List<Integer> varList = Arrays.asList(1, 3, 4); // list (mutable)
  List<Integer> varArrayList = new ArrayList<>(Arrays.asList(1, 3, 4)); // arraylist (mutable)
  Tuple<Integer, Integer, Integer> varTuple = new Tuple<>(1, 3, 4); // tuple (immutable)
  int[] varArray = new int[]{1, 3, 4}; // array (mutable)
  Set<String> varSet = new HashSet<>(Arrays.asList("a", "b", "c")); // set (items are immutable)
  Map<String, Integer> varMap = new HashMap<>(); // map
  varMap.put("a", 1);
  varMap.put("b", 2);
  varMap.put("c", 3);
  Integer myVar = null; 

  // Verify type of variable
  String myVar = "Text";
  if (myVar instanceof String) {
    System.out.println("I am a String");
  }
  int myNumber = 10;
  System.out.println("My type is" + (Object) myNumber).getClass().getName())
```

### 5. Cast data types ### 
```java
  // Automatic 
  // byte -> short -> char -> int -> long -> float -> double
  int myInt = 100;
  long myLong = myInt;
  // Necessary manual cast
  // double -> float -> long -> int -> char -> short -> byte
  long myLong = myLong;
  int myInt = (int) myLong;
  int intValue = Integer.parseInt("123");
  double doubleValue = Double.parseDouble("3.14");
  String strValue = String.valueOf(42);
  boolean boolValue = Boolean.parseBoolean("true");
```
### 6. Operators ###
```java
  /* Arithmetic */
  +  // Addition
  -  // Subtraction
  *  // Multiplication
  /  // Division
  Math.pow(n, e) // Power
  Math.sqrt(n) // Raiz quadrada
  %  // Modulo
  ++ // Increment
  -- // Decrement

  /* Assignment */
  +=, -=, *=, /=

  /* Logical */
  && // AND
  || // OR
  !  // NOT
```

### 7. Conditional Statements ###
```java
  int myVar = 10;
  if (myVar < 10) {
      System.out.println("minor");
  } else if (myVar == 10) {
      System.out.println("equal");
  } else {
      System.out.println("major");
  }
```
### 8. Loops ###
```java
  for (int i = 0; i < 10; i++) {
      System.out.println(i);
  }

  int i = 0;
  while (i < 10) {
    // Go to next
    i++;
    continue;
  }

  int numero = 1;
  do {
      System.out.println("Número: " + numero);
      numero++;
  } while (numero <= 5);

  // TODO

```
### 9. Functions ###
```java
  static void myFunction(String... parameters) {
      System.out.println(parameters[2]);
  }
```

### 10. String methods ###
```java
  String x = "The best things in life are free!";
  System.out.println("String size: " + x.length());
  System.out.println("Contains 'best': " + x.contains("best"));
  System.out.println("Substring: " + x.substring(2, 5));
  System.out.println("Uppercase: " + x.toUpperCase());
  System.out.println("Lowercase: " + x.toLowerCase());
  System.out.println("Trim: " + x.trim());
  System.out.println("Replace: " + x.replace("best", "amazing"));
  System.out.println("Split: " + Arrays.toString(x.split(" ")));
  String concat = "Text" + myVar;
  int index = x.indexOf("life");
  String formatted = String.format("Name: %s, Age: %d", "John Snow", 25);


```
### 11. Date format (convertion methods) ###
```java
Date currentDate = new Date();
SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
String formattedDate = dateFormat.format(currentDate);
```

### 12. Arrays ###
```java
  List<String> myArrayList = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));
  System.out.println("Size: " + myArrayList.size());
  System.out.println("Index: " + myArrayList.get(0));
  System.out.println("Contains 'apple': " + myArrayList.contains("apple"));
  myArrayList.set(1, "Grape");
  myArrayList.remove("apple");
  myArrayList.remove(1);
  myArrayList.clear();
``` 

### 13. Files (read and write) ###

```java
  // Reading
  try {
    Scanner scanner = new Scanner(new File("file.txt"));
    while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
    }
    scanner.close();
  } catch (FileNotFoundException e) {
    e.printStackTrace();
  }
  // Writing
  try {
      FileWriter writer = new FileWriter("file.txt");
      writer.write("New line");
      writer.close();
  } catch (IOException e) {
      e.printStackTrace();
  }
``` 
### 14. Exceptions ###
```java
  try {
    throw new Exception("Error on try");
  } catch (Exception e) {
      System.out.println(e.getMessage());
  } finally {
      // Do something
  }
``` 
### 15. Classes/Objects ###
```java
class Person {
  private String firstName;
  private String lastName;

  public Person(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
  }

  @Override
  public String toString() {
      return firstName + " " + lastName;
  }

  public void myFunction() {
      System.out.println("Hello " + firstName + " " + lastName + "!");
  }
}
``` 
### 16. Inheritance, Encapsulation and Polymorphism ###
```java
class Student extends Person {
  private int age;

  public Student(String firstName, String lastName, int age) {
      super(firstName, lastName);
      this.age = age;
  }

  @Override
  public String toString() {
      return super.toString() + " (" + age + ")";
  }
}

public static void main(String[] args) {
  Main main = new Main();
  Person person = main.new Person("John", "Doe");
  System.out.println(person);
  Student student = main.new Student("Alice", "Smith", 20);
  System.out.println(student);
}
``` 
### 17. Connection to database ###
```java
  import java.sql.*;

  public class Main {
    String url = "jdbc:mysql://localhost/database";
    String user = "user";
    String password = "password";

    Connection connection = null;
    PreparedStatement preparedStatement = null

    try {
      connection = DriverManager.getConnection(url, user, password);
      // Insert
      String insertSql = "INSERT INTO users (username, age) VALUES ('John', 25)";
      preparedStatement = connection.prepareStatement(insertSql);
      preparedStatement.setString(1, "John");
      preparedStatement.setString(2, "Snow");
      int rowInserted = preparedStatement.executeUpdate();
      System.out.println(rowsInserted + " Record inserted");
      // Select
      String selectSql = "SELECT firstname, lastname FROM USERS";
      preparedStatement = connection.prepareStatement(selectSql);
      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        String firstName = resultSet.getString("firstname");
        String lastname = resultSet.getString("lastname");
        System.out.println("First name: " + firstname + ", Last name: " + lastname);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      preparedStatement.close();
      connection.close();
    }
  }
``` 
### 18. HTTP Server (API)
```java
  import com.sun.net.httpserver.*;
  import java.io.*;
  import java.net.InetSocketAddress;

  public class Main {
    public static void main(String[] args)  throws Exception {
      HttpServer server = HttpServer.create(new InetSocketAddress(8989), 0);
      server.createContext("/users", new MyHandler());
      server.setExecutor(null);
      server.start();
    }

    static class MyHandler implements HttpHandler {
      @Override
      public void handle(HttpExchange t) throws IOException {
        String response = "{\"username\": \"user\", \"age\": 25}";;
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody()
        os.write(response.getBytes());
        os.close();
      }
    }
  }

```
### 19. HTTP Client
```java

```
### 20. Tests ###
```java
import org.junit.*;

public class JUnitProgram {
  @Test
  public void test_JUnit {
    System.out.println("This is the test case in this class");
    String str1 = "Result to test";
    assertEquals("Result to test", str1);
  }
}

```


