package ejercicios3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejer12 {
  private static int num;
  private static List<Integer> nums = new ArrayList<>();

  public static void main(String[] args) {
    getNum();
    do {
      value();
    } while (num != 1);
    printRes();   
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    num = sc.nextInt();
  }

  private static void divideTwo(int num) {
    num = num / 2;
  }

  private static void multiplyAdd(int num) {
    num = (num * 3) + 1;

  }


  private static void value() {
    if (num % 2 == 0) {
      divideTwo(num);
    } else {
      multiplyAdd(num);
    }
    nums.add(num);
  }
  
   private static void printRes() {
    System.out.println("Secuencia generada:");
    for (int n : nums) {
      System.out.print(n + " ");
    }
  }
}
