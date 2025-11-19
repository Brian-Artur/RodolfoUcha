package ejercicios4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejer11b {
  private static List nums = new ArrayList<>();
  public static void main(String[] args) {
    getNum();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    int age;
    while (true) {
      System.out.print("Enter a age: ");
      age = sc.nextInt();
      if (age >= 18) {
        break;
      }
    }
  }
  
  private static void printRes() {
   System.out.println("Amego, ese no es un MENA");
  }
}
