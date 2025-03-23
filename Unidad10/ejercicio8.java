package Unidad10;
import java.io.*;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filePath = "Unidad10/archivos/";
        String archivoACopiar = "";
        String linea;
        String texto = "";

        System.out.println("¿Introduce el nombre del archivo que quieres copiar?");
        archivoACopiar = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath+archivoACopiar));
             BufferedWriter bw = new BufferedWriter(new FileWriter(filePath+"copia_de_"+archivoACopiar))) {
            while ((linea= br.readLine()) != null) {
                texto += linea + "\n" ;
            }
            System.out.println("Archivo existe, procedemos con la copia");
            bw.write(texto);
        } catch (IOException e) {
            System.out.println("No se ha podido leer el archivo");
        }
    }
}
