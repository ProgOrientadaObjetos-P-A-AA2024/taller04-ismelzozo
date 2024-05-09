
package paquete1;
import paquete2.Automovil;

public class Problema3 {

    
    public static void main(String[] args) {
        Automovil auto = new Automovil("4420157863", "Toyota", 1999, 20200);
        auto.calcularValorMatri();
        System.err.printf("%s\n",auto);
        
    }
    
}
