package Unidad7.ejercicio6;

public class Gestor {
    public String nombre;
    private final String tlf;
    protected double cantidad = 10000;

    public Gestor(String nombre, String tlf) {
        this.nombre = nombre;
        this.tlf = tlf;
    }

    public Gestor(String nombre, String tlf, double cantidad) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.cantidad = cantidad;
    }

    public String getTlf() {
        return tlf;
    }
}