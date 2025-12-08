package strings1;

import java.util.Scanner;

public class Ejer10 {
  private static String text, vocales = "AEIOUaeiou";
  public static void main(String[] args) {
    getNum();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    text = sc.nextLine();
  }

private static int counterLetterAlone() {
    int count = 0;

    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      if (Character.isLetter(c)) {
          // Primera posición y el siguiente un espacio
      boolean leftSpace = (i == 0) || (text.charAt(i - 1) == ' ');
        if (leftSpace) {
          for (int j = 0; j < vocales.length(); j++) {
            if (c == vocales.charAt(j)) {
              count++;
            }
          }
        }
      }
    }
    return count;
  }


  private static void printRes() {
    System.out.println("Palabras que empiezan por vocal: " + counterLetterAlone());
  }
}
