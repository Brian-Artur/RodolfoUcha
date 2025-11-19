package strings2;

import java.util.Scanner;

public class Ejer6 {
  private static String text = "", suffix = "";
  private static char letter;
  private static int count = 0;
  public static void main(String[] args) {
    getNum();
    contains();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);

    // Pedir la cadena al usuario
    System.out.print("Enter a text: ");
    text = sc.nextLine();

    // Pedir la letra a buscar
    System.out.println("Enter the letter you want to find");
    suffix = sc.nextLine();

    System.out.print("La letra '" + letter + "' aparece en las posiciones: ");
  }

  private static void contains() {
    if (text.endsWith(suffix)) {
      System.out.printf("La cadena termina con el sufijo %s", suffix);
    } else {
      System.out.printf("La cadena NO termina con el sufijo %s", suffix);
    }
  }

  private static void printRes() {
    System.out.println("\nTotal de apariciones: " + count);
  }
}
