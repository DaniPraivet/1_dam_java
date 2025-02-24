package Unidad7.ejercicioProfesora;

public class Vaca {
    String nombre;
    String producto; // carne, leche

    public Vaca(String nombre, String producto) {
        this.nombre = nombre;
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Vaca{" +
                "nombre='" + nombre + '\'' +
                ", producto=" + producto +
                '}';
    }
}

