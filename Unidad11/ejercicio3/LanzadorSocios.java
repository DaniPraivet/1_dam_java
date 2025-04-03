package Unidad11.ejercicio3;

import java.util.Scanner;

public class LanzadorSocios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tabla tabla = new Tabla();
        int opcion;

        do {
            System.out.println("\nTabla");
            System.out.println("1. Nuevo socio");
            System.out.println("2. WIP");
            System.out.println("3. Mostrar todos");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    tabla.nuevoSocio(sc);
                }
                case 2 -> {
                    System.out.println("WIP");
                }
                case 3 -> {
                    System.out.println(tabla);
                }
                case 0 -> {
                    tabla.guardarSocios();
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
