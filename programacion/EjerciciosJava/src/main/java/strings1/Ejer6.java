package strings1;

import java.util.Scanner;

public class Ejer6 {
  private static String text;
  public static void main(String[] args) {
    getNum();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word: ");
    text = sc.nextLine();
  }

private static int counterLetterAlone() {
    int count = 0;

    for (int i = 0; i < text.length(); i++) {
        char c = text.charAt(i);

        // comprobar si es una letra
        if (Character.isLetter(c)) {
          // Primera posición y el siguiente un espacio
            boolean leftSpace = (i == 0) || (text.charAt(i - 1) == ' ');
          // Última posición y la anterior un espacio 
            boolean rightSpace = (i == text.length() - 1) || (text.charAt(i + 1) == ' ');

            if (leftSpace && rightSpace) {
                count++;
            }
        }
    }

    return count;
}


  private static void printRes() {
    System.out.println("La cantidad de letras sueltas es: " + counterLetterAlone());
  }
}
