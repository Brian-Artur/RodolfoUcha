package ejercicios2;

import java.util.Scanner;

public class Ejer15 {
  private static double doubleNum;
  private static String roundNum;
  public static void main(String[] args) {
    getDecimalNum();
    roundDecimals(doubleNum);
    System.out.printf("Your number %f rounded to %s",doubleNum, roundNum);
  }

  private static void getDecimalNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a DECIMAL number: ");
    doubleNum = sc.nextDouble();
    sc.close();
  }

  private static void roundDecimals(double num){
    roundNum = String.format("%.2f",num);
  }
}
