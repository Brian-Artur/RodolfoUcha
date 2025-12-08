package ejercicios2;
import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    
    System.out.print("Ingresa la cuenta: ");
    int account = Integer.parseInt(sc.next());

    System.out.print("Ingresa el porcentaje de promina : ");
    int tipPercent = Integer.parseInt(sc.next());

    double totalTip = (account * tipPercent) / 100;
    double amount = account + totalTip;

    System.out.print("Cantidad de propina: ");
    System.out.println(totalTip);
    System.out.print("Cantidad de la factura: ");
    System.out.println(amount);
  }
}
