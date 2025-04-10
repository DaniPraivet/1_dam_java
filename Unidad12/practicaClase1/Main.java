package Unidad12.practicaClase1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    static List<Cliente> listaClientes = new ArrayList<>();
    static Collection<Cliente> coleccionClientes = listaClientes;

    public static void main(String[] args) {
        Cliente c1 = new Cliente("46074547G","Daniel", "29/03/2006");
        boolean anyadir = coleccionClientes.add(c1);
        String resultado = anyadir ? "Se ha añadido el cliente" : "Error al añadir al cliente";
        System.out.println(resultado);
        System.out.println(coleccionClientes);
    }
}
