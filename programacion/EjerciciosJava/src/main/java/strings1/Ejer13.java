package strings1;

import java.util.Scanner;

public class Ejer13 {
    private static String text = "", newText = "";

  public static void main(String[] args) {
    getText();
    alternCase();
    printAsciiValues();
  }

  private static void getText() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word or phrase: ");
    text = sc.nextLine();
  }

  private static void alternCase() {
    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      int asciiNum = (int) c;
      if (Character.isUpperCase(c) && i % 2 != 0) {
        asciiNum += 32;
      } else if (Character.isLowerCase(c) && i % 2 == 0) {
        asciiNum -= 32;
      }
      char newC = (char) asciiNum;
      newText += newC;
    }
  }

  private static void printAsciiValues() {
    System.out.println(newText);
  }
}
