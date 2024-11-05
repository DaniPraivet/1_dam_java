package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicioClase6 {
    public static void main(String[] args) {
        /*
        Describir una función que tome como parámetros dos
        arrays, la primera con 6 números de una apuesta de la
        primitiva, y la segunda(ordenada) con los 6 números de la
        combinación ganadora.

        La función devolverá el número de aciertos.
        */

        Scanner sc = new Scanner(System.in);

        int[] apuesta = new int[6];
        int[] ganadora = new int[6];

        System.out.println("Introduce tu apuesta (Números del 1-10)");

        for (int i = 0; i < apuesta.length ; i++) {
            apuesta[i] = sc.nextInt();
        }
        System.out.println("Generando numeros ganadores ...");
        for (int i = 0; i < ganadora.length ; i++) {
            ganadora[i] = (int) (Math.random() * 100 + 1);
        }
        Arrays.sort(ganadora);

        System.out.println("El número de aciertos es: " + averiguaAciertos(apuesta, ganadora));
        System.out.println("La combinación ganadora es: " + Arrays.toString(ganadora));
    }
    public static int averiguaAciertos(int[] apuesta, int[] ganadora) {
        int aciertos = 0;
        for (int i = 0; i < apuesta.length; i++) {
            if (Arrays.binarySearch(ganadora, apuesta[i]) >= 0) {
                aciertos++;
            }
        }
        return aciertos;
    }
}
