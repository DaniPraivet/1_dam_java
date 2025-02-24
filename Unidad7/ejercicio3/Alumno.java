package Unidad7.ejercicio3;

import java.util.Scanner;

public class Alumno {
    String nombre;
    int edad;
    double calificacion;
    int id;

    public Alumno(String nombre, int edad, double calificacion, int id) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
        this.id = id;
    }

    public double redondeoNota() {
        return Math.round(calificacion);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", calificacion=" + calificacion +
                ", id=" + id +
                '}';
    }
}