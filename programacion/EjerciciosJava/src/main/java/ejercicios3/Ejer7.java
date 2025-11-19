package ejercicios3;

import java.util.Scanner;

public class Ejer7 {
  private static int num, reverseNum;
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
    String inverString = new StringBuilder(numString).reverse().toString();
    reverseNum = Integer.parseInt(inverString);
  }
  
  private static void printRes() {
    System.out.println("The mirror number of " + num + " is: " + reverseNum);
  }
}
