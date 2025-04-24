package Unidad12.ejercicio10;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Cliente> clientesPorNombre = new TreeSet<>();
        clientesPorNombre.add(new Cliente("Dani",19));
        clientesPorNombre.add(new Cliente("Andrés",20));
        clientesPorNombre.add(new Cliente("Javi",18));

        System.out.println("Clientes ordenados por nombre (TreeSet)");
        clientesPorNombre.forEach(System.out::println);


        Set<Cliente> clientesPorEdad = new TreeSet<>(Comparator.comparingInt(Cliente::getEdad));
        clientesPorEdad.addAll(clientesPorNombre);

        System.out.println("\nClientes ordenados por edad (TreeSet con Comparator)");
        clientesPorEdad.forEach(System.out::println);
    }
}
