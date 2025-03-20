package Unidad10;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class ejercicio5 {

            public static void main(String[] args) {
                String filePath = "src/main/java/Unidad10/archivos/NumerosReales.txt";
                double suma = 0;

                try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                    String linea;
                    while ((linea = br.readLine()) != null) {
                        Scanner sc = new Scanner(linea);
                        if (sc.hasNextDouble()) {
                            double numero = sc.nextDouble();
                            suma += numero;
                        }
                        sc.close();
                    }
                } catch (IOException e) {
                    System.err.println("Error al leer el archivo: " + e.getMessage());
                }

                System.out.println("La suma de todos los números es: " + suma);
            }
        }
