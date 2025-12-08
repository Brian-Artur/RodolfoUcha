package ejercicios4;

public class Ejer2 {
  public static void main(String[] args) {
    int sum = 0;

    for (int i = 2; i < 100; i += 2) {
      sum += i;
    }

    System.out.println("The sum is: " + sum);
  }
}
