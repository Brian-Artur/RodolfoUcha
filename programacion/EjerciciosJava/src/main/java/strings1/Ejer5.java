package strings1;

import java.util.Scanner;

public class Ejer5 {
  private static String text, result;
  private static char[] chars, invertido;
  public static void main(String[] args) {
    getNum();
    makeInvert();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word: ");
    text = sc.nextLine();
  }

  private static void makeInvert() {
    chars = text.toCharArray();
    invertido = new char[chars.length];
    for (int i = 0; i < text.length(); i++) {
      invertido[i] = chars[chars.length - 1 - i];
    }
    result = new String(invertido);
  }

  private static void printRes() {

      System.out.println("Original: " + text);

      System.out.println("Invertido: " + invertido);

  }
}
