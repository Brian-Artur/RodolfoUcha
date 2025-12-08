package strings1;

import java.util.Scanner;

public class Ejer3 {
  // colocar la expresión regular dentro de los corchetes
  private static String text ="", regEx = "[aeiouAEIOU]";
  public static void main(String[] args) {
    getNum();
    remplaceVocals();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word: ");
    text = sc.nextLine();
  }

  private static void remplaceVocals() {
    text = text.replaceAll(regEx, "*");
  }

  private static void printRes() {
    System.out.println(text);
  }
}
