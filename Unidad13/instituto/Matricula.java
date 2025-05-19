package Unidad13.instituto;

public class Matricula {
    int id;
    Alumno alumno;
    Asignatura asignatura   ;
    double nota;

    public Matricula(int id, Unidad13.instituto.Alumno alumno, Unidad13.instituto.Asignatura asignatura, double nota) {
        this.id = id;
        this.alumno = alumno;
        this.asignatura = asignatura;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Unidad13.instituto.Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Unidad13.instituto.Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
