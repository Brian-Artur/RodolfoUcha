package ejercicios4;

import java.util.Scanner;

public class Ejer10 {
  private static int a, b, c;
  public static void main(String[] args) {
    getNum();
    printResult();

  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    a = sc.nextInt();
    System.out.print("Enter other number: ");
    b = sc.nextInt();
  }

  private static void printResult() {
    int gcd = getGCD(a, b);

    if (gcd == a && b % a == 0) {
      System.out.println(b + " es divisible entre " + a);
    } else if (gcd == b && a % b == 0) {
      System.out.println(a + " es divisible entre " + b);
    } else {
      System.out.println("El máximo divisor común entre " + a + " y " + b + " es " + gcd);
    }
  }

  // Algoritmo de Euclides para MCD
  private static int getGCD(int x, int y) {
    while (y != 0) {
      int temp = y;
      y = x % y;
      x = temp;
    }
    return x;
  }
}
