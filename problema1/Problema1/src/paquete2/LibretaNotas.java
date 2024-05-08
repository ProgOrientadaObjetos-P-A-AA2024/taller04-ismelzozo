
package paquete2;


public class LibretaNotas {
    private String nombreEstudiantes;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    
    public LibretaNotas(String n, double c1, double c2, double c3){
        nombreEstudiantes = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }
    public LibretaNotas(String n, double c1, double c2){
        nombreEstudiantes = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = 10;
    }
    
    public void establecerNombreEstudiante(String n){
        nombreEstudiantes = n;
    }
    
    public void establecerCalificacion1(double n){
        calificacion1 = n;
    }
    public void establecerCalificacion2(double n){
        calificacion2 = n;
    }
    public void establecerCalificacion3(double n){
        calificacion3 = n;
    }
    public void establecerPromedio(){
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }
    
    public String obtenerNombreEstudiantes(){
        return nombreEstudiantes;
    }
    public double obtenerCalificacion1(){
        return calificacion1;
    }
    public double obtenerCalificacion2(){
        return calificacion2;
    }
    public double obtenerCalificacion3(){
        return calificacion3;
    }
    public  double obtenerPromedio(){
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("librerta de calificaciones\n"+
                "Nombre del estudiante: _%s\n"+ 
                "Calificacion1:  %.3f\n"+
                "Calificacion2: %.3f\n" + 
                "Calificacion3: %.3\n", 
                nombreEstudiantes,
                obtenerCalificacion1(),
                calificacion2,
                calificacion3,
                obtenerPromedio());
        return cadena;
    }
    
    
    
}
