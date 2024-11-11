package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicioClase11 {
    /*Comprueba qué produce la comparación con el operador
    == de dos arrays del mismo tipo, la misma longitud y los
    mismos valores.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for(int i = 0; i < array1.length; i++) {
            array1[i] = ((int) (Math.random() * 10)) + 1;
            array2[i] = array1[i];
        }


        System.out.println("There's two options, choose wisely: ");
        System.out.println("");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                if ( array1 == array2) {
                    System.out.println("There's no way... Did u just break Java or what?");
                }
                else {
                    System.out.println("Another stupid thing for the Stupid Stuff Book");
                }
                break;
            case 2:
                if (Arrays.equals(array1, array2)) {
                    System.out.println("Nice one, now its fine :>");
                }
                else {
                    System.out.println("U finally use ur brain, but it's wrong buddy");
                }
                break;
            default:
                System.out.println("It's just 1 or 2 u dumbass");
        }
    }
}
