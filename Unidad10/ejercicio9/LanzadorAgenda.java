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
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    agenda.nuevoContacto(sc);
                    break;
                case 2:
                    agenda.buscarContacto(sc);
                    break;
                case 3:
                    agenda.mostrarContactos();
                    break;
                case 4:
                    agenda.guardarContactos();
                    System.out.println("Agenda guardada. Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
