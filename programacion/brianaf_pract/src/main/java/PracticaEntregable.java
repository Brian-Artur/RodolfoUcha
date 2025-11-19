import numeracion.CambioNumeracion;
import utilidades.UtilObtencionDatos;
import ahorcado.JuegoAhorcado;
import calculadora.Calculadora;
import cesar.CifradoCesar;

public class PracticaEntregable {
  public static void main(String[] args) {
    boolean continuar = true;

    while (continuar) {
      int opcion = UtilObtencionDatos.mostrarMenu(
        """
        === MENÚ PRINCIPAL ===
        1. Convertir numeración
        2. Jugar al ahorcado
        3. Calculadora
        4. Cifrado César
        5. Salir
        Elige una opción: """,
        1, 5
      );

      switch (opcion) {
        case 1 -> CambioNumeracion.ejecutar();
        case 2 -> JuegoAhorcado.ejecutar();
        case 3 -> Calculadora.ejecutar();
        case 4 -> CifradoCesar.ejecutar();
        case 5 -> {
          System.out.println("¡Hasta pronto!");
          continuar = false;
        }
      }
    }
  }
}