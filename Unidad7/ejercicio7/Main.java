package Unidad7.ejercicio7;

/*
Escribir un programa que lea por teclado una hora cualquiera.

Además, escribiremos n segundos, donde n es la cantidad de
segundos que sumaremos.

El programa mostrará la hora introducida y la hora con
n segundos más.

Para ello hemos de diseñar previamente la clase Hora que
dispone de los atributos hora, minuto y segundo.

Los valores de los atributos se controlarán mediante
get/set.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 1;
        System.out.println("Dime la hora que vas a introducir");
        System.out.println("Segundos:");
        int segundo = sc.nextInt();
        System.out.println("Minutos:");
        int minuto = sc.nextInt();
        System.out.println("Horas:");
        int hora = sc.nextInt();
        Hora hora1 = new Hora(hora, minuto, segundo);
        while (opcion != 0) {
            System.out.println("Titulo menu");
            System.out.println("\t1. Añadir segundos.");
            System.out.println("\t2. Mostrar hora.");
            System.out.println("\t0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Dime los segundos que quieres sumar:");
                    int segundosASumar = sc.nextInt();
                    hora1.sumarSegundos(hora1.getSegundo(), segundosASumar);
                }
                case 2 -> {
                    System.out.println("Hora guardada: \n");
                    System.out.printf("%02d:%02d:%02d \n", hora1.getHora(), hora1.getMinuto(), hora1.getSegundo());
                }
                case 0 -> System.out.println("Saliendo del programa. Nos vemos o/");
                default -> throw new IllegalStateException("Valor no identificado: " + opcion);

            }
        }
    }
}
