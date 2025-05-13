package Unidad13.instituto.ControladorBBDD;

import Unidad13.instituto.Alumno;
import Unidad13.instituto.Modelo.ModeloBBDD;

import java.util.Map;

public class ControladorAlumnos {
    Map<Integer, Alumno> alumnos;


    public ControladorAlumnos() {
        alumnos = ModeloBBDD.obtenerAlumnos();
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

    public boolean agregarAlumno(int idAlumno, Alumno a) {
        int longitud = alumnos.size();
        alumnos.put(idAlumno,a);
        return longitud < alumnos.size();
    }
}
