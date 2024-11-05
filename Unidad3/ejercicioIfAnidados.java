package Unidad3;

import java.util.Scanner;

public class ejercicioIfAnidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while (n != 0) {
            System.out.println("Ingresa tu número: ");
            n = sc.nextInt();
            double nSquare = Math.pow(n, 2);
            if (n == 0) {}
            else {
                if (n % 2 == 0) {
                    System.out.println("El número " + n + "es par");
                } else {
                    System.out.println("El número " + n + "es impar");
                }
                if (n > 0) {
                    System.out.println("El número " + n + "es positivo");
                } else {
                    System.out.println("El número " + n + "es negativo");
                }

                System.out.println("El cuadrado del número " + n + " es " + nSquare);
            }
        }
    }
}
