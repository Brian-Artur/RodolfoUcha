package ejercicios2;

import java.util.Scanner;

public class Ejer8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa primer número: ");
    int a = sc.nextInt();

    System.out.print("Ingresa segundo número: ");
    int b = sc.nextInt();

    System.out.print("Ingresa operación ( + , - , * , / ) : ");
    String operador = sc.next();

    int suma = a + b;
    int resta = a - b;
    int multiplicacion = a * b;
    double division = a / (double) b; 

    switch (operador) {
      case "+":
      System.out.printf("Resultado %d", suma);
        break;
      case "-":
      System.out.printf("Resultado %d", resta);
        break;      
      case "*":
      System.out.printf("Resultado %d", multiplicacion);
        break;      
      case "/":
      System.out.printf("Resultado %f", division);
        break;
      default:
      System.out.printf("%s no es un operador válido", operador);
        break;
    }
  }
}

