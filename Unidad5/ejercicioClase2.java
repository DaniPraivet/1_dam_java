package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicioClase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué longitud quieres que sea el array?");
        int n = sc.nextInt();
        float[] numeros = new float[n];

        float sumaPositivos = 0;
        int contadorPositivos = 0;
        float sumaNegativos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Introduce el valor para la posición " + (i));
            numeros[i] = sc.nextFloat();
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                contadorPositivos++;
            }
            else if (numeros [i] < 0) {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            }
            else {
                contadorCeros++;
            }
        }
        float mediaPositivos = sumaPositivos / contadorPositivos;
        float mediaNegativos = sumaNegativos / contadorNegativos;

        System.out.println(Arrays.toString(numeros));

        System.out.println("La media de los números positivos es : " + mediaPositivos);
        System.out.println("La media de los números negativos es : " + mediaNegativos);
        System.out.println("El conteo total de ceros es : " + contadorCeros);


    }
}
