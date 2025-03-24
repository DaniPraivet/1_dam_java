package Unidad10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejercicioClase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filePath = "Unidad10/archivos/";
        String archivo1 = "archivo1.txt";
        String archivo2 = "archivo2.txt";
        String texto = "";
        String linea = "";
        boolean vacio1 = false, vacio2 = false;

        System.out.println("1. Opción Continua");
        continua(filePath, archivo1, archivo2, linea, texto);
        System.out.println("2. Opción Alterna");
        alterna(filePath, archivo1, archivo2, linea, texto, vacio1, vacio2);
    }

    public static void alterna(String filePath, String archivo1, String archivo2, String linea, String texto, boolean vacio1, boolean vacio2) {
        try (BufferedReader in1 = new BufferedReader(new FileReader(filePath+archivo1));
             BufferedReader in2 = new BufferedReader(new FileReader(filePath+archivo2))) {
            while (true) {
                if ((linea = in1.readLine()) != null) {
                    texto += linea + "\n";
                } else vacio1 = true;
                if ((linea = in2.readLine()) != null) {
                    texto += linea + "\n";
                } else vacio2 = true;
                if (vacio1 && vacio2) {
                    System.out.println(texto);
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public static void continua(String filePath, String archivo1, String archivo2, String linea, String texto) {
        try (BufferedReader in1 = new BufferedReader(new FileReader(filePath+archivo1));
             BufferedReader in2 = new BufferedReader(new FileReader(filePath+archivo2))) {
            while ((linea = in1.readLine()) != null) {
                texto += linea + "\n";
            }
            while ((linea = in2.readLine()) != null) {
                texto += linea + "\n";
            }
            System.out.println(texto);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
