package ejercicios3;

import java.util.Scanner;

public class Ejer3 {
  private static int num;
  public static void main(String[] args) {
    getNum();
    boolean res = isPrime(num);
    printRes(res);
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    num = sc.nextInt();
  }

  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }

    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false; 
      }
    }
    return true;
  }

  
  private static void printRes(boolean bool) {
    if(bool){
      System.out.println(num + " is prime" );
    } else {
      System.out.println(num + " is not prime" );
    }
  }
}
