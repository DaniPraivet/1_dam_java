package Unidad13.instituto;

public class Alumno {
    int id;
    String nombre;
    String direccion;
    String estadoMatricula;
    boolean carnetConducir;

    public Alumno(int id, String nombre, String direccion, String estadoMatricula, int carnetConducir) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoMatricula = estadoMatricula;
        this.carnetConducir = (carnetConducir == 1);
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstadoMatricula() {
        return estadoMatricula;
    }

    public void setEstadoMatricula(String estadoMatricula) {
        this.estadoMatricula = estadoMatricula;
    }

    public boolean isCarnetConducir() {
        return carnetConducir;
    }

    public void setCarnetConducir(boolean carnetConducir) {
        this.carnetConducir = carnetConducir;
    }

    @Override
    public String toString() {
        return id + " - " + nombre + " - " + direccion + " - " + estadoMatricula + " - " + (carnetConducir ? "Sí" : "No");
    }
}