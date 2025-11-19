package strings1;

import java.util.Scanner;

public class Ejer8 {
  private static String text = "";
  private static int count = 0;
  public static void main(String[] args) {
    getNum();
    countLetters();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a text: ");
    text = sc.nextLine();
  }

  private static void countLetters() {
    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      if (Character.isLetter(c)) {
        count++;
      }
    }
  }

  private static void printRes() {
    System.out.println("Hay " + count + " letras.");
  }
}
