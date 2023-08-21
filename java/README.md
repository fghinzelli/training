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
  // Non primitive
  String txt = "Text";
  // Wrapper Classes
  Byte, Short, Integer, Long, Float, Double, Boolean, Character

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
```
### 6. Operators ###
```java
  /* Arithmetic */
  +  // Addition
  -  // Subtraction
  *  // Multiplication
  /  // Division
  Math.pow(n, e) // Power
  Math.sqrt(n) // Power
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
### 8. Loops ###
### 9. Methods ###
### 10. String methods ###
```java
  String txt = "Sample text";
  // UPPERCASE
  txt.toUpperCase(); 
  // lowercase
  txt.toLowerCase(); 
  // Find index of string
  txt.indexOf("text") // Outputs 7


```
### 11. Cocatenation ###
```java
  System.out.println("Text" + myVar);
```

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

```java

```


