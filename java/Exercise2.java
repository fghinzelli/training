import java.util.HashMap;

public class Exercise2 {
  public static boolean isAnagram(String test, String original) {  
    return createArray(original.toUpperCase()).equals(createArray(test.toUpperCase()));
  }

  public static HashMap<Character, Integer> createArray(String text) {
    HashMap<Character, Integer> lista = new HashMap<Character, Integer>();
    for (int i=0; i<text.length(); i++) {
      char letter = text.charAt(i);
      if (!lista.containsKey(letter)) {
        lista.put(letter, 1);
      } else {
        lista.put(letter, lista.get(letter) + 1);
      }
    }
    return lista;
  }

  public static void main(String[] args) {
    if (new Exercise2().isAnagram("Buckethead", "DeathCubeK")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Failed");
    }
  }
}

