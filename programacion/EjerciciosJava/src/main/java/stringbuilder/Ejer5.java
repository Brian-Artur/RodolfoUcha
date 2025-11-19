package stringbuilder;

public class Ejer5 {
  private static StringBuilder text = new StringBuilder("El cielo es azul");
  public static void main(String[] args) {
    remplazo();
    print();
  }

  private static void remplazo() {
    //^ end: +1 de valor que quieres
    text.replace(12, 16, "rojo");
  }

  private static void print() {
    System.out.println(text);
  }
}
