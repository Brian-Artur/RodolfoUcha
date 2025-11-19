package strings1;

import java.util.Scanner;

public class Ejer17 {
    private static final String PASS = "hola";
    private static int attempts = 5;
    private static boolean match = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (attempts > 0 && !match) {
            System.out.print("Enter password: ");
            String text = sc.nextLine();

            // Comprobamos si coincide carácter a carácter
            match = compareStrings(text);

            if (match) {
                System.out.println("✅ Correct password!");
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("❌ Incorrect password. Attempts left: " + attempts);
                } else {
                    System.out.println("🚫 No more attempts. Access denied.");
                }
            }
        }

        sc.close();
    }

    // 🔍 Función para comparar manualmente las cadenas carácter a carácter
    private static boolean compareStrings(String input) {
        // Si la longitud no coincide, ya sabemos que es incorrecta
        if (input.length() != PASS.length()) {
            return false;
        }

        // Recorremos ambas cadenas al mismo tiempo
        for (int i = 0; i < PASS.length(); i++) {
            char cInput = input.charAt(i);
            char cPass = PASS.charAt(i);

            if (cInput != cPass) {
                return false; // En cuanto haya una diferencia, ya no coincide
            }
        }

        return true;
    }
}
