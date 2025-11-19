package ejercicios3;

import java.util.Scanner;

public class Ejer8 {
  private static int num;
  private static boolean res;
  public static void main(String[] args) {
    getNum();
    isPerfect();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    num = sc.nextInt();
  }

  private static void isPerfect() {
    int calc = 0;
    for (int i = 1; i <= num / 2; i++) {
      if(num % i == 0){
        calc += i;
      }
    }
    if (calc == num) {
      res = true;
    } else {
      res = false;
    }
  }
  
  private static void printRes() {
    if (res) {
      System.out.println("Number " + num + " is perfect");
    } else {
      System.out.println("Number " + num + " is not perfect ");
      
    }
  }
}
