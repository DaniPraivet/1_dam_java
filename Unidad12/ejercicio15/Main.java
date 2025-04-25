package Unidad12.ejercicio15;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Registro> registros = new ArrayList<>();

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Nuevo registro");
            System.out.println("2. Listar registros");
            System.out.println("3. Mostrar estadísticas");
            System.out.println("4. Salir");

            System.out.print("Elige una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1" -> nuevoRegistro();
                case "2" -> listarRegistros();
                case "3" -> mostrarEstadisticas();
                case "4" -> {
                    guardarEnFichero();
                    salir = true;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }

    private static void nuevoRegistro() {
        try {
            System.out.print("Introduce temperatura en °C: ");
            double temp = Double.parseDouble(scanner.nextLine());
            registros.add(new Registro(temp));
            System.out.println("Registro añadido correctamente.");
        } catch (NumberFormatException e) {
            System.out.println("Temperatura no válida.");
        }
    }

    private static void listarRegistros() {
        if (registros.isEmpty()) {
            System.out.println("No hay registros.");
        } else {
            System.out.println("\n--- Registros ---");
            registros.forEach(System.out::println);
        }
    }

    private static void mostrarEstadisticas() {
        if (registros.isEmpty()) {
            System.out.println("No hay registros para mostrar estadísticas.");
            return;
        }

        double max = registros.stream().mapToDouble(Registro::getTemperatura).max().orElse(0);
        double min = registros.stream().mapToDouble(Registro::getTemperatura).min().orElse(0);
        double avg = registros.stream().mapToDouble(Registro::getTemperatura).average().orElse(0);

        System.out.printf("Máxima: %.2f °C\n", max);
        System.out.printf("Mínima: %.2f °C\n", min);
        System.out.printf("Promedio: %.2f °C\n", avg);
    }

    private static void guardarEnFichero() {
        if (registros.isEmpty()) {
            System.out.println("No hay datos para guardar.");
            return;
        }

        String fecha = LocalDate.now().format(DateTimeFormatter.ofPattern("ddMMyyyy"));
        String nombreFichero = "registros" + fecha + ".dat";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreFichero))) {
            oos.writeObject(registros);
            System.out.println("Registros guardados en: " + nombreFichero);
        } catch (IOException e) {
            System.out.println("Error al guardar los registros: " + e.getMessage());
        }
    }
}
