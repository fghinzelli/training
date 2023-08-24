import java.util.Scanner;

public class Bee1607 {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    int totalOperacoes = myScanner.nextInt();
    String alfabeto = "abcdefghijklmnopqrstuvwxyz";
    myScanner.nextLine();
    for (int i=0; i< totalOperacoes; i++) {
      String valores = myScanner.nextLine();
      String texto1 = valores.split(" ")[0];
      String texto2 = valores.split(" ")[1];

      int totalMovimentos = 0;
      for (int li=0; li<texto1.length(); li++){
        int indiceLetraTexto1 = alfabeto.indexOf(texto1.charAt(li)) + 1;
        int indiceLetraTexto2 = alfabeto.indexOf(texto2.charAt(li)) + 1;
        if (indiceLetraTexto2 > indiceLetraTexto1) {
          totalMovimentos += indiceLetraTexto2 - indiceLetraTexto1;
        } else if (indiceLetraTexto2 < indiceLetraTexto1){
          totalMovimentos += ((alfabeto.length() - indiceLetraTexto1) + indiceLetraTexto2);
        }
         
      }
      System.out.println(totalMovimentos);
    }
  }
}