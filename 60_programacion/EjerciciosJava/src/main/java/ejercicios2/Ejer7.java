package ejercicios2;

import java.util.Scanner;

public class Ejer7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa el número: ");
    int num = sc.nextInt(); // guarda el número en el array

    if (num == 0) {
      System.out.printf("El número es un %d", num);
    } else if (num > 0) {
      System.out.printf("%d es positivo", num);
    } else {
      System.out.printf("%d es negativo", num);
    }
  }
}

