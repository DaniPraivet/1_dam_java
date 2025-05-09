package Unidad12.ejercicio16;

import java.io.*;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static final String NOMBRE_FICHERO = "./Unidad12/ejercicio16/productos.dat";
    static Map<String, String> productos = new HashMap<>();

    public static void main(String[] args) {
        cargarDesdeFichero();

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Dar de alta producto");
            System.out.println("2. Dar de baja producto");
            System.out.println("3. Actualizar stock");
            System.out.println("4. Listar productos");
            System.out.println("5. Salir y guardar");

            System.out.print("Elige una opción: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1" -> darDeAlta();
                case "2" -> darDeBaja();
                case "3" -> actualizarStock();
                case "4" -> listarProductos();
                case "5" -> {
                    guardarEnFichero();
                    salir = true;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }

    private static void darDeAlta() {
        System.out.print("Introduce código del producto: ");
        String codigo = sc.nextLine();

        if (productos.containsKey(codigo)) {
            System.out.println("Ya existe un producto con ese código.");
            return;
        }

        System.out.print("Introduce el nombre del producto: ");
        String nombreProducto = sc.nextLine();

        productos.put(codigo, nombreProducto);
        System.out.println("Producto dado de alta.");

    }

    private static void darDeBaja() {
        System.out.print("Introduce código del producto a eliminar: ");
        String codigo = sc.nextLine();

        if (productos.remove(codigo) != null) {
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void actualizarStock() {
        System.out.print("Introduce código del producto: ");
        String codigo = sc.nextLine();

        if (!productos.containsKey(codigo)) {
            System.out.println("Producto no encontrado.");
            return;
        }

        System.out.print("Introduce nuevo nombre del producto: ");
        try {
            String nombreProducto = sc.nextLine();
            productos.put(codigo, nombreProducto);
            System.out.println("Stock actualizado.");
        } catch (NumberFormatException e) {
            System.out.println("Número inválido.");
        }
    }

    private static void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            System.out.println("\n--- Lista de productos ---");
            productos.forEach((codigo, nombreProducto) ->
                    System.out.println("Código: " + codigo + " - Nombre producto: " + nombreProducto));
        }
    }

    private static void guardarEnFichero() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOMBRE_FICHERO))) {
            oos.writeObject(productos);
            System.out.println("Datos guardados en " + NOMBRE_FICHERO);
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    private static void cargarDesdeFichero() {
        File fichero = new File(NOMBRE_FICHERO);
        if (!fichero.exists()) return;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            productos = (Map<String, String>) ois.readObject();
            System.out.println("Datos cargados correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar datos previos: " + e.getMessage());
        }
    }
}
