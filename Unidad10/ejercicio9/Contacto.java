package Unidad10.ejercicio9;

public class Contacto {
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return nombre + " - " + telefono;
    }

    public boolean equals(Contacto c) {
        return this.getNombre().equals(c.getNombre()) && this.getTelefono().equals(c.getTelefono());
    }
}
