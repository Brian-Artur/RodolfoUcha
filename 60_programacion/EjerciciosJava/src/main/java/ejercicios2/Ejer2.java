package ejercicios2;
import java.util.Scanner;

public class Ejer2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Ingresa tu año de nacimiento: ");
    int bornAge = Integer.parseInt(sc.next());
    System.out.print("Ingresa el año actual: ");
    int actuallyAge = Integer.parseInt(sc.next());
    
    int edad = actuallyAge - bornAge;

    System.out.println(edad);
  }
}
