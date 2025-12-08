package ejercicios1;
public class Ejer14 {
  public static void main(String[] args) {
    double valor = 2.56984;

    int parteEntera = (int)valor;
    double parteDecimal = valor - parteEntera;

    System.out.print("Parte entera: ");
    System.out.println(parteEntera);
    System.out.print("Parte decimal: ");
    System.out.println(parteDecimal);
  }
}
