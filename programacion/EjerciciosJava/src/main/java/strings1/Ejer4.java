package strings1;

import java.util.Scanner;

public class Ejer4 {
  private static String text ="";
  private static boolean isPalindrome = true;
  public static void main(String[] args) {
    getNum();
    checkPalindrome();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word: ");
    text = sc.nextLine();
  }

  private static void checkPalindrome() {
    for (int i = 0; i < text.length(); i++) {
      for (int j = text.length() - 1; j >= 0; j--) {
        if (i == (text.length() - 1 - j) && text.charAt(i) != text.charAt(j)) {
          
        }
      }
    }
  }

  private static void printRes() {
    if (isPalindrome) {
      System.out.printf("La palabra %s es un palíndromo", text);
    } else {
      System.out.println("Nada nuevo bajo el sol");
    };
  }
}
