package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class actividadCasa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la longitud del array que desees: ");
        int longitud = sc.nextInt();
        System.out.println("¿Dime hasta que número nos detenemos?");
        int fin = sc.nextInt();

        int[] resultado = rellenaPares(longitud, fin);
        System.out.println(Arrays.toString(resultado));
    }
    static int[] rellenaPares(int longitud, int fin) {
        int[] numeros = new int [longitud];

        for (int i = 0; i < numeros.length; i++) {
            int numeroRandom = (int) (Math.random() * (fin/2)); // Que el número al azar sea = fin / 2 porque luego vamos a forzar que sea par
            numeros[i] = numeroRandom * 2; // Forzamos a que el número sea par
        }
        Arrays.sort(numeros);
        return numeros;
    }
}
