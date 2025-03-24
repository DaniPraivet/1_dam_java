package Unidad10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        String filePath = "src/main/java/Unidad10/archivos/Frase.txt";
        Scanner sc = new Scanner(System.in);
        String texto = "";

        System.out.println("¿Qué quieres escribir?");


        while (true) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
                texto = sc.nextLine();
                if (!texto.equalsIgnoreCase("salir")) {
                    bw.newLine();
                    bw.write(texto);
                } else {
                    break;
                }
            } catch (IOException e) {
                System.out.println("No se ha podido escribir el archivo.");
            }
        }
    }
}
