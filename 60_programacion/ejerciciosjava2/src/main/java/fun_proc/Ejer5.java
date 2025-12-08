package fun_proc;

public class Ejer5 {

    public static void main(String[] args) {
        
        int num = UtilObtencionDatos.getIntPos();
        System.out.printf("Números perfectos menores %d \n", num);

        // Recorremos todos los números desde 1 hasta 9999
        for (int numero = 1; numero < num; numero++) {

            int sumaDivisores = 0;

            // Calculamos la suma de sus divisores propios
            for (int i = 1; i <= numero / 2; i++) {
                if (numero % i == 0) { // Si i es divisor de numero
                    sumaDivisores += i;
                }
            }

            // Comprobamos si la suma de los divisores es igual al número
            if (sumaDivisores == numero) {
                System.out.println(numero + " es un número perfecto");
            }
        }
    }
}
