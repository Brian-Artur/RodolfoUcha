package ejercicios2;

import java.util.Scanner;

public class Ejer19 {
  private static double price;
  private static String priceCoin;
  public static void main(String[] args) {
    getDecimalNum();
    roundDecimals();
    System.out.printf("The final price is $%s",priceCoin);
  }

  private static void getDecimalNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a price with decimals : ");
    price = sc.nextDouble();
    sc.close();
  }

  private static void roundDecimals(){
    priceCoin = String.format("%.2f",price);
  }
}
