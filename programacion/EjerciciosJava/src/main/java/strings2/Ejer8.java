package strings2;

import java.util.Scanner;

public class Ejer8 {
  private static String text = "", CapString = "";
  private static String[] words;
  public static void main(String[] args) {
    getNum();
    dividTex();
    changeCad();
    printRes();
  }

  private static void getNum() {
    Scanner sc = new Scanner(System.in);

    // Pedir la cadena al usuario
    System.out.print("Enter a text: ");
    text = sc.nextLine();
  }

  private static void dividTex() {
    words = text.split(" ");
  }

  private static void changeCad() {
    for (int i = 0; i < words.length; i++) {
      String word = words[i];

      if(word.length() > 0) {
        String fstLet = word.substring(0, 1).toUpperCase();
        String rest = word.substring(1);
        words[i] = fstLet + rest;
      }
      CapString = String.join(" ", words);
    }
  }

  private static void printRes() {
    System.out.println(CapString);
  }
   
}
