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

    public String getNombreAula() {
        return nombreAula;
    }

    public int getAlumnosMaximos() {
        return alumnosMaximos;
    }

    public Alumno[] getAula() {
        return aula;
    }

    public boolean isEstadoAula() {
        return estadoAula;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setNombreAula(String nombreAula) {
        this.nombreAula = nombreAula;
    }

    public void setAlumnosMaximos(int alumnosMaximos) {
        this.alumnosMaximos = alumnosMaximos;
    }

    public void setAula(Alumno[] aula) {
        this.aula = aula;
    }

    public void setEstadoAula(boolean estadoAula) {
        this.estadoAula = estadoAula;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public static Aula crearAula () {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int numeroAlumnos = 0;
        Integer nAlumnos;

        for(;;) {
            System.out.println("Dime el nombre de la nueva aula: ");
            nombre = sc.nextLine();
            System.out.println("Dime la cantidad máxima de alumnos en ");
            nAlumnos = sc.nextInt();
            if (nombre.isEmpty() || nAlumnos.describeConstable().isEmpty()) {
                System.out.println("No puedes dejar ninguno de los campos vacios, ni dejar el espacio del aula menor o igual que 0.");
            }
            else {
                break;
            }
        }
        numeroAlumnos = nAlumnos;
        Alumno[] nuevaAula;
        nuevaAula = new Alumno[numeroAlumnos];
        return new Aula(numeroAlumnos, nuevaAula, nombre, false);
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
