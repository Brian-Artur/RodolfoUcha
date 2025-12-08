package fun_proc;

public class Ejer6 {

 // Función que calcula el exponente de forma manual
    public static double calcularExponente(double base, int exponente) {
        double resultado = 1;

        if (exponente == 0) {
            return 1; // cualquier número elevado a 0 es 1
        }

        int expAbs = Math.abs(exponente); // valor absoluto del exponente

        // Calculamos la potencia (solo con exponentes positivos)
        for (int i = 1; i <= expAbs; i++) {
            resultado *= base;
        }

        // Si el exponente era negativo, devolvemos el inverso
        if (exponente < 0) {
            resultado = 1 / resultado;
        }

        return resultado;
    }

    public static void main(String[] args) {
        

        System.out.print("Introduce la base: ");
        double base = UtilObtencionDatos.getDecPos();

        System.out.print("Introduce el exponente (puede ser negativo): ");
        int exponente = UtilObtencionDatos.getInt();

        double resultado = calcularExponente(base, exponente);

        System.out.println(base + " elevado a " + exponente + " = " + resultado);

     
    }
}
