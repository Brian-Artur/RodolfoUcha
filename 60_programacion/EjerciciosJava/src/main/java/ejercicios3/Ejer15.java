package ejercicios3;

import java.util.Scanner;

public class Ejer15 {
  private static int a, b, c;
  public static void main(String[] args) {
    getNum();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    a = sc.nextInt();
    System.out.print("Enter second number: ");
    b = sc.nextInt();
    System.out.print("Enter thrird number: ");
    c = sc.nextInt();
  }

  private static void printRes() {
    System.out.println(
      // Ternario. Pero no trifásico
      checkThree() 
      ? "The sum of two numbres is iqual at the third" 
      : "There's not sum of two numbres is iqual at the third"
    );
  }
  
  private static boolean checkC() {
    return (a + b == c);
  }

  private static boolean checkB() {
    return (b + c == a);
  }

  private static boolean checkA() {
    return (c + a == b);
  }

  private static boolean checkThree() {
    return (checkA() || checkB() || checkC());
  }

}
