package fun_proc;

public class Ejer2 {
  public static void main(String[] args) {
    int val = UtilObtencionDatos.getInt();
    if (val % 2 == 0) {
      System.out.println("Par");
    } else {
      System.out.println("Impar");
    }
  }

}
