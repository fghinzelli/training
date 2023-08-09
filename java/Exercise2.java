import java.util.*;

public class Exercise2 {
  public static boolean isAnagram(String test, String original) {  
    final char[] a = test.toLowerCase().toCharArray(), b = original.toLowerCase().toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    return Arrays.equals(a, b);
  }

  public static void main(String[] args) {
    if (new Exercise2().isAnagram("Buckethead", "DeathCubeK")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Failed");
    }
  }
}

