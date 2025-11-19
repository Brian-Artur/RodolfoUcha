package strings4;

import java.util.Scanner;

public class Ejer3 {
  private static String correo ="", dom="";
  public static void main(String[] args) {
    getData();
    extractDom();
    printRes();
  }

  private static void getData() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a text");
    correo = sc.nextLine();
  }

  private static void extractDom() {
    // Buscamos la posición del caracter '@'
    int atIndex = correo.indexOf("@");
    // Fragmento del correo
    dom = correo.substring(atIndex + 1);
  }

  private static void printRes() {
    System.out.println(dom);
  }
}
