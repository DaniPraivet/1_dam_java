package Unidad13.instituto.ControladorBBDD;

import Unidad13.instituto.Alumno;
import Unidad13.instituto.Asignatura;
import Unidad13.instituto.Matricula;
import Unidad13.instituto.Modelo.ConexionDAOInstituto;

import java.util.Comparator;
import java.util.List;

public class Controlador {

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
    public Alumno obtenerAlumnoPorId(int idAlumno) {
        return ConexionDAOInstituto.obtenerAlumnoPorId(idAlumno);
    }

    // ASIGNATURAS
    public List<Asignatura> obtenerAsignaturas() {
        return ConexionDAOInstituto.obtenerAsignaturas();
    }

    public boolean agregarAsignatura(Asignatura a) {
        return ConexionDAOInstituto.insertarAsignatura(a);
    }

    public int ultimoIdAsignaturas() {
        List<Asignatura> asignaturas = obtenerAsignaturas();
        if (asignaturas.isEmpty()) return 0;
        // Suponiendo que la asignatura con mayor id tiene el último id
        return asignaturas.stream().mapToInt(Asignatura::getId).max().orElse(0);
    }
    public Asignatura obtenerAsignaturaPorId(int idAsignatura) {
        return ConexionDAOInstituto.obtenerAsignatura(idAsignatura);
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

}