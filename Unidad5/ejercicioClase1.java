package Unidad5;

import java.util.Arrays;

public class ejercicioClase1 {
    public static void main (String[] args) {
        double[] numeros = new double[50];
        double media = mediaAleatorios(numeros);

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (Math.random() * 100 + 1);
        }
        /*                           ||
         Otra manera puede ser esta  V
        *int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }*/


        System.out.println(Arrays.toString(numeros));
        System.out.println("La suma total = " + sumarAleatorios(numeros));
        System.out.println("La media es de = " + media);

    }

    static double sumarAleatorios (double[] aleatorios) {
        double suma = 0;
        for (double numero : aleatorios ) {
            suma += numero;
        }
        return suma;
    }

    static double mediaAleatorios (double[] aleatorios) {
        double media = sumarAleatorios(aleatorios) / aleatorios.length;
        return media;
    }
}

