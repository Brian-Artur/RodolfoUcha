package ahorcado;

import utilidades.UtilObtencionDatos;

import java.util.ArrayList;
import java.util.List;

import menu.Menu;

public class JuegoAhorcado {

  // Valores por defecto
  private static final int INTENTOS_POR_DEFECTO = 3;
  private static final String[] PALABRAS_POR_DEFECTO = {
      "java", "programacion", "ordenador", "teclado", "raton",
      "monitor", "clase", "objeto", "metodo", "variable"
  };

  private static int intentosMaximos = INTENTOS_POR_DEFECTO;
  private static List<String> palabrasDisponibles = new ArrayList<>(List.of(PALABRAS_POR_DEFECTO));

  public static void ejecutar() {
    boolean volver = false;

    while (!volver) {
      int opcion = UtilObtencionDatos.mostrarMenu(
          Menu.menuAhoracado.formatted(intentosMaximos, palabrasDisponibles.size()),
          1, 5);

      switch (opcion) {
        case 1 -> configurarIntentos();
        case 2 -> configurarPalabras();
        case 3 -> jugarPartida();
        case 4 -> volver = true;
      }
    }
  }

  private static void configurarIntentos() {
    int nuevosIntentos = UtilObtencionDatos.pedirEntero(
        "Introduce el número de intentos (mínimo 1, actual: " + intentosMaximos + "): ");
    if (nuevosIntentos < 1) {
      System.out.println("Error: debe haber al menos 1 intento.");
    } else {
      intentosMaximos = nuevosIntentos;
      System.out.println("Intentos actualizados a: " + intentosMaximos);
    }
  }

  private static void configurarPalabras() {
    int numPalabras = UtilObtencionDatos.pedirEntero(
        "¿Cuántas palabras quieres introducir? (0 para mantener actuales): ");

    if (numPalabras <= 0) {
      System.out.println("Se mantienen las palabras actuales.");
      return;
    }

    List<String> nuevasPalabras = new ArrayList<>();
    System.out.println("Introduce las " + numPalabras + " palabras (en minúsculas, sin acentos):");
    for (int i = 0; i < numPalabras; i++) {
      String palabra = UtilObtencionDatos.pedirCadena("Palabra " + (i + 1) + ": ").trim().toLowerCase();
      if (!palabra.isEmpty() && palabra.matches("[a-z]+")) {
        nuevasPalabras.add(palabra);
      } else {
        System.out.println("Palabra inválida. Se omite.");
        i--; // Repetir esta iteración
      }
    }

    if (!nuevasPalabras.isEmpty()) {
      palabrasDisponibles = nuevasPalabras;
      System.out.println("Palabras actualizadas. Total: " + palabrasDisponibles.size());
    } else {
      System.out.println("No se añadieron palabras válidas. Se mantienen las anteriores.");
    }
  }

  private static void jugarPartida() {
    if (palabrasDisponibles.isEmpty()) {
      System.out.println("Error: no hay palabras disponibles. Configura al menos una.");
      return;
    }

    // Elegir palabra aleatoria
    String palabraSecreta = palabrasDisponibles.get(
        (int) (Math.random() * palabrasDisponibles.size()));

    char[] progreso = new char[palabraSecreta.length()];
    for (int i = 0; i < progreso.length; i++) {
      progreso[i] = '_';
    }

    int intentosRestantes = intentosMaximos;
    boolean[] letrasUsadas = new boolean[26]; // a-z

    System.out.println("\n¡Comienza el juego! Palabra de " + palabraSecreta.length() + " letras.");

    while (intentosRestantes > 0 && hayGuiones(progreso)) {
      mostrarEstado(progreso, intentosRestantes);
      String entrada = UtilObtencionDatos.pedirCadena(
          "Introduce una letra o la palabra completa: ").trim().toLowerCase();

      if (entrada.length() == 1 && Character.isLetter(entrada.charAt(0))) {
        // Modo letra
        char letra = entrada.charAt(0);
        int indice = letra - 'a';
        if (indice < 0 || indice >= 26 || letrasUsadas[indice]) {
          System.out.println("Letra ya usada o inválida.");
          continue;
        }
        letrasUsadas[indice] = true;

        if (palabraSecreta.indexOf(letra) == -1) {
          intentosRestantes--;
          System.out.println("¡Incorrecto! Te quedan " + intentosRestantes + " intentos.");
        } else {
          // Rellenar todas las ocurrencias
          for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
              progreso[i] = letra;
            }
          }
          System.out.println("¡Bien! La letra '" + letra + "' está en la palabra.");
        }
      } else if (entrada.equals(palabraSecreta)) {
        // Adivinó la palabra completa
        System.arraycopy(palabraSecreta.toCharArray(), 0, progreso, 0, progreso.length);
        break;
      } else {
        intentosRestantes--;
        System.out.println("Palabra incorrecta. Te quedan " + intentosRestantes + " intentos.");
      }
    }

    // Fin de partida
    mostrarEstado(progreso, intentosRestantes);
    if (!hayGuiones(progreso)) {
      System.out.println("¡FELICIDADES! Has ganado. La palabra era: " + palabraSecreta);
    } else {
      System.out.println("¡GAME OVER! La palabra era: " + palabraSecreta);
    }
  }

  private static void mostrarEstado(char[] progreso, int intentos) {
    System.out.print("Palabra: ");
    for (char c : progreso) {
      System.out.print(c + " ");
    }
    System.out.println("\nIntentos restantes: " + intentos);
  }

  private static boolean hayGuiones(char[] progreso) {
    for (char c : progreso) {
      if (c == '_')
        return true;
    }
    return false;
  }
}
