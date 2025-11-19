package ejercicios4;

import java.util.Scanner;

public class Ejer3 {
  private static int numZ, sum = 0, numN = 0;

  public static void main(String[] args) {
    getVars();
    operation();
    sendMsg();
  }

  private static void getVars() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number Z: ");
    numZ = sc.nextInt();
  }

  private static void operation(){
    while (sum <= numZ) {
      numN++;
      sum += numN;
    };

    System.out.println();
  }

  private static void sendMsg() {
    System.out.printf("The smallest value of N is " + numN);
  }
}
