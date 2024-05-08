
package paquete1;
import paquete2.LibretaNotas;
public class Ejecutor {

    public static void main(String[] args) {
        LibretaNotas libreta1 = new LibretaNotas("day", 9, 8, 7);
        libreta1.establecerPromedio();
        LibretaNotas libreta2 = new LibretaNotas("casi", 7, 5);
        libreta2.establecerPromedio();
        
        System.out.printf("%s\n", libreta1);
        
        System.out.printf("%s\n", libreta2);
        
    }
    
}
