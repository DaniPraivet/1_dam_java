package Unidad13.instituto.Vista;

import Unidad13.instituto.Alumno;
import Unidad13.instituto.Asignatura;
import Unidad13.instituto.ControladorBBDD.Controlador;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static boolean ejecucion = true;
    public static void main(String[] args) {
        String opcion;
        Controlador controlador = new Controlador();
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
        System.out.println("5. Matriculas de un alumno");
        System.out.println("6. Matriculas de una asignatura");
        System.out.println("7. Obtener nota media alumno");
        System.out.println("8. Matricular alumno y asignar nota");
        System.out.println("9. Eliminar matricula alumno");
        System.out.println("0. Salir.");
    }
    static boolean gestionarOpciones(String opcion, Controlador controlador) {
        switch (opcion) {
            case "1" -> controlador.mostrarAlumnosPorNombre();
            case "2" -> {
                agregarAlumno(controlador);
            }
            case "3" -> {
                controlador.mostrarAsignaturas();
            }
            case "4" -> {
                agregarAsignatura(controlador);
            }
            case "5" -> {
                controlador.getMatriculasAlumno();
            }
            case "6" -> {
                controlador.obtenerPromedioNotasAlumno();
            }
            case "7" -> {
                controlador.obtenerPromedioNotasAsignatura();
            }
            case "8" -> {
                controlador.matricularAlumnoYAsignarNota();
            }
            case "9" -> {
                controlador.eliminarMatriculaAlumno();
            }
            default -> {
                System.out.println("Opción inválida.");
            }
        }
        return ejecucion;
        }

    private static void agregarAlumno(Controlador controlador) {
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
    private static void agregarAsignatura(Controlador controlador) {
        System.out.println("Nombre asignatura: ");
        String nombreAsignatura = sc.nextLine();
        System.out.println("Año del curso asignatura: ");
        int anyoCurso = Integer.parseInt(sc.nextLine());
        boolean asignaturaAgregadaCorrectamente = controlador.agregarAsignatura(new Asignatura(controlador.ultimoIdAsignaturas()+1, nombreAsignatura,anyoCurso));

        if (asignaturaAgregadaCorrectamente) {
            System.out.println("Alumno agregado correctamente");
        } else {
            System.out.println("Hubo un problema intentando agregar el alumno a la BBDD");
        }
    }
}



