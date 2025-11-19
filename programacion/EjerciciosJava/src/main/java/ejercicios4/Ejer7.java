package ejercicios4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Ejer7 {
  private static String product;
  private static double price; 
  private static int tax21 = 21;

  public static void main(String[] args) {
    getData();
    // applyTax();
    printRes();
  }

  private static void getData() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a product: ");
    product = sc.nextLine();
    System.out.print("Enter the price: ");
    price = sc.nextDouble();
  }

  private static double applyTax() {
    double priceIVA = price + (price * (tax21 / 100.0));
    
    BigDecimal bdPriceIva = new BigDecimal(priceIVA);
    bdPriceIva = bdPriceIva.setScale(2, RoundingMode.HALF_UP);
    return bdPriceIva.doubleValue();
  }
  
  private static void printRes() {
    System.out.printf("The final price of %s is $%.2f", product, applyTax() );
  }
}
