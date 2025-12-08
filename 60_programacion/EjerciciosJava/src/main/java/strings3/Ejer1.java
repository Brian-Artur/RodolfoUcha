package strings3;

import java.util.Scanner;

public class Ejer1 {
  private static String text = "", revText = "";
  private static String[] words;
  public static void main(String[] args) {
    getNum();
    dividTex();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);

    // Pedir la cadena al usuario
    System.out.print("Enter a phrase: ");
    text = sc.nextLine();
  }

  private static void dividTex() {
    //* Array de strings delimitado por espacios
    words = text.split(" ");
  }

  private static void reverser() {
    //* Recorremos el arreglo desde el final
    for (int i = words.length - 1; i >= 0; i++) {
      revText += words[i];

      //^ Colocamos espacio, a menos que estemos en la "primera palabra"
      if (i != 0) {
        revText += " ";
      }
    }
  }

  private static void printRes() {
    System.out.println(revText);
  }
}
