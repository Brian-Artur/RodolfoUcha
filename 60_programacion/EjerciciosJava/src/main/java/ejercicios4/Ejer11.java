package ejercicios4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejer11 {
  private static List nums = new ArrayList<>();
  public static void main(String[] args) {
    getNum();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    int age;
    do {
      System.out.print("Enter a age: ");
      age = sc.nextInt();
    } while (age < 18);
  }
  
  private static void printRes() {
   System.out.println("Amego, ese no es un MENA");
  }
}
