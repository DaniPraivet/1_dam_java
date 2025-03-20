package Unidad10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        leerEntero();
    }

    public static Integer leerEntero() {
        Scanner sc = new Scanner(System.in);
        Integer resultado = 0;

        do {
            try {
                resultado = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: tipo no válido");
            }
        } while (true);
        return resultado;
    }
}
