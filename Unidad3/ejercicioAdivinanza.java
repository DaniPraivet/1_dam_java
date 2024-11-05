package Unidad3;

import java.util.Scanner;

public class ejercicioAdivinanza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número al azar entre el 1 y el 100: ");
        int numeroSecreto = (int) (Math.random() * 100 + 1);
        int adivinanza = 0;

        while (adivinanza != numeroSecreto && adivinanza != -1) {
            adivinanza = sc.nextInt();
            if (adivinanza == -1) {
                System.out.println("Te has rendido.");
            }
            else {
                System.out.println(adivinanza > numeroSecreto ? "El número que buscas es más pequeño." : "El número que buscas es más grande.");
            }
        }
        System.out.println("GG ez bot");
    }
}
