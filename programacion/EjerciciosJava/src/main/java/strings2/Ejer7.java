package strings2;

import java.util.Scanner;

public class Ejer7 {
  private static String text = "", cad1 = "", cad2 = "";
  private static char letter;
  private static int count = 0;
  public static void main(String[] args) {
    getNum();
    changeCad();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);

    // Pedir la cadena al usuario
    System.out.print("Enter a text: ");
    text = sc.nextLine();

    // Pedir la letra a buscar
    System.out.println("Enter the letter you want to find");
    cad1 = sc.nextLine();

    System.out.print("La letra '" + letter + "' aparece en las posiciones: ");
  }

  private static void changeCad() {
    if (text.contains(cad1)) {
      String newString = text.replaceFirst(cad1, cad2);

      System.out.println("Frase resultante" + newString);
    } else {
       System.out.println("La cadena \"" + cad1 + "\" no se encuentra en la frase.");
    }
  }
}
