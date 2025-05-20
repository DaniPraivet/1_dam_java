package Unidad13.instituto.Vista;

import Unidad13.instituto.Alumno;
import Unidad13.instituto.Asignatura;
import Unidad13.instituto.ControladorBBDD.Controlador;

import java.util.Comparator;
import java.util.List;
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
                System.out.print("Introduce el ID del alumno: ");
                int idAlumno = Integer.parseInt(sc.nextLine());
                controlador.getMatriculasAlumno(idAlumno);
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
    public void eliminarMatriculaAlumno() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID alumno: ");
        int idAlumno = sc.nextInt();
        System.out.print("ID asignatura: ");
        int idAsignatura = sc.nextInt();

        boolean exito = eliminarMatricula(idAlumno, idAsignatura);
        if (exito) {
            System.out.println("Matrícula eliminada correctamente.");
        } else {
            System.out.println("No se pudo eliminar la matrícula.");
        }
    }
    public void matricularAlumnoYAsignarNota() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID alumno: ");
        int idAlumno = sc.nextInt();
        System.out.print("ID asignatura: ");
        int idAsignatura = sc.nextInt();
        System.out.print("Nota: ");
        double nota = sc.nextDouble();

        Alumno alumno = obtenerAlumnoPorId(idAlumno);
        Asignatura asignatura = obtenerAsignaturaPorId(idAsignatura);
        if (alumno == null || asignatura == null) {
            System.out.println("Alumno o asignatura no encontrados.");
            return;
        }
        Matricula matricula = new Matricula(0, alumno, asignatura, nota); // 0 para id, se puede gestionar automáticamente en BBDD

        boolean exito = insertarMatricula(matricula);
        if (exito) {
            System.out.println("Matrícula creada correctamente.");
        } else {
            System.out.println("Error al crear la matrícula.");
        }
    }
    public void obtenerPromedioNotasAsignatura() {
        System.out.print("Introduce ID de la asignatura: ");
        int idAsignatura = new Scanner(System.in).nextInt();
        List<Matricula> matriculas = obtenerMatriculasPorAsignatura(idAsignatura);
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
    public void obtenerPromedioNotasAlumno() {
        System.out.print("Introduce ID del alumno: ");
        int idAlumno = new Scanner(System.in).nextInt();
        List<Matricula> matriculas = obtenerMatriculasPorAlumno(idAlumno);
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
    public void getMatriculasAlumno(int idAlumno) {
        List<Matricula> matriculas = obtenerMatriculasPorAlumno(idAlumno);
        if (matriculas.isEmpty()) {
            System.out.println("El alumno no tiene matrículas.");
            return;
        }
        System.out.println("Matrículas del alumno " + matriculas.get(0).getAlumno().getNombre() + ":");
        for (Matricula m : matriculas) {
            System.out.printf("Asignatura: %s, Nota: %.2f\n", m.getAsignatura().getNombre(), m.getNota());
        }
    }
    public void mostrarAsignaturas() {
        List<Asignatura> asignaturas = obtenerAsignaturas(); // método que devuelve lista de asignaturas
        System.out.println("=== Listado de asignaturas ===");
        for (Asignatura asig : asignaturas) {
            System.out.println(asig);
        }
    }
    public void mostrarAlumnosPorNombre() {
        List<Alumno> listaAlumnos = obtenerAlumnos(); // Método que devuelve la lista de alumnos (de la BBDD o en memoria)
        listaAlumnos.sort(Comparator.comparing(Alumno::getNombre));
        System.out.println("=== Alumnos por orden alfabético ===");
        for (Alumno a : listaAlumnos) {
            System.out.println(a);
        }
    }
}



