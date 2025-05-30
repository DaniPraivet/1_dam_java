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
                case 4 -> {
                    System.out.println("Dime que número quieres añadir y dime también en qué posición lo quieres añadir");
                    int n = sc.nextInt();
                    int p = sc.nextInt();
                    lista.insertarNumeroParametro(n,p);
                }
                case 5 -> {
                    System.out.println("Debes crear una lista para insertarla, ¿quieres crear una?(S/N)");
                    String respuesta = sc.nextLine();
                    sc.next();
                    if (respuesta.equalsIgnoreCase("s")) {
                        System.out.println("¿Cuál es la longitud de dicho array?");
                        int lonArr = sc.nextInt();
                        int[] array = new int[lonArr];
                        System.out.println("Vamos a rellenar ese array: ");
                        for (int i = 0; i < array.length; i++) {
                            System.out.println("Para la posición " + i + "del array");
                            array[i] = sc.nextInt();
                        }
                        Lista listaParaAgregar = new Lista(array);
                        lista.insertarListaFinal(listaParaAgregar);
                    } else {
                        Lista listaParaAgregar = new Lista(new int[]{1,2,3,4,5,6,7});
                        lista.insertarListaFinal(listaParaAgregar);
                    }
                }
                case 6 -> {
                    System.out.println("¿Qué posición deseas eliminar un elemento?");
                    int posEliminarElemento = sc.nextInt();
                    lista.eliminarElementoParametro(posEliminarElemento);
                }
                case 7 -> {
                    System.out.println("¿Qué posición deseas saber el número?");
                    int posSaberElemento = sc.nextInt();
                    lista.obtenerElementoParametro(posSaberElemento);
                }
                case 8 -> {
                    System.out.println("¿Qué posición deseas buscar un elemento?");
                    int posBuscarElemento = sc.nextInt();
                    lista.buscarElementoParametro(posBuscarElemento);
                }
                case 9 -> {
                    System.out.println("Los elementos de la lista son ");
                    lista.mostrarElementos();
                }
                case 0 -> System.out.println("Saliendo del programa. Nos vemos o/");
                default -> throw new IllegalStateException("Valor no identificado: " + opcion);

            }
        }
    }
}
