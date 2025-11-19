package ejercicios3;

import java.util.Scanner;

public class Ejer4 {
  private static int num, digits, denom = 10;
  public static void main(String[] args) {
    getNum();
    calcDigis();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    num = sc.nextInt();
  }

  public static void calcDigis() {
    int i = 1;
    while (num > 10) {
      num = num / denom;
      i++;  
    } 
    digits = i;
  }

  
  private static void printRes() {
    System.out.println(num + " has " + digits + " digits" );
  }
}
