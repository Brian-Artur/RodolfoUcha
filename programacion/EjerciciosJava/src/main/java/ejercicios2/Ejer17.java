package ejercicios2;

import java.util.Scanner;

public class Ejer17 {
  private static int hits;
  private static int questions;
  private static double hitsPerCent;

  public static void main(String[] args) {
    getVars();
    calcPcent();
    sendMsg();
  }

  private static void getVars() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of questions: ");
    questions = sc.nextInt();
    System.out.print("Enter hits number: ");
    hits = sc.nextInt();
    
    while (hits > questions) {
      System.out.print("Enter real hits number: ");
      hits = sc.nextInt();
    } 
    
    sc.close();
  }

  private static void calcPcent(){
    hitsPerCent = hits / (double) questions;
  }

  private static void sendMsg() {
    System.out.printf("Your hit percent is %.2f%%", hitsPerCent);
  }
}
