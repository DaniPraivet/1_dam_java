package Unidad12.ejercicio12;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> conjuntoA = Set.of(1, 2, 3, 4, 5);
        Set<Integer> conjuntoB = Set.of(4, 5, 6, 7, 8);

        Set<Integer> union = union(conjuntoA, conjuntoB);
        Set<Integer> interseccion = interseccion(conjuntoA, conjuntoB);

        System.out.println("Conjunto A: " + conjuntoA);
        System.out.println("Conjunto B: " + conjuntoB);
        System.out.println("Unión: " + union);
        System.out.println("Intersección: " + interseccion);
    }
    public static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> resultado = new HashSet<>(conjunto1);
        resultado.addAll(conjunto2);
        return resultado;
    }


    public static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> resultado = new HashSet<>(conjunto1);
        resultado.retainAll(conjunto2);
        return resultado;
    }
}
