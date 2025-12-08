package stringbuilder;

public class Ejer6 {
  private static StringBuilder text = new StringBuilder("Este es un texto de ejemplo");
  public static void main(String[] args) {
    eliminar();
    print();
  }

  private static void eliminar() {
    //^ end: +1 de valor que quieres
    text.delete(16, text.length());
  }

  private static void print() {
    System.out.println(text);
  }
}
