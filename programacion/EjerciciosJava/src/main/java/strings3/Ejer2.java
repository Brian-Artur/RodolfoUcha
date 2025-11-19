package strings3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer2 {
  public static String word1, word2;
  public static void main(String[] args) {
    getwords();
    lower();
    iqualLength();
    }

  private static void getwords() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Palabra 1: ");
    word1 = sc.nextLine();
    System.out.print("Palabra 2: ");
    word2 = sc.nextLine();
  }

  private static void lower() {
    word1 = word1.toLowerCase();
    word2 = word2.toLowerCase();
  }

  private static void iqualLength() {
    if (word1.length() != word2.length()) {
      System.out.println("No son anagramas");
    } else {
      // 4️⃣ Convertimos las palabras en arrays de caracteres
      char[] letras1 = word1.toCharArray();
      char[] letras2 = word2.toCharArray();

      // 5️⃣ Ordenamos los arrays alfabéticamente
      Arrays.sort(letras1);
      Arrays.sort(letras2);

      // 6️⃣ Comparamos si los arrays son iguales
      if (Arrays.equals(letras1, letras2)) {
        System.out.println("Son anagramas.");
      } else {
        System.out.println("No son anagramas.");
      }
    }
  }
}