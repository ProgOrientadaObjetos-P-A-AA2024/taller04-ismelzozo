
package paquete2;

public class Instituto {
    private String nombreEstudiantes;
    private String apellidoEstudiantes;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    
    public Instituto(String n, String a, double x, String c){
        nombreEstudiantes = n;
        apellidoEstudiantes = a;
        sueldoBasico = x;
        cedula = c;
    }
    
    public Instituto(String n){
        nombreEstudiantes = n;
        apellidoEstudiantes = "perez";
        sueldoBasico = 700;
        cedula = "554236784";
    }

    @Override
    public String toString() {
        String cadena = String.format("Profesores de un Instituto\n\n"
                +"Nombre del Estudiante: %s\n"
                + "Apellido del Estudiante: %s\n"
                + "sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n"
                + "Cedula: %s\n",
                obtenerNombreEstudiantes(),
                obtenerApellodoEstudiantes(),
                obtenerSueldoBasico(),
                obtenerSueldoTotal(),
                obtenerCedula());
        return cadena;
    }
    
    public void calcularSueldoTotal(){
        sueldoTotal = sueldoBasico * 0.2;
    }
    
    public void establecerNombreEstudiantes(String n){
        nombreEstudiantes = n;
    }
    public void establecerApellidoEstudiantes(String a){
        apellidoEstudiantes = a;
    }
    public void establecerSueldoBasico(double s){
        sueldoBasico = s;
    }
    public void establecerSuedoTotal(double s){
        sueldoTotal = s;
    }
    public void establecerCedela(String c){
        cedula = c;
    }
    
    public String obtenerNombreEstudiantes(){
        return nombreEstudiantes;
    }
    public String obtenerApellodoEstudiantes(){
        return apellidoEstudiantes;
    }
    public double obtenerSueldoBasico(){
        return sueldoBasico;
    }
    public double obtenerSueldoTotal(){
        return sueldoTotal;
    }
    public String obtenerCedula(){
        return cedula;
    }
}
