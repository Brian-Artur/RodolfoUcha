package strings1;

import java.util.Scanner;

public class Ejer15 {
    private static String text = "";
    private static int words = 0;

  public static void main(String[] args) {
    getText();
    countWords();
  }

  private static void getText() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word or phrase: ");
    text = sc.nextLine();
  }

  private static void countWords() {
    String word = "";

    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);

      if (Character.isDigit(c)) {
        word += c;
      }
    }
    System.out.print(word);
  }
}