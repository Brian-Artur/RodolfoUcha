package ejercicios4;

import java.util.Scanner;

public class Ejer6 {
  private static int num; 
  private static double sum;
  public static void main(String[] args) {
    getNum();
    operation();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    num = sc.nextInt();
  }

  private static void operation() {
    sum = 0;
    for (int i = 1; i <= num; i++) {
      sum += (double) i / Math.pow(2, i);
    }
  }
  
  private static void printRes() {
    System.out.println("El valor de la suma es: " + sum);
  }
}
