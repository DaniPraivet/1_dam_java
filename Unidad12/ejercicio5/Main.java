package Unidad12.ejercicio5;

import Utils.Switch;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        Collection<Integer> coleccionNumeros = listaNumeros;
        Scanner sc = new Scanner(System.in);
        int opcion = 1;
        while (opcion != 0) {
            System.out.println("Lista números");
            System.out.println("\t1. Generar números (repetidos)");
            System.out.println("\t2. Generar números (sin repetir)");
            System.out.println("\t0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    for (int i = 0; i < 20; i++) {
                        coleccionNumeros.add((int) (Math.random() * 100) + 1);
                    }
                    System.out.println(coleccionNumeros);
                }
                case 2 -> {
                    boolean duplicado = false;
                    for (int i = 0; i < 20; i++) {
                        int numero = (int) (Math.random() * 100) + 1;
                        for (Integer n : coleccionNumeros) {
                            duplicado = numero == n;
                            if (!duplicado) {
                                coleccionNumeros.add(numero);
                            }
                        }
                    }
                    System.out.println(coleccionNumeros);
                }
                case 0 -> System.out.println("Saliendo del programa. Nos vemos o/");
                default -> throw new IllegalStateException("Valor no identificado: " + opcion);

            }
        }
    }
}
