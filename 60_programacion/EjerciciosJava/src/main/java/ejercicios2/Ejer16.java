package ejercicios2;

import java.util.Scanner;

public class Ejer16 {
  private static int age;
  private static String name;
  public static void main(String[] args) {
    getInfo();
    greet(name, age);
  }

  private static void getInfo() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name: ");
    name = sc.nextLine();
    System.out.print("Enter your age: ");
    age = sc.nextInt();
    sc.close();
  }

  private static void greet(String name, int age){
    System.out.printf("Hello %s, you're %d years old.", name, age);
  }
}
