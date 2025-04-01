package Unidad10.examen;

import java.util.Objects;

public class Libro {
    String titulo;
    String autor;
    int anyoPublicacion;
    String editorial;

    public Libro(String titulo, String autor, int anyoPublicacion, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.anyoPublicacion = anyoPublicacion;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public void setAnyoPublicacion(int anyoPublicacion) {
        this.anyoPublicacion = anyoPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Libro libro)) return false;
        return anyoPublicacion == libro.anyoPublicacion && Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor) && Objects.equals(editorial, libro.editorial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, anyoPublicacion, editorial);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anyoPublicacion=" + anyoPublicacion +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}

