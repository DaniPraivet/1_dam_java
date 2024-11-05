package Unidad5;

import java.util.Arrays;

public class ejercicioClase1o {
    public static void main(String[] args) {
        int[] impares = new int [10];
        int imparInicial = 1;

        for (int i = 0; i < impares.length; i++) {
            impares[i] = imparInicial;
            imparInicial = imparInicial + 2;
            System.out.println(Arrays.toString(impares));
        }
    }
}
