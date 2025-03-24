package Unidad10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejercicioOtro {
    public static void main(String[] args) {
        String filePath = "src/main/java/Unidad10/archivos/Otro.txt";
        double suma = 0;
        String texto = "";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Scanner sc = new Scanner(linea);
                if (sc.hasNext()) {
                    String textoLinea = sc.nextLine();
                    texto += textoLinea;
                }
                sc.close();
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archio");
        }

        System.out.println(texto);
    }
}
