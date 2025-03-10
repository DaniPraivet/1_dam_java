package Unidad8.ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 1;
        while (opcion != 0) {
            System.out.println("Titulo menu");
            System.out.println("\t1. Mostrar información triángulo equilátero");
            System.out.println("\t2. Mostrar información cuadrado equilátero");
            System.out.println("\t0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    Triangulo tEquilatero = new Triangulo(new double[] {3,3,3});
                    tEquilatero.mostrarInformacion();
                }
                case 2 -> {
                    Cuadrado cEquilatero = new Cuadrado(new double[] {4,4,4,4});
                    cEquilatero.mostrarInformacion();
                }
                case 0 -> System.out.println("Saliendo del programa. Nos vemos o/");
                default -> throw new IllegalStateException("Valor no identificado: " + opcion);

            }
        }
    }
}
