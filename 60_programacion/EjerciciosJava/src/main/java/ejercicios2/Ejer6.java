package ejercicios2;

import java.util.Scanner;

public class Ejer6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa el número: ");
    int num = sc.nextInt(); // guarda el número en el array

    if (num % 2 == 0) {
      System.out.printf("%d es par", num);
    } else {
      System.out.printf("%d es impar", num);
    }
  }
}

