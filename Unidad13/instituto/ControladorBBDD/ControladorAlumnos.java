package Unidad13.instituto.ControladorBBDD;

import Unidad13.instituto.Alumno;
import Unidad13.instituto.Asignatura;
import Unidad13.instituto.Modelo.ConexionDAOInstituto;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ControladorAlumnos {
    Map<Integer, Alumno> alumnos;
    List<Asignatura> asignaturas;


    public ControladorAlumnos() {
        alumnos = ConexionDAOInstituto.obtenerAlumnos();
        asignaturas = ConexionDAOInstituto.obtenerAsignaturas();
    }

    public Map<Integer, Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Map<Integer, Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void mostrarAlumnos() {
        for (Map.Entry<Integer,Alumno> a : alumnos.entrySet()) {
            System.out.println(a.getKey() + " - " + a.getValue());
        }
    }

    public boolean agregarAlumno(Alumno a) {
        return ConexionDAOInstituto.insertarAlumno(a);
    }

    public boolean agregarAsignatura(Asignatura a){
        return ConexionDAOInstituto.insertarAsignatura(a);
    }

    public void mostrarAlumnosPorNombre() {
        alumnos.entrySet()
                .stream()
                .sorted(Comparator.comparing(a -> a.getValue().getNombre(), String.CASE_INSENSITIVE_ORDER))
                .forEach(a -> System.out.println(a.getKey() + " - " + a.getValue()));
    }
    public void mostrarAsignaturas() {
        System.out.println("Lista de asignaturas: ");
        asignaturas.sort(Comparator.comparing(Asignatura::getCurso, Integer::compareTo));
        for (Asignatura a : asignaturas) {
            System.out.println(a);
        }
    }
}
