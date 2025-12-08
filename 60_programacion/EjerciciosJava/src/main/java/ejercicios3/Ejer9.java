package ejercicios3;

import java.util.Scanner;

public class Ejer9 {
  private static int num, sum = 0;
  public static void main(String[] args) {
    getNum();
    fibonacciMet();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    num = sc.nextInt();
  }

  private static void fibonacciMet() {
    int a = 0, b = 1;
    System.out.println("Fibonacci of " + num + " : ");
    
    for (int i = 1; i <= num ; i++) {
      System.out.print(a);
      
      if(i < num){
        System.out.print(", ");
      }

      sum += a;
      
      int next = a + b;
      
      a = b;
      b = next;
    }
    System.out.println("");
  }
  
  private static void printRes() {
    System.out.println("Sum of first " + num + " numbers is: " + sum);
  }
}
