package strings1;

import java.util.Scanner;

public class Ejer2 {
  private static String text ="";
  private static int cap = 0, low = 0;
  public static void main(String[] args) {
    getNum();
    countVocals();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word");
    text = sc.nextLine();
  }

  private static void countVocals() {
    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      Character.isUpperCase(c);
      if (Character.isUpperCase(c)) {
        cap++;
      } else if (Character.isLowerCase(i)) {
        low++;
      }
    }
  }
  private static void printRes() {
    System.out.printf("There's %d capital letters and %d low letters",cap, low);
  }
}
