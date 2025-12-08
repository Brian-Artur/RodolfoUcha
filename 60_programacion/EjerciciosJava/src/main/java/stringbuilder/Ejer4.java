package stringbuilder;

public class Ejer4 {
  private static StringBuilder text = new StringBuilder("Java es genial");
  public static void main(String[] args) {
    enterMuy();
    print();
  }

  private static void enterMuy() {
    text.insert(8, "muy ");
  }

  private static void print() {
    System.out.println(text);
  }
}
