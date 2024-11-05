package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicioClase4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=sc.nextInt();
        }
        for (int i = numeros.length - 1; i>= 0; i--) {
            System.out.println(numeros[i]);
        }
        Arrays.sort(numeros);
        System.out.println("El número mayor es: " + numeros[numeros.length-1]);
    }
}
