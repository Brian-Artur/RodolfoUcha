package ejercicios1;
import java.util.Scanner;

public class Ejer16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = 0;
    boolean valido = false;

    while (!valido) {
      System.out.print("Escribe un número entero: ");
      String myVar = sc.nextLine();

      if (myVar.length() > 0) {
        num = Integer.parseInt(myVar);
        valido = !valido;
      }
    }
    System.out.println(num);
  }
}
