package dev.IgnacioElgueta;

public class Libro {
    private String title;
    private int year;
    private String author;
    private String isbn;

    public Libro() {
        this.title = "Sin definir";
        this.year = 2026;
        this.author = "Anonimo";
        this.isbn = "";
    }

    public boolean prestamo(String prestamo) {
        return true;
    }

    public boolean disponibilidad(String disponibilidad) {
        return true;
    }

    public void devolver(String fechaDevoluvion) {

    }

    private void isbn() {

    }


    private void author() {

    }

    private void title() {

    }
    private void year() {

    }
}
