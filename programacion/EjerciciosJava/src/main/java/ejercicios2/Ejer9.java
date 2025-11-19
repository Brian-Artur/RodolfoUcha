package ejercicios2;

import java.util.Scanner;

public class Ejer9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa primer número: ");
    int a = sc.nextInt();

    System.out.print("Ingresa segundo número: ");
    int b = sc.nextInt();

    System.out.print("Ingresa tercer número: ");
    int c = sc.nextInt();

    if (a > b && a > c) {
      System.out.printf("%d es el mayor",a);
    } else if (b > a && b > c) {
      System.out.printf("%d es el mayor",b);
    } else if (c > a && c > a) {
      System.out.printf("%d es el mayor",c);
    } else {
      System.out.print("Existen 2 números iguales");
    }
  }
}

