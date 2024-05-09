/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.EntidadFinanciera;
/**
 *
 * @author User
 */
public class Problema4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntidadFinanciera ef = new EntidadFinanciera("Casi Sanchez", "Banco de Loja", 2256);
        ef.calcularComisionBanco();
        
        System.err.printf("%s\n", ef);
    
    }
    
}
