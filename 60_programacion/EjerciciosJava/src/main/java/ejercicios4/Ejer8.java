package ejercicios4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejer8 {
  private static List nums = new ArrayList<>();
  public static void main(String[] args) {
    getNum();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    int num;
    do {
      System.out.print("Enter a number: ");
      num = sc.nextInt();
      if (num != -1) {
        nums.add(num);
      }
    } while (num != -1);
  }
  
  private static void printRes() {
   System.out.println(nums);
  }
}
