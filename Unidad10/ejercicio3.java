package Unidad10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ejercicio3 {
    public static void main(String[] args) {
        /***
         * Crear con un editro el fichero de texto NumerosReales.txt
         * en la carpeta del proyecto y escribir en él una serie de números
         * reales separados por espacios simples.
         *
         * Implementar un programa que acceda a NumerosReales.txt, lea los
         * números y calcule la suma y aritmética, mostrando los resultados por
         * pantalla.
         */

        String filePath = "src/main/java/Unidad10/archivos/NumerosReales.txt";

        try (BufferedReader r = new BufferedReader(new FileReader(filePath))) {
            String linea;
            int resultado = 0;
            int contador = 0;
            while ((linea=r.readLine()) != null) {
                contador++;
                resultado += Integer.parseInt(linea);
            }
            resultado /= contador;

            System.out.println(resultado);
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException e) {
            System.out.println("No se ha podido leer el archivo");
        }


    }
}
