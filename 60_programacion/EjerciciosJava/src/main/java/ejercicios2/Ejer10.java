package ejercicios2;

import java.util.Scanner;

public class Ejer10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa un año: ");
    int y = sc.nextInt();

    if (esBisiesto(y)) {
      System.out.printf("%d es bisiesto",y);
    } else {
      System.out.printf("%d NO es bisiesto",y);
    }
  }
  private static boolean esBisiesto(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
  }
}

