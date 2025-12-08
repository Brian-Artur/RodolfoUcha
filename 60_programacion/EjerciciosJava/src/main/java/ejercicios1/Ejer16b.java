package ejercicios1;
import java.util.Scanner;

public class Ejer16b {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = 0;
    boolean valido = false;

    while (!valido) {
      System.out.print("Escribe un número entero: ");
      
      if (sc.hasNextInt()) {
        valido = !valido;
        num = sc.nextInt();
      } else {
        sc.nextLine();
      }
    }
    System.out.println(num);
  }
}
