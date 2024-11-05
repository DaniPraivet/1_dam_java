package Unidad3;

import java.util.Scanner;

public class ejercicioForAnidado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantás filas quieres hacer?");
        int row = 4;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println();
            }

        }
    }
}
