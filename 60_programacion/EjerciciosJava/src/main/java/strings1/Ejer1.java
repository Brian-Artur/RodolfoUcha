package strings1;

import java.util.Scanner;

public class Ejer1 {
  private static String text ="", regEx = "aeiouAEIOU";
  public static void main(String[] args) {
    getNum();
    countVocals();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word");
    text = sc.nextLine();
  }

  private static void countVocals() {
    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      for (int j = 0; j < regEx.length(); j++) {
        if (c == regEx.charAt(j)) {
          System.out.print(c + " ");
        }
      }
    }
  }
}
