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
     *
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
     *
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
     * Le pedimos al usuario buscar sobre los contactos actuales, le mostramos los resultados
     * para que conozca el nombre exacto a introducir para luego eliminarlo, es decir
     * sobreescribir los datos de la agenda.
     *
     * @param sc El scanner para que podamos pedir datos al usuario
     */
    public void borrarContantos(Scanner sc) {
        System.out.print("Buscar contacto a eliminar: ");
        String busqueda = sc.nextLine().toLowerCase();
        String[] grupoEncontrados = new String[this.totalContactos];
        String contactoAEliminar;
        int encontrados = 0;
        for (int i = 0; i < this.totalContactos; i++) {
            if (this.contactos[i].getNombre().toLowerCase().contains(busqueda)) {
                grupoEncontrados[encontrados++] = this.contactos[i].getNombre();
            }
        }
        if (encontrados == 0) {
            System.out.println("No se han encontrado contactos.");
            return;
        } else {
            System.out.println("Se han encontrado " + encontrados + " resultados:");
            for (String encontrado : grupoEncontrados) {
                if (encontrado != null) {
                    System.out.println(encontrado);
                }
            }
        }
        System.out.println("Indica el nombre del contacto que quieres eliminar");
        contactoAEliminar = sc.nextLine();

        // Sobreescribimos el archivo

        try (BufferedWriter out = new BufferedWriter(new FileWriter(FILE_PATH))) {

            for (int i = 0; i < totalContactos; i++) {
                if (!contactos[i].getNombre().equalsIgnoreCase(contactoAEliminar)) {
                    out.write(contactos[i].getNombre() + "," + contactos[i].getTelefono());
                    out.newLine();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *
     * @param sc
     */
    public void editarContacto(Scanner sc) {
        System.out.print("Buscar contacto a editar: ");
        String busqueda = sc.nextLine().toLowerCase();
        Contacto[] grupoEncontrados = new Contacto[this.totalContactos];
        int encontrados = 0;

        for (int i = 0; i < this.totalContactos; i++) {
            if (this.contactos[i].getNombre().toLowerCase().contains(busqueda)) {
                grupoEncontrados[encontrados++] = this.contactos[i];
            }
        }

        if (encontrados == 0) {
            System.out.println("No se han encontrado contactos.");
            return;
        }

        System.out.println("Se han encontrado " + encontrados + " resultados:");
        for (int i = 0; i < encontrados; i++) {
            System.out.println((i + 1) + ". " + grupoEncontrados[i]);
        }

        System.out.print("Selecciona el número del contacto que deseas editar: ");
        int seleccion;
        try {
            seleccion = Integer.parseInt(sc.nextLine()) - 1;
            if (seleccion < 0 || seleccion >= encontrados) {
                System.out.println("Selección no válida.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida.");
            return;
        }

        Contacto contactoAEditar = grupoEncontrados[seleccion];

        System.out.println("¿Qué deseas editar?");
        System.out.println("1. Nombre");
        System.out.println("2. Teléfono");
        System.out.print("Opción: ");
        String opcion = sc.nextLine();

        switch (opcion) {
            case "1":
                System.out.print("Nuevo nombre: ");
                contactoAEditar.setNombre(sc.nextLine());
                break;
            case "2":
                System.out.print("Nuevo teléfono: ");
                contactoAEditar.setTelefono(sc.nextLine());
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        guardarContactos();
        System.out.println("Contacto actualizado correctamente.");
    }


    /**
     * Al iniciar el programa, debemos cargar los contactos si teníamos anteriormente algún contacto
     * para cargarlos, obtenemos los datos que están separados por ",", una vez hemos leído esos datos
     * leemos la siguiente línea
     */
    public void cargarContactos() {
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
