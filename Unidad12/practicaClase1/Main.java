package Unidad12.practicaClase1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {
    static List<Cliente> listaClientes = new ArrayList<>();
    static Collection<Cliente> coleccionClientes = listaClientes;

    public static void main(String[] args) {
        Cliente c1 = new Cliente("46074547G","Daniel", "29/03/2006");


        boolean anyadir = coleccionClientes.add(c1);
        String resultadoAnyadir = anyadir ? "Se ha añadido el cliente" : "Error al añadir al cliente";
        System.out.println(resultadoAnyadir);
        System.out.println(coleccionClientes);


        boolean eliminar = coleccionClientes.remove(c1);
        String resultadoEliminar = eliminar ? "Se ha eliminado el cliente" : "Error al eliminar al cliente";
        System.out.println(resultadoEliminar);
        System.out.println(coleccionClientes);
        System.out.println(coleccionClientes.size());
        System.out.println(coleccionClientes.isEmpty());


        Cliente c2 = new Cliente("47838723C", "Álvaro", "17/12/2006");
        System.out.println(coleccionClientes.contains(c2));

        coleccionClientes.clear();

        System.out.println(coleccionClientes.size());
        System.out.println(coleccionClientes.isEmpty());

        coleccionClientes.add(c1);
        coleccionClientes.add(c2);

        for (Cliente coleccionCliente : coleccionClientes) {
            if (coleccionCliente.getDni().equalsIgnoreCase("46074547G")) coleccionClientes.remove(coleccionCliente);
            System.out.println(coleccionCliente);
        }
        System.out.println(coleccionClientes);
    }
}
