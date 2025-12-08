package ejercicios2;

import java.util.Scanner;

public class Ejer13 {
  private static String[] dias = { 
    "lunes", 
    "martes", 
    "miércoles", 
    "jueves", 
    "viernes", 
    "sábado", 
    "domingo" 
  };

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa un número (1-7): ");
    int num = sc.nextInt();

    String dia = diaSemana(num);
    System.out.printf("Hoy es %s",dia);

    sc.close();
  }

  private static String diaSemana(int num) {
    switch (num) {
      case 1:  return dias[num - 1];
      case 2:  return dias[num - 1];
      case 3:  return dias[num - 1];
      case 4:  return dias[num - 1];
      case 5:  return dias[num - 1];
      case 6:  return dias[num - 1];
      case 7:  return dias[num - 1];
      default: return null; // día inválido
    }
  }
}
