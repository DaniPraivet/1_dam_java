package Unidad10.examen;

import Unidad11.ejercicio3.Tabla;

import java.util.Scanner;

public class LanzadoBiblioTeca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcion;
        String busqueda;

        do {
            System.out.println("\nBiblioteca");
            System.out.println("1. Nuevo libro");
            System.out.println("2. Buscar libro por título");
            System.out.println("3. Buscar libro por autor");
            System.out.println("4. Mostrar todos los libros");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();

                    System.out.print("Autor: ");
                    String autor = sc.nextLine();

                    System.out.print("Año de publicación: ");
                    int anyoPublicacion = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Editorial: ");
                    String editorial = sc.nextLine();
                    Libro l = new Libro(titulo, autor, anyoPublicacion, editorial);
                    biblioteca.agregarLibro(l);
                }
                case 2 -> {
                    System.out.print("Buscar: ");
                    busqueda = sc.nextLine().toLowerCase();
                    biblioteca.buscarTitulo(busqueda);
                }
                case 3 -> {
                    System.out.print("Buscar: ");
                    busqueda = sc.nextLine().toLowerCase();
                    biblioteca.buscarAutor(busqueda);
                }
                case 4 -> {
                    System.out.println(biblioteca);
                }
                case 0 -> {
                    biblioteca.guardarLibros();
                    System.out.println("Archivo guardado. Saliendo...");
                }
                default -> {
                    System.out.println("Opción no válida.");
                }
            }
        } while (opcion != 0);

        sc.close();
    }
}
