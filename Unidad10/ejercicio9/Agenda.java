package Unidad10.ejercicio9;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Agenda {
    private static final int MAX_CONTACTOS = 20;
    private static final String FILE_PATH = "Unidad10/ejercicio9/agenda.txt";
    private Contacto[] contactos = new Contacto[MAX_CONTACTOS];
    private int totalContactos = 0;

    public Agenda() {
        cargarContactos();
    }

    /**
     * Comprobamos que no hayamos excedido la cantidad de contactos máxima en la agenda,
     * luego le preguntamos al usuario el nombre del nuevo contacto, comprobamos que no
     * se encuentre en ningún contacto de la agenda y luego preguntamos el teléfono, una
     * vez introducido esos datos, creamos un nuevo objeto tipo Contacto.
     * @param sc El scanner para que podamos pedir datos al usuario
     */
    public void nuevoContacto(Scanner sc) {
        if (totalContactos >= MAX_CONTACTOS) {
            System.out.println("La agenda está llena.");
            return;
        }

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        for (int i = 0; i < totalContactos; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El contacto ya existe.");
                return;
            }
        }

        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();

        contactos[totalContactos++] = new Contacto(nombre, telefono);
        System.out.println("Contacto agregado.");
    }

    /**
     * Le pedimos el nombre que queremos buscar al usuario, luego buscamos al usuario
     * obteniendo el nombre de un contacto, sin importar que sea mayúscula o minúscula
     * y que contenga lo que hemos buscado.
     * @param sc El scanner para que podamos pedir datos al usuario
     */
    public void buscarContacto(Scanner sc) {
        System.out.print("Buscar: ");
        String busqueda = sc.nextLine().toLowerCase();
        boolean encontrado = false;

        for (int i = 0; i < totalContactos; i++) {
            if (contactos[i].getNombre().toLowerCase().contains(busqueda)) {
                System.out.println(contactos[i]);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron contactos.");
        }
    }

    /**
     * Mostrar los contactos, ordenándolos por su nombre y luego los mostramos.
     */
    public void mostrarContactos() {
        if (totalContactos == 0) {
            System.out.println("No hay contactos en la agenda.");
            return;
        }

        Arrays.sort(contactos, 0, totalContactos, (c1, c2) -> c1.getNombre().compareToIgnoreCase(c2.getNombre()));

        for (int i = 0; i < totalContactos; i++) {
            System.out.println(contactos[i]);
        }
    }

    /**
     * Antes de salir del código debemos de guardar los contactos bajo cierta sintaxis
     * en este caso se separan por "," y por líneas distintas
     */
    public void guardarContactos() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (int i = 0; i < totalContactos; i++) {
                bw.write(contactos[i].getNombre() + "," + contactos[i].getTelefono());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar la agenda.");
        }
    }

    /**
     * Al iniciar el programa, debemos cargar los contactos si teníamos anteriormente algún contacto
     * para cargarlos, obtenemos los datos que están separados por ",", una vez hemos leído esos datos
     * leemos la siguiente línea
     */
    private void cargarContactos() {
        File archivo = new File(FILE_PATH);
        if (!archivo.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null && totalContactos < MAX_CONTACTOS) {
                String[] datos = linea.split(",");
                if (datos.length == 2) {
                    contactos[totalContactos++] = new Contacto(datos[0], datos[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar la agenda.");
        }
    }
}