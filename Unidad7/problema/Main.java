package Unidad7.problema;

import Utils.Switch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 1;
        Sitio s1 = new Sitio(1,"IAV", "Ismael Akhtouch de la Vega");
        Sitio s2 = new Sitio(1,"JMN", "Javier Morata Navarrete");
        while (opcion != 0) {
            System.out.println("Titulo menu");
            System.out.println("\t1. Mostrar sitios clase");
            System.out.println("\t1. Asignar sitio");
            System.out.println("\t0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {

                }
                case 2 -> {}
                case 0 -> System.out.println("Saliendo del programa. Nos vemos o/");
                default -> throw new IllegalStateException("Valor no identificado: " + opcion);

            }
        }
    }
}
