package Unidad7.ejercicio8;

import java.util.Scanner;

public class GestorTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 1;
        Texto miTexto = new Texto("Esta es mi cadena", 50);
        String textoUsuario = "";
        while (opcion != 0) {
            System.out.println("Titulo menu");
            System.out.println("\t1. Añadir caracter al texto.");
            System.out.println("\t2. Añadir cadena al texto.");
            System.out.println("\t3. Mostrar información del objeto Texto");
            System.out.println("\t0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1 -> {
                    System.out.println("¿Qué caracter quieres añadir a tu cadena?");
                    textoUsuario = String.valueOf(sc.nextLine().charAt(0));
                    System.out.println("¿Quieres añadirlo al principio? (true/false)");
                    boolean principio = sc.nextBoolean();
                    miTexto.anadirTexto(textoUsuario, principio);
                }
                case 2 -> {
                    System.out.println("¿Qué quieres que contenga la cadena que quieres añadir a tu cadena original?");
                    textoUsuario = sc.nextLine();
                    System.out.println("¿Quieres añadirlo al principio? (true/false)");
                    boolean principio = sc.nextBoolean();
                    miTexto.anadirTexto(textoUsuario, principio);
                }
                case 3 -> {
                    System.out.println(miTexto.toString());;
                }
                case 0 -> System.out.println("Saliendo del programa. Nos vemos o/");
                default -> throw new IllegalStateException("Valor no identificado: " + opcion);

            }
        }
    }
}
