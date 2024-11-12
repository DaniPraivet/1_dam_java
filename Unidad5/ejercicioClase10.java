package Unidad5;

        /*
        El número de la suerte de una persona puede calcularse a partir de sus
        números favoritos.

        De entre estos, se seleccionan dos diferentes al azar, que se eliminan de la
        lista, pero en su lugar, se añade la media aritmética de los dos elementos a la
        lista de números favoritos.

        Este proceso se repite hasta que sólo quede un número.

        Para calcular bien el número de la suerte es imprescindible que la lista se
        encuentre siempre ordenada.

        Escribe una aplicación que solicite al usuario sus números favoritos y calcule
        su número de la suerte.
        */

import java.util.Arrays;
import java.util.Scanner;

public class ejercicioClase10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la longitud del array de selección.");
        final int longitudArray = sc.nextInt();
        int[] numeros = new int[longitudArray];
        int posicion1, posicion2 = 0;
        int media = 0;
        // Generamos los valores del array numeros
        for (int i = 0; i < longitudArray; i++) {
            numeros[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(Arrays.toString(numeros));
        while (numeros.length > 1) {
            // Generamos la posición al azar y hacemos la media
            for (int i = 0; i < 2; i++) {
                posicion1 = (int) (Math.random() * numeros.length);
                posicion2 = (int) (Math.random() * numeros.length);
                if (posicion1 != posicion2) {
                    media = (int) (numeros[posicion1] + numeros[posicion2]) / 2;
                    media = numeros[posicion1];
                    numeros[posicion2] = 0;
                    Arrays.sort(numeros);
                    numeros = Arrays.copyOfRange(numeros, 1, numeros.length); // Copiar el segundo indice del array hasta el último
                    System.out.println(Arrays.toString(numeros));
                }

            }
        }






    }

}
