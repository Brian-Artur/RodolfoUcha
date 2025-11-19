package ejercicios1;
import java.math.BigDecimal;

public class Ejer14b {
  public static void main(String[] args) {
    BigDecimal valor = new BigDecimal("2.56984");
    BigDecimal parteEntera = new BigDecimal(valor.intValue());
    BigDecimal parteDecimal = valor.subtract(parteEntera);

    System.out.println("Parte entera: " + parteEntera);
    System.out.println("Parte decimal: " + parteDecimal);
  }
}
