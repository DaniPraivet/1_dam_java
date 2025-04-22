package Unidad12.ejercicio8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Generar números 20 números aleatorios.");
        Collection<Integer> lista = generarlista(20, 100);
        mostrarLista(lista);

        System.out.println("Ordenamos la lista (Descendente)");
        ordenarListaUsandolaComoArray(lista,false);
        mostrarLista(lista);

        System.out.println("Ordenamos la lista (Ascendente)");
        ordenarListaUsandolaComoArray(lista, true);
        mostrarLista(lista);
    }
    public static Collection<Integer> generarlista(int cantidad, int limite) {
        Collection<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            numeros.add((int) (Math.random() * limite) + 1);
        }
        return numeros;
    }

    public static void ordenarListaUsandolaComoArray(Collection<Integer> argsLista, boolean ordenarAscendente) {
        Integer[] array = argsLista.toArray(new Integer[0]);

        if (!ordenarAscendente) {
            Arrays.sort(array, Collections.reverseOrder());
            // Arrays.sort(array, (n1, n2) -> n1.compareTo(n2));
            // Arrays.sort(array, Integer::compareTo);
        } else {
            Arrays.sort(array);
        }

        argsLista.clear();
        argsLista.addAll(Arrays.asList(array));
    }

    public static void mostrarLista(Collection<Integer> argsLista) {
        System.out.println("\tLista actual: \n\t\t" + argsLista);
        System.out.println("\tTamaño de la lista actualmente: " + argsLista.size() + "\n\n");
    }

}
