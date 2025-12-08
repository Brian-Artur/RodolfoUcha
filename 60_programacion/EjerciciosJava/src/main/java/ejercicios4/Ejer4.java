package ejercicios4;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejer4 {
  private static int currentYear, limit = 10;
  public static void main(String[] args) {
    getCurrentYear();
    calcEaster(currentYear);
    printRes();
  }

  private static void getCurrentYear() {
    currentYear = LocalDate.now().getYear();
  }

  public static String calcEaster(int year) {
    int A = year % 19;
    int B = year % 4;
    int C = year % 7;
    int D = (19 * A + 24) % 30;
    int E = (2 * B + 4 * C + 6 * D + 5) % 7;
    int N = 22 + D + E;

    int dia, mes;

    if (N <= 31) {
      dia = N;
      mes = 3; // marzo
    } else {
      dia = N - 31;
      mes = 4; // abril
    }

    return dia + "/" + mes + "/" + year;
    }
  
  private static void printRes() {
    for (int i = 0; i < limit; i++) {
      int year = currentYear + i;
      String easterDay = calcEaster(year);
      System.out.println("Domingo de Pascua en " + year + ": " + easterDay);
    }
  }
}
