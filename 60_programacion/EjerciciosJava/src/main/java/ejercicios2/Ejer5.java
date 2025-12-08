package ejercicios2;

import java.util.Scanner;

public class Ejer5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] nums = new int[6]; // array de 6 posiciones
    
    for (int i = 0; i < nums.length; i++) { 
      System.out.print("Ingresa el número " + (i + 1) + ": ");
      nums[i] = sc.nextInt(); // guarda el número en el array
    }

    int u = nums[0];
    int v = nums[1];
    int w = nums[2];
    int x = nums[3];
    int y = nums[4];
    int z = nums[5];

    double res = ( x + y ) * ( z - w ) / (double) v + u; 

    System.out.print("Resultado: " + res);
  }
}
