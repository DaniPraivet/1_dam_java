package Unidad12.ejercicio10;

import java.util.Objects;

public class Cliente implements Comparable<Cliente>{
    private String nombre;
    private int edad;

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente cliente)) return false;
        return edad == cliente.edad && nombre.equals(cliente.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre,edad);
    }
    @Override
    public int compareTo(Cliente clienteAComparar) {
        return this.nombre.compareTo(clienteAComparar.nombre);
    }
}
