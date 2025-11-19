package ejercicios4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejer9 {
  private static int init, end, a, b;
  private static List divList = new ArrayList<>();
  public static void main(String[] args) {
    getNum();
    findDivs();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter init range: ");
    init = sc.nextInt();
    System.out.print("Enter end range: ");
    end = sc.nextInt();    
    System.out.print("Enter a multiply: ");
    a = sc.nextInt();    
    System.out.print("Enter other multiply: ");
    b = sc.nextInt();
  }

  private static void findDivs() {
    for (int i = init; i <= end; i++) {
      if (i % a == 0 && i % b == 0) {
        divList.add(i);
      }
    }
  }
  
  private static void printRes() {
    System.out.println("Numbers divisible by " + a + " and " + b + " between " 
                       + init + " and " + end + ": " + divList);
  }
}
