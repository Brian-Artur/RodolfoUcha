package ejercicios2;

import java.util.Scanner;

public class Ejer18 {
  private static int[] nums = new int[3];

  public static void main(String[] args) {
    getVars();
    sendMsg();
  }

  private static void getVars() {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < nums.length; i++) {
      System.out.print("Enter a number: ");
      nums[i] = sc.nextInt();
    }
    
    sc.close();
  }

  private static void sendMsg() {
    System.out.printf("<_%d_>  <_%d_>  <_%d_>", nums[0], nums[1], nums[2]);
  }
}
