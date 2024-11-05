package Unidad4;

import java.util.Scanner;

public class ejercicioFuncionRecursiva {
    public static void main (String[] args) {
        System.out.println("Dime el número n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numerofactorial = factorial(n);
        System.out.println("El factorial de " + n + " es: " + numerofactorial);

    }


    public static int factorial(int n) {
        int resultado;
        if (n == 0) {
            resultado = 1;
        }
        else {
            resultado = n * factorial(n-1);
        }
        return resultado;
    }
}
