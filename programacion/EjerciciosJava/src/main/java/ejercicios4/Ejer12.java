package ejercicios4;

import java.util.Scanner;

public class Ejer12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce N (límite superior): ");
    int N = sc.nextInt();

    System.out.print("Introduce M (divisor): ");
    int M = sc.nextInt();

    System.out.println("Números entre 1 y " + N + " que NO son divisibles por " + M + ":");

    for (int i = 1; i <= N; i++) {
      if (i % M == 0) {
        continue; // saltamos este número porque es divisible por M
      }
      System.out.print(i + " ");
    }
  }
}
