package fun_proc;

public class Ejer3 {

    // Función que determina si un número es primo
    public static boolean esPrimo(int numero) {
        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }

        // Comprobamos divisores desde 2 hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si tiene divisor, no es primo
            }
        }

        return true; // Si no tiene divisores, es primo
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int numero = UtilObtencionDatos.getIntPos();

        if (esPrimo(numero)) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
    }

}
