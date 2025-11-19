package f_p;

import fun_proc.UtilObtencionDatos;

public class Ejer2 {
  public static void main(String[] args) {
    System.out.println("Introduce la cantidad");
    double euros = UtilObtencionDatos.getDecPos();
    
    System.out.print("Introduce la moneda a la que quieres convertir (dólares, libras, yenes): ");
    String moneda = UtilObtencionDatos.getStr();

    convertirMoneda(euros, moneda);


  }

  // Procedimiento que realiza la conversión y muestra el resultado
  public static void convertirMoneda(double euros, String moneda) {
    double resultado = 0;

    switch (moneda.toLowerCase()) {
      case "dolares":
      case "dólares":
        resultado = euros * 1.08; // tasa de ejemplo
        System.out.printf("%.2f euros = %.2f dólares%n", euros, resultado);
        break;

      case "libras":
        resultado = euros * 0.86; // tasa de ejemplo
        System.out.printf("%.2f euros = %.2f libras%n", euros, resultado);
        break;

      case "yenes":
        resultado = euros * 162.45; // tasa de ejemplo
        System.out.printf("%.2f euros = %.2f yenes%n", euros, resultado);
        break;

      default:
        System.out.println("Moneda no reconocida. Usa: dólares, libras o yenes.");
    }
  }
}
