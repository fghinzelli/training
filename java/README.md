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

  i = 0;
  while (i < 10) {
    // Go to next
    i++;
    continue;
  }

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


