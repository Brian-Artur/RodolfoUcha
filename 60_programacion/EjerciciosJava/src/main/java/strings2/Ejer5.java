package strings2;

import java.util.Scanner;

public class Ejer5 {
  private static String text = "";
  private static char letter;
  private static int count = 0;
  public static void main(String[] args) {
    getNum();
    countLetters();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);

    // Pedir la cadena al usuario
    System.out.print("Enter a text: ");
    text = sc.nextLine();

    // Pedir la letra a buscar
    System.out.println("Enter the letter you want to find");
    letter = sc.next().charAt(0);

    System.out.print("La letra '" + letter + "' aparece en las posiciones: ");
  }

  private static void countLetters() {
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == letter) {
        count++;
        System.out.print(i + " ");
      }
    }
  }

  private static void printRes() {
    System.out.println("\nTotal de apariciones: " + count);
  }
}
