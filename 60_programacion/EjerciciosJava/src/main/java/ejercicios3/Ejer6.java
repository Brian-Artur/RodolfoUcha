package ejercicios3;

import java.util.Scanner;

public class Ejer6 {
  private static int num; 
  private static long sum;
  public static void main(String[] args) {
    getNum();
    parseString();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    num = sc.nextInt();
  }

  private static void parseString() {
    String numString = String.valueOf(num);
    sum = 0;
    for (char dig : numString.toCharArray()) {
      int digit = Character.getNumericValue(dig);
      sum += digit;
    }
  }
  
  private static void printRes() {
    System.out.println("The sum digits of " + num + " is: " + sum);
  }
}
