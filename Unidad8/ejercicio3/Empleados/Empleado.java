package Unidad8.ejercicio3.Empleados;

public class Empleado {
    String nombre;
    String dni;

    public Empleado(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
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

    public void mostrarInformacion() {
        System.out.println("\t\t\t Nombre: " + this.getNombre());
        System.out.println("\t\t\t DNI: " + this.getDni());
    }
}

