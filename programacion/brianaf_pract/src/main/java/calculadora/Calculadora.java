package calculadora;

import utilidades.UtilObtencionDatos;
import menu.Menu;

public class Calculadora {

    public static void ejecutar() {
      boolean volver = false;

      while (!volver) {
        int opcion = UtilObtencionDatos.mostrarMenu(
            Menu.menuCalculadora,
            1, 
            8
        );

        switch (opcion) {
          case 1 -> operacion("sumar", (a, b) -> a + b);
          case 2 -> operacion("restar", (a, b) -> a - b);
          case 3 -> operacion("multiplicar", (a, b) -> a * b);
          case 4 -> divisionEntera();
          case 5 -> divisionReal();
          case 6 -> modulo();
          case 7 -> volver = true;
        }
      }
    }

    // Reutilizamos para suma, resta y multiplicación
    @FunctionalInterface
    interface Operacion {
        int aplicar(int a, int b);
    }

    private static void operacion(String nombre, Operacion op) {
      int a = UtilObtencionDatos.pedirEntero("Introduce el primer número: ");
      int b = UtilObtencionDatos.pedirEntero("Introduce el segundo número: ");
      int resultado = op.aplicar(a, b);
      System.out.println("Resultado de " + nombre + ": " + a + " y " + b + " = " + resultado);
    }

    private static void divisionEntera() {
        int a = UtilObtencionDatos.pedirEntero("Introduce el dividendo: ");
        int b = UtilObtencionDatos.pedirEntero("Introduce el divisor (no cero): ");
        if (b == 0) {
            System.out.println("Error: no se puede dividir por cero.");
            return;
        }
        int cociente = a / b;
        System.out.println("División entera: " + a + " / " + b + " = " + cociente);
    }

  private static void divisionReal() {
    int a = UtilObtencionDatos.pedirEntero("Introduce el dividendo: ");
    int b = UtilObtencionDatos.pedirEntero("Introduce el divisor (no cero): ");
    if (b == 0) {
      System.out.println("Error: no se puede dividir por cero.");
      return;
    }
    double cociente = (double) a / b;
    System.out.printf("División real: %.2f / %.2f = %.2f%n", (double)a, (double)b, cociente);
  }

  private static void modulo() {
    int a = UtilObtencionDatos.pedirEntero("Introduce el dividendo: ");
    int b = UtilObtencionDatos.pedirEntero("Introduce el divisor (no cero): ");
    if (b == 0) {
        System.out.println("Error: no se puede dividir por cero.");
        return;
    }
    int resto = a % b;
    System.out.println("Módulo: " + a + " % " + b + " = " + resto);
  }
}