package Unidad8.ejercicio3.Empleados;

import java.time.LocalDateTime;

public class JefeEstacion extends Empleado{
    String nombre;
    String dni;
    LocalDateTime fecha; // Cuando fue nombrado jefe

    public JefeEstacion(String nombre, String dni, LocalDateTime fecha) {
        super(nombre, dni);
        this.fecha = fecha;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\t\t--\tJefe de Estación\t--");
        super.mostrarInformacion();
        System.out.println("\t\t\t Fecha de nombramiento a jefe: " + this.fecha);
    }
}
