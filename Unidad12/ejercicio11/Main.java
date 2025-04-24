package Unidad12.ejercicio11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();
        lista = generarLista(20,10);
        System.out.println("Lista original");
        mostrarLista(lista);

        Set<Integer> sinRepetir = new TreeSet<>(lista);
        System.out.println("Lista sin repetir");
        mostrarLista(sinRepetir);

        HashSet<Integer> repetidos = new HashSet<>();
        for (Integer num : lista) {
            if (!sinRepetir.add(num)) {
                repetidos.add(num);
            }
        }
        System.out.println("Lista repetidos");
        mostrarLista(repetidos);

        HashSet<Integer> elementosUnicos = new HashSet<>(lista);
        repetidos.removeAll(sinRepetir);

        System.out.println("Lista unicos");
        mostrarLista(elementosUnicos);


    }
    public static Collection<Integer> generarLista(int cantidad, int limite) {
        Collection<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            numeros.add((int) (Math.random() * limite) + 1);
        }
        return numeros;
    }

    public static void mostrarLista(Collection<Integer> argsLista) {
        System.out.println("\tLista actual: \n\t\t" + argsLista);
        System.out.println("\tTamaño de la lista actualmente: " + argsLista.size() + "\n\n");
    }
}
