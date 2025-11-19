package f_p;

import fun_proc.UtilObtencionDatos;

public class Ejer1 {
  public static void main(String[] args) {
    System.out.println("Introduce el radio del círculo");
    int r = UtilObtencionDatos.getInt();
    double area = calcAreaCirc(r);
    System.out.println(area);
  }

  public static double calcAreaCirc(int r) {
    return Math.PI * Math.pow(r, 2);
  }
}
