package Unidad7.ejercicio3;

import java.util.Scanner;

public class Alumno {
    String nombre;
    int edad;
    double calificacion;
    String clase;
    int id;

    public Alumno(String nombre, int edad, double calificacion, int id) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
        this.id = id;
    }

    public double redondeoNota(double calificacion) {
        calificacion = (double) Math.round(calificacion);
        return calificacion;
    }

    public static Alumno crearNuevoAlumno (int id) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        Integer edadAlumno;
        int edad = 0;

        for(;;) {
            System.out.println("Dime el nombre del nuevo alumn@");
            nombre = sc.nextLine();
            System.out.println("Dime la edad del nuevo alumn@");
            edadAlumno = sc.nextInt();

            if (nombre.isEmpty() || edadAlumno.describeConstable().isEmpty()) {
                System.out.println("No puedes dejar ninguno de los campos vacios.");
            }
            else {
                break;
            }
            edad = edadAlumno.intValue();
        }

        return new Alumno(nombre, edad, 0,id);
    }

}
