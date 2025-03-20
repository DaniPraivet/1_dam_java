package Unidad10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ejercicio2 {
    public static void main(String[] args) {
        String filePath = "src/main/java/Unidad10/ejercicio1.java";
        String linea;

        try(BufferedReader r = new BufferedReader(new FileReader(filePath))) {
            while ((linea=r.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {System.out.println("No se ha podido leer el archivo.");}
    }
}
