package Unidad10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        String filePath = "src/main/java/Unidad10/archivos/NumerosReales.txt";
        int i = 0;
        int[] enteros = new int[0];
        String linea;
        try(BufferedReader r = new BufferedReader(new FileReader(filePath))) {
            while ((linea=r.readLine()) != null) {
                enteros = Arrays.copyOf(enteros, enteros.length+1);
                enteros[i] = Integer.parseInt(linea);
                i++;
            }
        } catch (IOException e) {System.out.println("No se ha podido leer el archivo.");}
        System.out.println("Array: " + Arrays.toString(enteros));
        mostrarMenu();
        System.out.println("Array ordenado de manera ascendente: " + Arrays.toString(ordenarArray(enteros)));
        System.out.println("La cantidad de los números es: " + (enteros.length));
        System.out.println("La suma de todos los números es: " + sumaEnteros(enteros));
        System.out.println("La media aritmética de los números es " + mediaEnteros(enteros));
    }
    static double mediaEnteros(int[] array) {
        double media = 0;
            media = (double) sumaEnteros(array) / (array.length);
        return media;
    }
    static int sumaEnteros(int[] array) {
        int suma = 0;
        for (int j : array) {
            suma += j;
        }
        return suma;
    }
    static int[] ordenarArray(int[] array) {
        Arrays.sort(array);
        return array;
    }
    static void mostrarMenu() {
        System.out.println("Devolver array ordenado de manera ascendente.");
        System.out.println("Cantidad de números.");
        System.out.println("Suma de los números.");
        System.out.println("Media aritmética de todos los números");
    }
}
