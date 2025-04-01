package Unidad10.examen;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Biblioteca {
    private static final String FILE_PATH = "src/examen/biblioteca.txt";
    Libro[] libros = new Libro[0];
    int totalLibros = 0;

    public Biblioteca() {
        cargarLibros();
    }

    public void agregarLibro(Libro l) {
        boolean duplicado = false;
        for (int i = 0; i < totalLibros; i++) {
            if (l.equals(libros[i])) {
                duplicado = true;
                System.out.println("Libro duplicado.");
                break;
            }
        }
        if (!duplicado) {
            libros = Arrays.copyOf(libros, libros.length+1);
            libros[totalLibros++] = l;
            System.out.println("Libro agregado.");
        }
    }

    public void buscarTitulo(String busqueda) {
        boolean encontrado = false;

        for (int i = 0; i < totalLibros; i++) {
            if (libros[i].getTitulo().toLowerCase().contains(busqueda)) {
                System.out.println(libros[i]);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron libros con ese título.");
        }
    }

    public void buscarAutor(String busqueda) {
        boolean encontrado = false;

        for (int i = 0; i < totalLibros; i++) {
            if (libros[i].getAutor().toLowerCase().contains(busqueda)) {
                System.out.println(libros[i]);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron libros con ese autor.");
        }
    }

    public void cargarLibros() {
        File archivo = new File(FILE_PATH);
        if (!archivo.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                int anyo = Integer.parseInt(datos[2]);
                libros = Arrays.copyOf(libros, libros.length+1);
                libros[totalLibros++] = new Libro(datos[0], datos[1], anyo, datos[3]);

            }
        } catch (IOException e) {
            System.out.println("Error al cargar el archivo.");
        }
    }

    public void guardarLibros() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (int i = 0; i < totalLibros; i++) {
                bw.write(libros[i].getTitulo() + "," + libros[i].getAutor()
                        + "," + libros[i].getAnyoPublicacion() + "," + libros[i].getEditorial());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo.");
        }
    }

    @Override
    public String toString() {
        String str = "Biblioteca{" + "\n libros=\n";
        Arrays.sort(libros, 0, totalLibros, (l1, l2) -> l1.getTitulo().compareToIgnoreCase(l2.getTitulo()));
        for (int i = 0; i < totalLibros; i++) {
            str += "\t"+libros[i].toString()+"\n";
        }
        return str + "\n}";
    }
}
