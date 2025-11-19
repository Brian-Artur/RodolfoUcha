package ejercicios2;

import java.util.Scanner;

public class Ejer14 {
  private static String[] spacers = { 
    "<-<<", 
    ">>->", 
  };

  public static void main(String[] args) {
    int num = getNumber();
    System.out.printf("%s %d %s",spacers[0], num, spacers[1]);
  }

  private static int getNumber() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa un número entero: ");
    int num = sc.nextInt();
    sc.close();
    return num;
  }
}
