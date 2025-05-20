package Unidad13.instituto.ControladorBBDD;

import Unidad13.instituto.Alumno;
import Unidad13.instituto.Asignatura;
import Unidad13.instituto.Matricula;
import Unidad13.instituto.Modelo.ConexionDAOInstituto;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Controlador {

    public Controlador() {
        // No caches listas aquí
    }

    // ALUMNOS
    public List<Alumno> obtenerAlumnos() {
        return ConexionDAOInstituto.obtenerAlumnos();
    }

    public boolean agregarAlumno(Alumno a) {
        return ConexionDAOInstituto.insertarAlumno(a);
    }

    public void mostrarAlumnosPorNombre() {
        List<Alumno> alumnos = obtenerAlumnos();
        alumnos.sort(Comparator.comparing(Alumno::getNombre, String.CASE_INSENSITIVE_ORDER));
        alumnos.forEach(System.out::println);
    }

    // ASIGNATURAS
    public List<Asignatura> obtenerAsignaturas() {
        return ConexionDAOInstituto.obtenerAsignaturas();
    }

    public boolean agregarAsignatura(Asignatura a) {
        return ConexionDAOInstituto.insertarAsignatura(a);
    }

    public void mostrarAsignaturas() {
        List<Asignatura> asignaturas = obtenerAsignaturas();
        asignaturas.sort(Comparator.comparing(Asignatura::getCurso));
        asignaturas.forEach(System.out::println);
    }

    public int ultimoIdAsignaturas() {
        List<Asignatura> asignaturas = obtenerAsignaturas();
        if (asignaturas.isEmpty()) return 0;
        // Suponiendo que la asignatura con mayor id tiene el último id
        return asignaturas.stream().mapToInt(Asignatura::getId).max().orElse(0);
    }

    // MATRICULAS
    public List<Matricula> obtenerMatriculasPorAlumno(int idAlumno) {
        return ConexionDAOInstituto.obtenerMatriculasPorAlumno(idAlumno);
    }

    public List<Matricula> obtenerMatriculasPorAsignatura(int idAsignatura) {
        return ConexionDAOInstituto.obtenerMatriculasPorAsignatura(idAsignatura);
    }

    public boolean insertarMatricula(Matricula m) {
        return ConexionDAOInstituto.insertarMatricula(m);
    }

    public boolean eliminarMatricula(int idAlumno, int idAsignatura) {
        return ConexionDAOInstituto.eliminarMatricula(idAlumno, idAsignatura);
    }

    // Aquí puedes añadir más métodos para calcular notas medias, máximas, mínimas, etc.
}