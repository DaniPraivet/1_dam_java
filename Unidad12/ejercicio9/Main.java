package Unidad12.ejercicio9;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        System.out.println("Introduce cualquier número, cuando sea número negativo, terminarás la introducción de números.");
        List<Integer> lista = generarlista();
        mostrarLista(lista);

        System.out.println("Ordenamos la lista");
        asignarNuevosValores(lista);
        mostrarLista(lista);
    }
    public static List<Integer> generarlista() {
        List<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            numero = sc.nextInt();
            if (numero >= 0) {
                numeros.add(numero);
            }
        } while (numero >= 0);
        return numeros;
    }

    public static void asignarNuevosValores(List<Integer> argsLista) {
        for (int i = 0; i < argsLista.size(); i++) {
            if (argsLista.get(i) % 2 == 0) {
                System.out.println("Índice " + i + ": " + argsLista.get(i) + " -> " + (argsLista.get(i) * 100));
                argsLista.set(i, argsLista.get(i) * 100);
            }
        }
    }

    public static void mostrarLista(List<Integer> argsLista) {
        System.out.println("\tLista actual: \n\t\t" + argsLista);
        System.out.println("\tTamaño de la lista actualmente: " + argsLista.size() + "\n\n");
    }
}
