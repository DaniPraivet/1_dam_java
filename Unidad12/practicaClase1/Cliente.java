package Unidad12.practicaClase1;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Cliente implements Comparable<Cliente>{
    String dni;
    String nombre;
    LocalDate fechaNacimiento;

    public Cliente(String dni, String nombre, String fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatoFecha);
    }

    int getEdad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public boolean equals(Object o) {
        return dni.equals(((Cliente)o).dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, fechaNacimiento);
    }

    @Override
    public int compareTo(Cliente o) {
        return dni.compareTo(o.dni);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + getEdad() +
                '}';
    }
}
