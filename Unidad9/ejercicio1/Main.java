package Unidad9.ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 1;
        Lista lista = new Lista();
        while (opcion != 0) {
            System.out.println("Titulo menu");
            System.out.println("\t1. Obtener número de elementos.");
            System.out.println("\t2. Insertar número al final de la lista.");
            System.out.println("\t3. Insertar número al principio de la lista.");
            System.out.println("\t4. Insertar número en posición personalizada.");
            System.out.println("\t5. Añadir al final de la lista otra lista nueva.");
            System.out.println("\t6. Eliminar elemento en posición personalizada.");
            System.out.println("\t7. Obtener número en posición personalizada.");
            System.out.println("\t8. Buscar número en la lista en posición personalizada.");
            System.out.println("\t9. Mostrar elementos por consola.");
            System.out.println("\t0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println(lista.obtenerNumerosElementos());
                }
                case 2 -> {
                    System.out.println("Dime que número quieres insertar al final de la lista");
                    int n = sc.nextInt();
                    lista.insertarNumeroFinal(n);
                }
                case 3 -> {
                    System.out.println("Dime que número quieres insertar al principio de la lista");
                    int n = sc.nextInt();
                    lista.insertarNumeroPrincipio(n);
                }
                case 4 -> {}
                case 5 -> {}
                case 6 -> {}
                case 7 -> {}
                case 8 -> {}
                case 9 -> {}
                case 0 -> System.out.println("Saliendo del programa. Nos vemos o/");
                default -> throw new IllegalStateException("Valor no identificado: " + opcion);

            }
        }
    }
}
