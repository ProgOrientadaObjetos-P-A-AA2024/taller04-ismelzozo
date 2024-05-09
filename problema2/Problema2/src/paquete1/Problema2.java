
package paquete1;
import paquete2.Instituto;

public class Problema2 {

    public static void main(String[] args) {
        Instituto i1 = new Instituto("day", "tene", 2000, "115522146");
        i1.calcularSueldoTotal();
        Instituto i2 = new Instituto("isbel");
        i2.calcularSueldoTotal();
        System.out.printf("%s\n", i1);
        System.out.printf("%s\n", i2);
    }
    
}
