package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicioClase3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] numeros = new float[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=sc.nextFloat();
        }
        for (int i = numeros.length - 1; i>= 0; i--) {
            System.out.println(numeros[i]);
        }
        /*
        StringBuilder str = new StringBuilder(Arrays.toString(numeros)).reverse();
        System.out.println(str.toString());
        */
    }
}
