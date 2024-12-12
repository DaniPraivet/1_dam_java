package Unidad7.ejercicio3;

import java.util.Scanner;

public class Aula {
    public String nombreAula;
    public int alumnosMaximos;
    public Alumno[] aula;
    public boolean estadoAula;
    public int idAlumno;

    public Aula (int alumnosMaximos, Alumno[] aula, String nombreAula, boolean estadoAula) {
        this.alumnosMaximos = alumnosMaximos;
        this.aula = aula;
        this.nombreAula = nombreAula;
        this.estadoAula = estadoAula;
    }

    public static Aula crearAula (String nombreAula) {
        Scanner sc = new Scanner(System.in);

        int numeroAlumnos;

    }

    public Alumno[] añadirAlumno(Alumno[] aula) {
        Alumno nuevoAlumno = Alumno.crearNuevoAlumno(idAlumno);

        aula[idAlumno] = nuevoAlumno;
        System.out.println("Se ha creado un nuevo alumno en el aula " + this.nombreAula);

        if (idAlumno < aula.length) {
            idAlumno++;
        } else {
            System.out.println("No se pueden almacenar más alumnos en esta clase");
        }
        return aula;
    }

    /*
    public boolean cambiarEstado(boolean estadoAula) {

    }*/
    
}
