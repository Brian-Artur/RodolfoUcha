package stringbuilder;

import java.util.Scanner;

public class Ejer2 {
  public static void main(String[] args) {
    
    StringBuilder text = new StringBuilder();
    for (int i = 0; i < 10; i++) {
      char c =  (char) i;
      String sep = ", ";
      text.append(c);
      text.append(sep);
    }
    System.out.println(text);
  }
}