package Unidad3;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("¿Cuantás filas quieres hacer?");
        int i, j, k, row;
        row = sc.nextInt();


        for (i = 1; i < row + (row / 2); i++) {
            for (j = row + (row / 2); j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
