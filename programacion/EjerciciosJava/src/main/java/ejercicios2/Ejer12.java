package ejercicios2;

import java.util.Scanner;

public class Ejer12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa tu día de nacimiento: ");
    int dia = sc.nextInt();

    System.out.print("Ingresa tu mes de nacimiento (1-12): ");
    int mes = sc.nextInt();

    String signo = obtenerSigno(dia, mes);

    if (signo != null) {
      System.out.printf("Tu signo zodiacal es: %s%n", signo);
    } else {
      System.out.println("Fecha inválida.");
    }

    sc.close();
  }

  private static String obtenerSigno(int dia, int mes) {
    switch (mes) {
      case 1:  return (dia >= 20) ? "Acuario"    : "Capricornio";
      case 2:  return (dia >= 19) ? "Piscis"     : "Acuario";
      case 3:  return (dia >= 21) ? "Aries"      : "Piscis";
      case 4:  return (dia >= 20) ? "Tauro"      : "Aries";
      case 5:  return (dia >= 21) ? "Géminis"    : "Tauro";
      case 6:  return (dia >= 21) ? "Cáncer"     : "Géminis";
      case 7:  return (dia >= 23) ? "Leo"        : "Cáncer";
      case 8:  return (dia >= 23) ? "Virgo"      : "Leo";
      case 9:  return (dia >= 23) ? "Libra"      : "Virgo";
      case 10: return (dia >= 23) ? "Escorpio"   : "Libra";
      case 11: return (dia >= 22) ? "Sagitario"  : "Escorpio";
      case 12: return (dia >= 22) ? "Capricornio": "Sagitario";
      default: return null; // mes inválido
    }
  }
}
