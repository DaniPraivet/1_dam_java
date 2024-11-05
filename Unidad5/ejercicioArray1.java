package Unidad5;

import java.util.Arrays;

public class ejercicioArray1 {
    public static void main(String[] args) {

        int[] numeros = {1, 3, 5, 7, 9};

        // Se puede hacer también así
        /*
        int[] edades = new int[27]
        Para poder meter datos sería así
        edades[0] = 18;
         */
        System.out.println(Arrays.toString(numeros));

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El numero en la posicion " + i + " es " + numeros[i]);
        }
    }
}