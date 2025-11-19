package ejercicios2;

import java.util.Scanner;

public class Ejer4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa el primer número: ");
    int a = Integer.parseInt(sc.next());

    System.out.print("Ingresa el segundo número: ");
    int b = Integer.parseInt(sc.next());

    System.out.print("Ingresa el tercer número: ");
    int c = Integer.parseInt(sc.next());

    int d = (a + b) * c;
    double e = a + b * c;
    double f = a + b * c - d / e;
    
    System.out.println("---------------");
    System.out.print("( a + b ) * c = ");
    System.out.println(d);
    System.out.print("a + b * c =");
    System.out.println(e);
    System.out.print("a + b * c - d / e = ");
    System.out.println(f);

  }
}
