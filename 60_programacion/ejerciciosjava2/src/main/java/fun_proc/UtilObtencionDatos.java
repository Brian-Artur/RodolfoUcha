package fun_proc;

import java.util.Scanner;

public class UtilObtencionDatos {

  // Un único Scanner compartido por todos los métodos
  private static final Scanner sc = new Scanner(System.in);

  public static int getInt() {
      return sc.nextInt();
  }

  public static int getIntPos() {
      int num = sc.nextInt();
      while (num < 0) {
          System.out.print("Debe ser positivo: ");
          num = sc.nextInt();
    }
    return num;
  }

  public static double getDec() {
    return sc.nextDouble();
  }

  public static double getDecPos() {
    double num = sc.nextDouble();
    while (num < 0) {
      System.out.print("Debe ser positivo: ");
      num = sc.nextDouble();
    }
    return num;
  }

  public static char getChar() {
    return sc.next().charAt(0);
  }

  public static String getStr() {
    return sc.next();
  }

  // Método opcional para cerrar el Scanner al final del programa
  public static void close() {
    sc.close();
  }
}