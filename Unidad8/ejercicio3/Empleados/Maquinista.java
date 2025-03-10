package Unidad8.ejercicio3.Empleados;

public class Maquinista extends Empleado{
    String nombre;
    String dni;
    int sueldo;
    String rango;

    public Maquinista(String nombre, String dni, int sueldo, String rango) {
        super(nombre, dni);
        this.sueldo = sueldo;
        this.rango = rango;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\t\t--\tMaquinista\t--");
        super.mostrarInformacion();
        System.out.println("\t\t\t Sueldo: " + this.sueldo);
        System.out.println("\t\t\t Rango: " + this.rango);
    }
}

