package ejercicios3;

import java.util.Scanner;

public class Ejer11 {
  private static int num;
  private static double sum = 0.0;

  public static void main(String[] args) {
    getNum();
    printTriangleMet();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    num = sc.nextInt();
  }

  private static void printTriangleMet() {
    System.out.println("");
    for (int i = 1; i < num; i++) {
      System.out.print(1 + "/" + i + " + ");
      sum += (1 / (double) i);
    }
    System.out.println(1 + "/" + num );
    sum += 1 / (double) num;
  }
  
    private static void printRes() {
    System.out.println("Resoult = " + sum);

  }
}
