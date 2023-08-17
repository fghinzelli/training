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
```

### 3. Reading ###
```java
import java.util.Scanner;

class Reader {
  public static void main (String[] args) {
    Scanner myScan = new Scanner(System.in);

    System.out.println("Who are you?");
    String name = myScan.nextLine();
    System.out.println("Hi " + name);
  }
}
```

### 4. Cocatenation ###
```java
System.out.println("Text" + myVar);
```

### 5. Variables and Data Types ###
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
  // Non primitive
  String txt = "Text";
  // Wrapper Classes
  Byte, Short, Integer, Long, Float, Double, Boolean, Character
```

### 6. Cast data types ### 
```java
  // Automatic 
  // byte -> short -> char -> int -> long -> float -> double
  int myInt = 100;
  long myLong = myInt;
  // Necessary manual cast
  // double -> float -> long -> int -> char -> short -> byte
  long myLong = myLong;
  int myInt = (int) myLong;
```
### 7. Operators ###
```java
  /* Arithmetic */
  +  // Addition
  -  // Subtraction
  *  // Multiplication
  /  // Division
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

### 8. Conditional Statements ###
### 9. Loops ###
### 10. Methods ###
### 11. String methods ###
### 13. Objects ###
### 14. Access modifiers ###
### 15. Data Structures ###
### 16. Inheritance ###
### 17. Polymorphism ###
### 18. Connection to database ###
### 19. Receiving HTTP request ###
### 20. Return JSON response ###
### 21. Tests ###
### 22. Date format (convertion methods) ###


