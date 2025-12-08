package strings4;

import java.util.Scanner;

public class Ejer5 {
  private static String text ="", alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
  private static StringBuilder newString = new StringBuilder();
  private static int N;
  public static void main(String[] args) {
    getData();
    toUpper();
    buildNewString();
    printRes();
  }

  private static void getData() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a text: ");
    text = sc.nextLine();
    System.out.println("Enter N value: ");
    N = sc.nextInt();
  }

  private static int calcDesp(int position) {
    int newPos = (position + N) % alfabeto.length(); 
    return newPos;
  }

  private static void toUpper() {
    text = text.toUpperCase();
  }

  private static void buildNewString() {

    for (int i = 0; i < text.length(); i++) {
      //^ Cada posición del string
      char c = text.charAt(i);
      
      //^ Verificamos si el carácter es una letra
      int pos = alfabeto.indexOf(c);
      
      if (pos != -1) {
        //^ Calculamos la nueva posición desplazada
        int nuevaPos = calcDesp(pos);
        char charCsr = alfabeto.charAt(nuevaPos);
        //^ Insertamos caracter codificado
        newString.append(charCsr);
      } else {
        // Si no es letra, lo dejamos igual
        newString.append(c);
      }
    }
  }

  private static void printRes() {
    System.out.println(newString);
  }
}
