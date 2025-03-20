package Unidad10.pruebaArchivo;
import java.io.*;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) throws InterruptedException {
        String filePath = "prueba.txt";

        Scanner sc = new Scanner(System.in);
        int opcion = 1;
        String texto;
        String linea;
        while (opcion != 0) {
            System.out.println("Titulo menu");
            System.out.println("\t1. Escribir archivo de texto");
            System.out.println("\t2. Leer archivo de texto");
            System.out.println("\t0. Salir");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("¿Qué quieres escribir?");
                texto = sc.nextLine();

                try(FileWriter w = new FileWriter(filePath)) {
                    w.write(texto);
                } catch (IOException e) {
                    System.out.println("No se ha podido escribir el archivo.");
                }
            }
            if (opcion == 2) {
                try(BufferedReader r = new BufferedReader(new FileReader(filePath))) {
                    while ((linea=r.readLine()) != null) {
                        System.out.println(linea);
                    }
                } catch (IOException e) {System.out.println("No se ha podido leer el archivo.");}
            }
        }
        sc.close();
    }
}
