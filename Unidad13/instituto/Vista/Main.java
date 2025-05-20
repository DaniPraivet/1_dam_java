package Unidad13.instituto.Vista;

import Unidad13.instituto.Alumno;
import Unidad13.instituto.Asignatura;
import Unidad13.instituto.ControladorBBDD.Controlador;
import Unidad13.instituto.Matricula;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Alumno> alumnos;
    private static List<Asignatura> asignaturas;

    private static Scanner sc = new Scanner(System.in);
    private static boolean ejecucion = true;

    public static void main(String[] args) {
        String opcion;
        Controlador controlador = new Controlador();
        alumnos = controlador.obtenerAlumnos();
        asignaturas = controlador.obtenerAsignaturas();
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
                mostrarAsignaturas();
            }
            case "4" -> {
                agregarAsignatura(controlador);
            }
            case "5" -> {
                System.out.print("Introduce el ID del alumno: ");
                int idAlumno = Integer.parseInt(sc.nextLine());
                getMatriculasAlumno(controlador,idAlumno);
            }
            case "6" -> {
                obtenerPromedioNotasAsignatura(controlador);
            }
            case "7" -> {
                obtenerPromedioNotasAlumno(controlador);
            }
            case "8" -> {
                matricularAlumnoYAsignarNota(controlador);
            }
            case "9" -> {
                eliminarMatriculaAlumno(controlador);
            }
            case "0" -> {
                System.out.println("Gracias por usar el programa.");
                ejecucion=false;
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
        boolean alumnoAgregadoCorrectamente = controlador.agregarAlumno(new Alumno(controlador.ultimoIdAsignaturas(), nombreAlumno,direccionAlumno,matriculaAlumno,carnetConducir));

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
    private static void eliminarMatriculaAlumno(Controlador controlador) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID alumno: ");
        int idAlumno = sc.nextInt();
        System.out.print("ID asignatura: ");
        int idAsignatura = sc.nextInt();

        boolean exito = controlador.eliminarMatricula(idAlumno, idAsignatura);
        if (exito) {
            System.out.println("Matrícula eliminada correctamente.");
        } else {
            System.out.println("No se pudo eliminar la matrícula.");
        }
    }
    private static void matricularAlumnoYAsignarNota(Controlador controlador) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID alumno: ");
        int idAlumno = sc.nextInt();
        System.out.print("ID asignatura: ");
        int idAsignatura = sc.nextInt();
        System.out.print("Nota: ");
        double nota = sc.nextDouble();

        Alumno alumno = controlador.obtenerAlumnoPorId(idAlumno);
        Asignatura asignatura = controlador.obtenerAsignaturaPorId(idAsignatura);
        if (alumno == null || asignatura == null) {
            System.out.println("Alumno o asignatura no encontrados.");
            return;
        }
        Matricula matricula = new Matricula(0, alumno, asignatura, nota);

        boolean exito = controlador.insertarMatricula(matricula);
        if (exito) {
            System.out.println("Matrícula creada correctamente.");
        } else {
            System.out.println("Error al crear la matrícula.");
        }
    }
    private static void obtenerPromedioNotasAsignatura(Controlador controlador) {
        System.out.print("Introduce ID de la asignatura: ");
        int idAsignatura = new Scanner(System.in).nextInt();
        List<Matricula> matriculas = controlador.obtenerMatriculasPorAsignatura(idAsignatura);
        if (matriculas.isEmpty()) {
            System.out.println("No hay matrículas para esta asignatura.");
            return;
        }
        double sumaNotas = 0;
        for (Matricula m : matriculas) {
            sumaNotas += m.getNota();
        }
        double media = sumaNotas / matriculas.size();
        System.out.printf("La nota media de la asignatura %s es %.2f\n", matriculas.get(0).getAsignatura().getNombre(), media);
    }
    private static void obtenerPromedioNotasAlumno(Controlador controlador) {
        System.out.print("Introduce ID del alumno: ");
        int idAlumno = new Scanner(System.in).nextInt();
        List<Matricula> matriculas = controlador.obtenerMatriculasPorAlumno(idAlumno);
        if (matriculas.isEmpty()) {
            System.out.println("El alumno no tiene matrículas.");
            return;
        }
        double sumaNotas = 0;
        for (Matricula m : matriculas) {
            sumaNotas += m.getNota();
        }
        double media = sumaNotas / matriculas.size();
        System.out.printf("La nota media del alumno %s es %.2f\n", matriculas.get(0).getAlumno().getNombre(), media);
    }
    private static void getMatriculasAlumno(Controlador controlador, int idAlumno) {
        List<Matricula> matriculas = controlador.obtenerMatriculasPorAlumno(idAlumno);
        if (matriculas.isEmpty()) {
            System.out.println("El alumno no tiene matrículas.");
            return;
        }
        System.out.println("Matrículas del alumno " + matriculas.get(0).getAlumno().getNombre() + ":");
        for (Matricula m : matriculas) {
            System.out.printf("Asignatura: %s, Nota: %.2f\n", m.getAsignatura().getNombre(), m.getNota());
        }
    }
    private static void mostrarAsignaturas() {
        System.out.println("=== Listado de asignaturas ===");
        for (Asignatura asig : asignaturas) {
            System.out.println(asig);
        }
    }
}



