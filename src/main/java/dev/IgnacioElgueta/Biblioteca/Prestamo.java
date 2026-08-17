package dev.IgnacioElgueta.Biblioteca;

public class Prestamo {
   private String nombreEstudiante;
   private String tituloLibro;
   private String fechaPrestamo;
   private boolean devuelto;

   public Prestamo(String nombreEstudiante, String tituloLibro, String fechaPrestamo){
        this.nombreEstudiante = nombreEstudiante;
        this.tituloLibro = tituloLibro;
        this.fechaPrestamo = fechaPrestamo;
        this.devuelto = false;
   }

   public void registrarDevolucion() {
       this.devuelto = true;
   }

   public String obtenerInformacion() {
       return "Estudiante: " + this.nombreEstudiante + " Libro: " + this.tituloLibro + " Devuelto: " + this.devuelto;
   }

   public boolean estaDevuelto() {
       return this.devuelto;
   }
}
