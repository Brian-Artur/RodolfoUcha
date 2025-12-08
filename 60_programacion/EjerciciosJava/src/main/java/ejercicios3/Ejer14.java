package ejercicios3;

import java.util.Scanner;

public class Ejer14 {
  private static int num;
  public static void main(String[] args) {
    getNum();
    printTriangleMet();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    num = sc.nextInt();
  }

  private static void printTriangleMet() {
    System.out.println("");
    for (int i = 1; i <= num; i++) {
      int spaces = num - i;
      int asterisks = 2 * i - 1;

      String line = repeatChar(' ', spaces) + repeatChar('*', asterisks);
      System.out.println(line);
    }
  }
  
   private static String repeatChar(char c, int n) {
    StringBuilder sb = new StringBuilder(n);
    for (int i = 0; i < n; i++) {
        sb.append(c);
    }
    return sb.toString();
  }

}
