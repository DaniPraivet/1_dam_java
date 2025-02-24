package Unidad7.ejercicio3;

import java.util.Scanner;


class Aula {
    private String nombreAula;
    private int alumnosMaximos;
    private Alumno[] aula;
    private boolean estadoAula;
    private int idAlumno;

    public Aula(int alumnosMaximos, String nombreAula) {
        this.alumnosMaximos = alumnosMaximos;
        this.aula = new Alumno[alumnosMaximos];
        this.nombreAula = nombreAula;
        this.estadoAula = false; // Por defecto, el aula está desocupada
    }

    public Alumno[] getAula() {
        return aula;
    }


    public boolean añadirAlumno(Alumno nuevoAlumno) {
        if (idAlumno >= alumnosMaximos) {
            System.out.println("No se pueden almacenar más alumnos en esta clase.");
            return false;
        }

        aula[idAlumno] = nuevoAlumno;
        idAlumno++;
        System.out.println("Se ha añadido el alumno " + nuevoAlumno.nombre + " al aula " + nombreAula);
        return true;
    }

    public void cambiarEstado() {
        estadoAula = !estadoAula;
        String estado = estadoAula ? "ocupada" : "libre";
        System.out.println("El estado del aula " + nombreAula + " ahora es: " + estado);
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del aula: " + nombreAula);
        System.out.println("Capacidad máxima: " + alumnosMaximos);
        System.out.println("Estado del aula: " + (estadoAula ? "Ocupada" : "Libre"));
        System.out.println("Alumnos en el aula:");
        for (Alumno alumno : aula) {
            if (alumno != null) {
                System.out.println(alumno);
            }
        }
    }
}