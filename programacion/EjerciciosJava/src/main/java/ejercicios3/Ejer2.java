package ejercicios3;

import java.util.Scanner;

public class Ejer2 {
  private static int n, sum = 0, count = 1;
  public static void main(String[] args) {
    getN();
    addTotal();
    printSum();
  }

  private static void getN() {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    n = sc.nextInt();
  }

  private static void addTotal() {
    while (count <= n) {
      sum += count;
      count++;
    }
  }
  
  private static void printSum() {
    System.out.println("Suma: " + sum);
  }
}
