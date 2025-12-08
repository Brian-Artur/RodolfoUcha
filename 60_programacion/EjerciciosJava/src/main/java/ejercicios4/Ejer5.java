package ejercicios4;

import java.util.Scanner;

public class Ejer5 {
  private static int a, b; 
  public static void main(String[] args) {
    getN();
    printFact();
  }

  private static void getN() {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter first number: ");
    a = sc.nextInt();
    System.out.print("Enter first number: ");
    b = sc.nextInt();
  }

  private static int calcMCD(int x, int y) {
    while (y != 0) {
      int resto = x % y;
      x = y;
      y = resto;
    }
    return x;
  }
  
  private static void printFact() {
    int mcd = calcMCD(a,b);
    System.out.println("El MCD " + a + " y " + b + " es: " + mcd);
  }
}
