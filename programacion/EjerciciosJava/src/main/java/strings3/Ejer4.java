package strings3;

import java.util.Scanner;

public class Ejer4 {
  private static String text ="", regEx = "[aeiouAEIOU]", woVoc = "";
  public static void main(String[] args) {
    getData();
    concatString();
    printRes();
  }

  private static void getData() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a text: ");
    text = sc.nextLine();

  }

  private static void concatString() {
    woVoc = text.replaceAll(regEx, "");
  }

  private static void printRes() {
    System.out.println(woVoc);
  }
}
