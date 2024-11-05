package Unidad4;

import java.util.Scanner;

public class ejercicioFibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int fibo = fibonacci(numero);
        System.out.println(fibo);
    }
    public static int fibonacci (int numero) {
        int fibo;
        if ((numero == 0) || (numero == 1)) {
            fibo = 1;
        } else {
            fibo = fibonacci(numero - 1);
        }
        return fibo;
    }
}
