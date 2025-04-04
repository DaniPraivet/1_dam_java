package Unidad11.ejercicio5;

import Unidad10.examen.Libro;

import java.util.Scanner;

public class LanzadorClubDeportivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClubDeportivo c1 = new ClubDeportivo();
        int opcion;

        do {
            System.out.println("\nClub Deportistas");
            System.out.println("1. Alta");
            System.out.println("2. Baja");
            System.out.println("3. Modificar datos");
            System.out.println("4. Listar por orden alfabético por nombres");
            System.out.println("5. Listar por edad");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("DNI: ");
                    String dni = sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Año de nacimiento: ");
                    int anyo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Mes: ");
                    int mes = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Dia: ");
                    int dia = sc.nextInt();
                    sc.nextLine();


                    System.out.print("Editorial: ");
                    int idDeporte = sc.nextInt();
                    Deportista d = new Deportista(dni, nombre, anyo, mes, dia , idDeporte);
                    c1.darAlta(d);

                }
                case 2 -> {
                    System.out.println("Nombre del deportista a eliminar:");
                    String busqueda = sc.nextLine();
                    c1.buscarDeportista(busqueda);
                    System.out.println("Introduce el DNI del deportista para eliminarlo");
                    String dniDeportista = sc.nextLine();
                    c1.darBaja(dniDeportista);

                }
                case 3 -> {
                    System.out.println("Nombre del deportista a modificar:");
                    String busqueda = sc.nextLine();

                }
                case 4 -> {
                    System.out.println(c1.listarAlfNombres());
                }
                case 5 -> {
                    System.out.println(c1.listarEdad());
                }
                case 0 -> {
                    c1.guardarDeportistas();
                    System.out.println("Tabla guardada. Saliendo...");
                }
                default -> {
                    System.out.println("Opción no válida.");
                }
            }
        } while (opcion != 0);

        sc.close();
    }
}
