package ejercicios3;

import java.util.Scanner;

public class Ejer10 {
  private static int num, sum = 0;
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
    StringBuilder star = new StringBuilder();
    for (int i = 1; i <= num; i++) {
      star = star.append("*");
      System.out.println(star);
    }
  }
  
}
