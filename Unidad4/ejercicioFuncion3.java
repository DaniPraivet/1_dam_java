package Unidad4;

import java.util.Scanner;

public class ejercicioFuncion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime 2 números y te mostraré todos los números comprendidos entre ellos.");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        numeros(n1,n2);


    }
    static void numeros(int n1, int n2) { // Esto lo hago para que solo aparezcan los números entre medias solo
        for (int i=n1+1; i<n2-1; i++) {
            System.out.println(i);
        }
    }
}
