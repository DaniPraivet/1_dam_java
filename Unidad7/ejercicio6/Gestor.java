package Unidad7.ejercicio6;

public class Gestor {
    public String nombre; // Nombre del gestor (público)
    private final String tlf; // Teléfono del gestor (inmutable)
    protected double cantidad = 10000.0; // Importe máximo autorizado (visible para clases vecinas)

    // Constructor con importe predeterminado
    public Gestor(String nombre, String tlf) {
        this.nombre = nombre;
        this.tlf = tlf;
    }

    // Constructor con importe específico
    public Gestor(String nombre, String tlf, double cantidad) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.cantidad = cantidad;
    }

    // Metodo para consultar el teléfono
    public String getTlf() {
        return tlf;
    }
}
