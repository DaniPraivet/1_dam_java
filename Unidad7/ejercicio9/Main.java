package Unidad7.ejercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SintonizadorFM radio = new SintonizadorFM(114.0f);
        int opcion = 1;
        while (opcion != 0) {
            System.out.println("Titulo menu");
            System.out.println("\t1. Subir/Bajar frecuencia.");
            System.out.println("\t2. Mostrar frecuencia.");
            System.out.println("\t0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1 -> {
                    System.out.println("¿Quieres bajar o subir frecuencias?");
                    String respuesta = sc.nextLine();
                    boolean subirFrecuencia= respuesta.equalsIgnoreCase("Subir");
                    radio.modificarFrecuencia(subirFrecuencia);
                }
                case 2 -> {
                    radio.mostrarDatos();
                }
                case 0 -> System.out.println("Saliendo del programa. Nos vemos o/");
                default -> throw new IllegalStateException("Valor no identificado: " + opcion);

            }
        }
    }
}
