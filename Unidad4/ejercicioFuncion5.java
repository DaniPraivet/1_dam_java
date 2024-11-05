package Unidad4;

import java.util.Scanner;

public class ejercicioFuncion5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime 3 números: ");
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        float numeroMayor = 0;
        System.out.println("El número mayor es: " + numeroMayor);
        numeroMayor = mayor(n1, n2, n3);


    }
    static float mayor (float n1, float n2) {
        float numeroMayor = Math.max(n1,n2);
        return numeroMayor;
    }
    static float mayor (float n1, float n2, float n3) {
        float numeroMayor = mayor(n1,n2);
        numeroMayor = mayor (numeroMayor, n3);
        return numeroMayor;
    }
}
