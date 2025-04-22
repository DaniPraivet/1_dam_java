package Unidad12.ejercicio9;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        System.out.println("Generar números 20 números aleatorios.");
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
        } while (numero < 0);
        return numeros;
    }

    public static void asignarNuevosValores(List<Integer> argsLista) {
        Iterator<Integer> iterador = argsLista.iterator();

        while (iterador.hasNext()) {
            if (iterador.next() % 2 == 0) {
                argsLista.get(iterador.next());
            }
        }
    }

    public static void mostrarLista(List<Integer> argsLista) {
        System.out.println("\tLista actual: \n\t\t" + argsLista);
        System.out.println("\tTamaño de la lista actualmente: " + argsLista.size() + "\n\n");
    }
}
