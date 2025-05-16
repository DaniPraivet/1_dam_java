package Unidad13.instituto.Vista;

import Unidad13.instituto.Alumno;
import Unidad13.instituto.ControladorBBDD.ControladorAlumnos;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static boolean ejecucion = true;
    public static void main(String[] args) {
        String opcion;
        ControladorAlumnos controlador = new ControladorAlumnos();
        while (ejecucion) {
            mostrarMenu();
            opcion = sc.nextLine();
            ejecucion = gestionarOpciones(opcion,controlador);
        }

    }

    static void mostrarMenu() {
        System.out.println("=".repeat(24)+" ".repeat(2)+"Menu"+" ".repeat(2)+"=".repeat(24));
        System.out.println("1. Listar alumnos por orden alfabético.");
        System.out.println("2. Introducir un alumno nuevo.");
        System.out.println("3. Listar asignaturas");
        System.out.println("4. Insertar asignaturas");
        System.out.println("0. Salir.");
    }
    static boolean gestionarOpciones(String opcion, ControladorAlumnos controlador) {
        switch (opcion) {
            case "1" -> controlador.mostrarAlumnosPorNombre();
            case "2" -> {
                System.out.println("Nombre del alumno: ");
                String nombreAlumno = sc.nextLine();
                System.out.println("Direccion: ");
                String direccionAlumno = sc.nextLine();
                System.out.println("Estado de la matrícula");
                String matriculaAlumno = sc.nextLine();
                System.out.println("¿Tiene carnet de conducir? (si/no)");
                String carnetAlumno = sc.nextLine();
                int carnetConducir;
                if (carnetAlumno.equalsIgnoreCase("si")) {
                    carnetConducir = 1;
                } else {
                    carnetConducir = 0;
                }
                boolean alumnoAgregadoCorrectamente = controlador.agregarAlumno(new Alumno(nombreAlumno,direccionAlumno,matriculaAlumno,carnetConducir));

                if (alumnoAgregadoCorrectamente) {
                    System.out.println("Alumno agregado correctamente");
                } else {
                    System.out.println("Hubo un problema intentando agregar el alumno a la BBDD");
                }
            }
            case "3" -> {
                controlador.mostrarAsignaturas();
            }
            case "4" -> {
                System.out.println("");
            }
            default -> {
                System.out.println("Opción inválida.");
            }
        }
        return ejecucion;
        }
    }



