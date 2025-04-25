package Unidad12.ejercicio14;

import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sorteo<String> sorteo = new Sorteo<>();

        System.out.println("Introduce elementos (escribe 'fin' para terminar):");
        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fin")) break;

            if (sorteo.add(entrada)) {
                System.out.println("Añadido.");
            } else {
                System.out.println("Ya existe.");
            }
        }

        sorteo.mostrarElementos();

        System.out.print("¿Cuántos premiados quieres? ");
        int numPremiados = scanner.nextInt();

        Set<String> ganadores = sorteo.premiados(numPremiados);
        System.out.println("Ganadores: " + ganadores);
    }
}
