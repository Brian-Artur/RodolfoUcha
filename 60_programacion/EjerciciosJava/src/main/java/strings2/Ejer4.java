package strings2;

import java.util.Scanner;

public class Ejer4 {
  private static String text1 ="", text2 = "", superString;
  public static void main(String[] args) {
    getData();
    concatString();
    printRes();
  }

  private static void getData() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a text");
    text1 = sc.nextLine();
    System.out.print("Enter a text");
    text2 = sc.nextLine();
  }

  private static void concatString() {
    superString = text1.concat(text2);
  }

  private static void printRes() {
    System.out.println(superString);
  }
}
