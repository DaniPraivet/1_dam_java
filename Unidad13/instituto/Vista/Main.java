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
        System.out.println("0. Salir.");
    }
    static boolean gestionarOpciones(String opcion, ControladorAlumnos controlador) {
        switch (opcion) {
            case "1" -> controlador.mostrarAlumnos();
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
                controlador.agregarAlumno(controlador.getAlumnos().size()+1,new Alumno(nombreAlumno,direccionAlumno,matriculaAlumno,carnetConducir));
            }
            default -> {
                System.out.println("Opción inválida.");
            }
        }
        return ejecucion;
        }
    }



