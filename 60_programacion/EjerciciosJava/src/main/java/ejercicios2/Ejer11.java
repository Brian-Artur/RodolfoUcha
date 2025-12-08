package ejercicios2;

import java.util.Scanner;

public class Ejer11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa una cualificación: ");
    double num = sc.nextDouble();

    if (num < 5) {
      System.out.print("Suspenso");
    } else if (num <= 6 ){
      System.out.print("Suficiente");
    } else if (num <= 7){
      System.out.print("Bien");
    } else if (num <= 9){
      System.out.print("Notable");
    } else {
      System.out.print("Sobresaliente");
    }
  }

}

