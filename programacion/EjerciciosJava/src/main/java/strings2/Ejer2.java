package strings2;

import java.util.Scanner;

public class Ejer2 {
  private static String text1 ="", text2 = "";
  public static void main(String[] args) {
    getData();
    checkStrings();
  }

  private static void getData() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a text");
    text1 = sc.nextLine();
    System.out.print("Enter a text");
    text2 = sc.nextLine();
  }

  private static boolean checkStrings() {
    boolean equal = text1.equals(text2);
    return equal;
  }

  private static void printRes() {
    if(checkStrings()){
      System.out.println("Son iguales");
    } else {
      System.out.println("Son distintos");
    }
  }
}
