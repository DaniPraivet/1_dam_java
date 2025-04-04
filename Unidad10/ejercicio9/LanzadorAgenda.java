package Unidad10.ejercicio9;

import java.util.Scanner;

public class LanzadorAgenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion;

        do {
            System.out.println("\nAGENDA");
            System.out.println("1. Nuevo contacto");
            System.out.println("2. Buscar por nombre");
            System.out.println("3. Mostrar todos");
            System.out.println("4. Borrar contacto");
            System.out.println("5. Editar contacto");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    agenda.nuevoContacto(sc);
                }
                case 2 -> {
                    agenda.buscarContacto(sc);
                }
                case 3 -> {
                    System.out.println(agenda);
                }

                case 4 -> {
                    agenda.borrarContantos(sc);
                    agenda.guardarContactos();
                }
                case 5 -> {
                    agenda.editarContacto(sc);
                    agenda.guardarContactos();
                }
                case 0 -> {
                    agenda.guardarContactos();
                    System.out.println("Agenda guardada. Saliendo...");
                }
                default -> {
                    System.out.println("Opción no válida.");
                }
            }
        } while (opcion != 0);

        sc.close();
    }
}
