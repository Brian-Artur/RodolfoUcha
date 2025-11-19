package strings4;

import java.util.Scanner;

public class Ejer1 {
  public static String word1, word2;
  public static void main(String[] args) {
    getwords();
    String sortedText = sortChars(word1);
    printRes(sortedText);
    }

  private static void getwords() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Palabra 1: ");
    word1 = sc.nextLine();
    System.out.print("Palabra 2: ");
    word2 = sc.nextLine();
  }

  private static String sortChars(String text) {
    StringBuilder sorted = new StringBuilder();
    StringBuilder original = new StringBuilder(text);

    while (original.length() > 0) {
      // 1. Encontrar el carácter mínimo
      char minChar = original.charAt(0);
      for (int i = 1; i < original.length(); i++) {
        if (original.charAt(i) < minChar) {
          minChar = original.charAt(i);
        }
      }

      // 2. Contar cuántas veces aparece ese carácter
      int count = 0;
      for (int i = 0; i < original.length(); i++) {
        if (original.charAt(i) == minChar) {
          count++;
        }
      }

      // 3. Añadir todas las apariciones al resultado
      for (int i = 0; i < count; i++) {
        sorted.append(minChar);
      }

      // 4. Eliminar todas las apariciones del carácter mínimo del texto original
      int index = 0;
      while (index < original.length()) {
        if (original.charAt(index) == minChar) {
          original.deleteCharAt(index);
        } else {
          index++;
        }
      }
    }

    return sorted.toString();
  }
  
  private static void printRes(String text) {
    System.out.println(text);
  }
}