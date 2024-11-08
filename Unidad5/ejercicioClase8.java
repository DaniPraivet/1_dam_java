package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicioClase8 {
    public static void main(String[] args) {

        /*
        Leer y almacenar n números enteros en un array, a partir de
        la cual se construirán otras dos arrays con los elementos
        con valores pares e impares de la primera, respectivamente.

        Las arrays pares e impares deben mostrarse ordenadas.
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] numeros = new int [n];
        int[] impares = new int [n];
        int[] pares = new int [n];
        int posPares = 0;
        int posImpares = 0;

        // Construyo el primer array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = ((int) (Math.random() * 10)) + 1;
            if ( numeros[i] % 2 == 0 ) {
                pares[posPares] = numeros[i];
                posPares++;
            }
            else {
                impares[posImpares] = numeros[i];
                posImpares++;
            }
        }

        Arrays.sort(pares);
        Arrays.sort(impares);
        int posNewPares = 0;
        int posNewImpares = 0;
        int[] newPares = new int[pares.length]; // Hago un array para que copie todos los valores menos los que sean 0
        for (int i = pares.length-1; i < 0; i--) {
            if (pares[i] != 0) {
                newPares[posNewPares] = pares[i];
                posNewPares++;
            }
        }
        int[] newImpares = new int[impares.length]; // Hago un array para que copie todos los valores menos los que sean 0
        for (int i = impares.length-1; i < 0; i--) {
            if (impares[i] != 0) {
                newImpares[posNewImpares] = impares[i];
            }
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(impares));
    }
}
