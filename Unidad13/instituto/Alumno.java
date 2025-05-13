package Unidad13.instituto;

public class Alumno {
    String nombre;
    String direccion;
    String estadoMatricula;
    boolean carnetConducir;

    public Alumno(String nombre, String direccion, String estadoMatricula, int carnetConducir) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoMatricula = estadoMatricula;
        this.carnetConducir=(carnetConducir==1);
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
        return nombre + " - " + direccion + " - " + estadoMatricula + " - " + carnetConducir;
    }
}
