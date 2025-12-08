package strings1;

import java.util.Scanner;

public class Ejer11 {
    private static String text = "";

  public static void main(String[] args) {
    getText();
    printAsciiValues();
  }

  private static void getText() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word or phrase: ");
    text = sc.nextLine();
  }

  private static void printAsciiValues() {
    System.out.println("Valores de caracteres en ASCII:");
    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      int ascii = (int) c; // conversión explícita de char a int
      System.out.println("\tCaracter '" + c + "': " + ascii);
    }
  }
}
