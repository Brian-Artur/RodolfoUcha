package cesar;

import utilidades.UtilObtencionDatos;
import menu.Menu;
import utilidades.UtilCifrado;

public class CifradoCesar {

  private static int desplazamiento = 1; // Valor por defecto

  public static void ejecutar() {
    boolean volver = false;

    while (!volver) {
      int opcion = UtilObtencionDatos.mostrarMenu(
        Menu.menuCesar.formatted(desplazamiento),
        1, 
        4
      );

      switch (opcion) {
        case 1 -> configurarDesplazamiento();
        case 2 -> cifrarTexto();
        case 3 -> descifrarTexto();
        case 4 -> volver = true;
      }
    }
  }

    private static void configurarDesplazamiento() {
        int nuevo = UtilObtencionDatos.pedirEntero(
            "Introduce el desplazamiento (1-25, actual: " + desplazamiento + "): "
        );
        if (nuevo < 1 || nuevo > 25) {
            System.out.println("Error: el desplazamiento debe estar entre 1 y 25.");
        } else {
            desplazamiento = nuevo;
            System.out.println("Desplazamiento actualizado a: " + desplazamiento);
        }
    }

    private static void cifrarTexto() {
        String texto = UtilObtencionDatos.pedirCadena("Introduce el texto a cifrar: ");
        String cifrado = UtilCifrado.cifrar(texto, desplazamiento);
        System.out.println("Texto cifrado: " + cifrado);
    }

    private static void descifrarTexto() {
        String texto = UtilObtencionDatos.pedirCadena("Introduce el texto a descifrar: ");
        String descifrado = UtilCifrado.descifrar(texto, desplazamiento);
        System.out.println("Texto descifrado: " + descifrado);
    }
}