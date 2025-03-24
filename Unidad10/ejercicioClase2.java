package Unidad10;

import java.io.File;

public class ejercicioClase2 {
    public static void main(String[] args) {
        File carpeta = new File("Unidad10");

        File[] listaDeArchivos = carpeta.listFiles();
        if (listaDeArchivos != null) {
            if (listaDeArchivos.length > 1) {
                for (File listaDeArchivo : listaDeArchivos) {
                    System.out.println(listaDeArchivo.getName());
                }
            } else {
                System.out.println("Carpeta vacía.");
            }
        } else {
            System.out.println("No se ha encontrado la carpeta.");
        }

    }
}
