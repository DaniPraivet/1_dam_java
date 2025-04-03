package Unidad11.ejercicio5;

import java.time.LocalDateTime;

public class Deportista {
    final String DNI;
    String nombre;
    LocalDateTime fechaNacimiento;
    Deportes deporte;

    public Deportista(String DNI, LocalDateTime fechaNacimiento, String nombre, int idDeporte) {
        this.DNI = DNI;
        this.deporte = Deportes.asignarDeporte(idDeporte);
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;

    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Deportes getDeporte() {
        return deporte;
    }

    public void setDeporte(Deportes deporte) {
        this.deporte = deporte;
    }
}
