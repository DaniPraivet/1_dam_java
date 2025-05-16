package Unidad13.instituto;

public class Asignatura {
    int id;
    String nombre;
    int curso;

    public Asignatura(int id, String nombre, int curso) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
    return id  + " - " + nombre + " - " + curso + "\n";
    }
}
