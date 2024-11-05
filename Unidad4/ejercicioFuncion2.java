package Unidad4;

import java.util.Scanner;

public class ejercicioFuncion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántas veces quieres que se haga eco? ");
        int n = sc.nextInt();
        echofunction(n);


    }
    static void echofunction(int n) {
        for (int i=n; i>0; i--) {
            System.out.println("<Eco...>");
        }
    }
}
