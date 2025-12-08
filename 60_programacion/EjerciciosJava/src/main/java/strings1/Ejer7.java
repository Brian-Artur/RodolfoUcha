package strings1;

import java.util.Scanner;

public class Ejer7 {
  private static String text = "", textRemplace;
  private static String letter;
  public static void main(String[] args) {
    getNum();
    remplaceChar();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a text: ");
    text = sc.nextLine();
    System.out.print("Enter a letter: ");
    letter = String.valueOf(sc.nextLine().charAt(0));
  }

  private static void remplaceChar() {
    textRemplace = text.replaceAll(letter, "");
  }

  private static void printRes() {
    System.out.println("Texto reemplazado: " + textRemplace);
  }
}
