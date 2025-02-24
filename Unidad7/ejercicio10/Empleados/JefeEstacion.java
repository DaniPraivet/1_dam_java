package Unidad7.ejercicio10.Empleados;

import java.time.LocalDateTime;

public class JefeEstacion {
    String nombre;
    String dni;
    LocalDateTime fecha; // Cuando fue nombrado jefe

    public JefeEstacion(String nombre, String dni, LocalDateTime fecha) {
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
    }
}
