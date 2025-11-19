package strings1;

import java.util.Scanner;

public class Ejer9 {
  private static String text, textCase = "";

  public static void main(String[] args) {
    getNum();
    changeCase();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a text: ");
    text = sc.nextLine();
  }

  private static void changeCase() {
    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      if (Character.isLowerCase(c)) {
        textCase += Character.toUpperCase(c);
      } else if (Character.isUpperCase(c)) {
        textCase += Character.toLowerCase(c);
      } else {
        textCase += c;
      }
    }
  }

  private static void printRes() {
    System.out.println(textCase);
  }
}
