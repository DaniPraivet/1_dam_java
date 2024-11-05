package Unidad5;

import java.util.Scanner;

public class actividadProfesora1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++ ) {
            System.out.println("Dime el valor de la posición " + i + " :");
            numeros[i] = sc.nextInt();
        }
    }
}