package ejercicios3;

import java.util.Scanner;

public class Ejer5 {
  private static int n; 
  private static long fact;
  public static void main(String[] args) {
    getN();
    calcFact();
    printFact();
  }

  private static void getN() {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    n = sc.nextInt();
  }

  private static void calcFact() {
    long total = 1;
    for (int i = 1; i <= n; i++) {
      total *= i;
    }
    fact = total;
  }
  
  private static void printFact() {
    System.out.println("Factorial of " + n + " is: " + fact);
  }
}
