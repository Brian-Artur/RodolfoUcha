package strings1;

import java.util.Scanner;

public class Ejer14 {
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
    boolean inWord = false;
    words = 0; 
    String word = "";

    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);

      if (Character.isLetter(c)) {
        inWord = true;
        word += c;
      } else if (c == ' ') {
        if (inWord) { 
          System.out.println(word);
          words++;
          word = "";
          inWord = false;
        }
      }
    }
    if (inWord) {
      System.out.println(word);
      words++;
    }
    System.out.println("There're " + words + " words");
  }
}
