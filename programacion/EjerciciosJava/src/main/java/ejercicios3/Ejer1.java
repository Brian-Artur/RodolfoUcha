package ejercicios3;

import java.util.Scanner;

public class Ejer1 {
  private static int num, limit = 10;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    num = sc.nextInt();
    withWhile();
    withFor();
  }

  private static void withWhile() {
    System.out.println("Print with While");
    int count = 1;
    while (count <= limit) {
      System.out.println(num * count);
      count++;
    }
    System.out.println("----------");
  }
  
  private static void withFor() {
    System.out.println("Print with For");
    for (int i = 1; i <= limit; i++) {
      System.out.println(num * i);
    }
    System.out.println("----------");
  }
}
