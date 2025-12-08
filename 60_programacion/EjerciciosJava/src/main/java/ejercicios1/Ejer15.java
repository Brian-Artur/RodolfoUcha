package ejercicios1;
import java.util.Scanner;

public class Ejer15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Escribe un número: ");
    int num1 = sc.nextInt();

    System.out.print("Escribe otro número: ");
    int num2 = sc.nextInt();

    int suma    = num1 + num2;
    int resta   = num1 - num2;
    int multi   = num1 * num2;
    double divis = (double)num1 / num2;
    int modul   = num1 % num2;

    System.out.println(suma);
    System.out.println(resta);
    System.out.println(multi);
    System.out.println(divis);
    System.out.println(modul);

    sc.close();
  }
}
