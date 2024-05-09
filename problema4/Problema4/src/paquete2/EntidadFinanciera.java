/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author User
 */
public class EntidadFinanciera {
    private String nombre;
    private String nombre1;
    private double valor;
    private double comision;
    
    
    public EntidadFinanciera(String n, String n1, double x){
        nombre = n;
        nombre1 = n1;
        valor = x;
    }
    
    
    public void calcularComisionBanco(){
        comision = valor * 0.003 / 100;
    }

    @Override
    public String toString() {
        String cadena = String.format("Chequera\n\n"
                +"Nombre del Cliente: %s\n"
                + "Nombre del Banco: %s\n"
                + "Valor del Cheque: %.3f\n"
                + "Comsion del Banco: %.3f\n",
                obtenerNombre(),
                obtenerNombre1(),
                obtenerValor(),
                obtenerComision());
        return cadena;
    }
    
    
    
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerNombre1(String n){
        nombre1 = n;
    }
    public void establecerValor(double n){
        valor = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerNombre1(){
        return nombre1;
    }
    public double obtenerValor(){
        return valor;
    }
    public double obtenerComision(){
        return comision;
    }
}
