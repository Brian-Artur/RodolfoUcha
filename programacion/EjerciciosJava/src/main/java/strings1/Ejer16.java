package strings1;

import java.util.Scanner;

public class Ejer16 {
    private static String text = "", word = "" ;

  public static void main(String[] args) {
    getText();
    findOccurrences();
  }

  private static void getText() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a phrase: ");
    text = sc.nextLine();
    System.out.print("Enter a word: ");
    word = sc.nextLine();
  }

  private static void findOccurrences() {
    boolean found = false;

    for (int i = 0; i <= text.length() - word.length(); i++) {
      int j = 0;

      // Compara carácter por carácter
      while (j < word.length() && text.charAt(i + j) == word.charAt(j)) {
        j++;
      }

      // Si se recorrió toda la palabra, hay coincidencia
      if (j == word.length()) {
        System.out.println("Found at position: " + i);
        found = true;
      }
    }

    if (!found) {
      System.out.println("The word is not contained in the text.");
    }
  }
}
