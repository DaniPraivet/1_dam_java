package Unidad5;

import java.util.Arrays;

public class actividadProfesora2 {
    public static void main(String[] args) {

    /*static float media (int[] numeros) {
        float suma=0;
        for (int i=0; i < numeros.length;i++) {
            suma += numeros[i];
        }
        float media = suma/numeros.length;
        return media;
    }*/

        float[] sueldos = {1300, 2000, 4000};
        System.out.println(Arrays.toString(sueldos));
        for (int i = 0; i < sueldos.length; i++) {
            sueldos[i] += 0.1 * sueldos[i];
        }
        System.out.println(Arrays.toString(sueldos));

        // Otra manera de hacer esto sería así
        for (double sueldo : sueldos) {
            sueldo += 0.1 * sueldo;
            System.out.println(sueldo + ", ");
        }
    }
}
