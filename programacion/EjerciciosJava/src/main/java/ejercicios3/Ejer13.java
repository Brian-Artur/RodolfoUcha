package ejercicios3;

import java.util.Scanner;

public class Ejer13 {
  private static Scanner sc = new Scanner(System.in);
  private static int option, quantity, balance = 0;

  public static void main(String[] args) {
    do {
      getOperation();
      selector();
    } while (option != 4);
  }

  private static void getOperation() {
  
    System.out.println("Select operation:");
    System.out.println(" - 1: consult ");
    System.out.println(" - 2: remove ");
    System.out.println(" - 3: consult ");
    System.out.println(" - 4: exit ");
    System.out.print(" : ");
    option = sc.nextInt();
  }

  private static void selector() {
    switch (option) {
      case 1:
        consult();
        System.out.println("");
        break;
      case 2:
        System.out.print("Amount: ");
        quantity = sc.nextInt();
        remove(quantity);
        System.out.println("");
        break;
      case 3:
        System.out.print("Amount: ");
        quantity = sc.nextInt();
        deposit(quantity);
        System.out.println("");
        break;
      case 4:
        System.out.println("Bye bye :D");
        System.out.println("");
        break;
      default:
        System.out.println("Option not found");
        System.out.println("");
        break;
    }
  }

  private static void consult() {
    System.out.println("Your balance is " + balance);
  }

    private static void remove(int amount) {
    if (amount < balance) {
      balance -= amount;
      System.out.println("Your balance is " + balance);
    } else {
      System.out.println("You don't have that amount");
    }
  }

  private static void deposit(int amount) {
    balance += amount;
    System.out.println("Your balance is " + balance);
  }
  
}
