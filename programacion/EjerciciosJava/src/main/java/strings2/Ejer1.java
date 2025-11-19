package strings2;

import java.util.Scanner;

public class Ejer1 {
  private static String text ="", word = "", myWord = "";
  private static int position;
  public static void main(String[] args) {
    getNum();
    countVocals();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a text");
    text = sc.nextLine();
    System.out.print("Enter word");
    word = sc.nextLine();
  }

  private static void countVocals() {
    int position = text.indexOf(word);
    if (position != -1) {
      myWord = text.substring(position, position + (word.length() - 1));
    }
  }

  private static void printRes() {
    if (position != -1) {
      System.out.println(
        "La posición de " + word + " es de " + position + " a " + position + (word.length() - 1)
      );
    } else {
      System.out.println(
        "No se ha encontrado " + word + " en el texto dado"
      );
    };
  }
}
