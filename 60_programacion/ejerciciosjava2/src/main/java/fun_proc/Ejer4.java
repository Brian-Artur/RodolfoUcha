package fun_proc;

import java.util.Scanner;

public class Ejer4 {
    // Función que determina si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        num1 = UtilObtencionDatos.getIntPos();
        num2 = UtilObtencionDatos.getIntPos();

        // Pasar "num1" al valor menor
        if (num1 > num2) {
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }

        System.out.println("\nNúmeros primos entre " + num1 + " y " + num2 + ":");

        // Recorrer el intervalo y comprobar cada número
        for (int i = num1; i <= num2; i++) {
            if (esPrimo(i)) {
                System.out.println(i + " es primo");
            } else {
                System.out.println(i + " no es primo");
            }
        }

        sc.close();
    }
}
