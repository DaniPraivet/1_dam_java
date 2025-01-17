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

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
}
