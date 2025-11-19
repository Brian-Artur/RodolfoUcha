package stringbuilder;

import java.util.Scanner;

public class Ejer3 {
  private static String text ="";
  public static void main(String[] args) {
    getData();
    print();
  }

  private static void getData() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a text: ");
    text = sc.nextLine();
  }

  private static StringBuilder buildear() {
    StringBuilder strB = new StringBuilder(text);
    return strB.reverse();
  }

  private static void print() {
    System.out.println(buildear());
  }
}
