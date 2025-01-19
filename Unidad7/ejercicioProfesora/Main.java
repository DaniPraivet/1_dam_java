package Unidad7.ejercicioProfesora;

import java.util.Scanner;

/*
- Crear la clase Cerdo:
	int id
	String raza
	boolean sexo
- Crear la clase Vaca:
	String nombre
	String producto (carne, leche)
- Crear la clase Granja
	Tendrá un nombre
	Tendrá objetos Cerdo en su interior
	Tendrá objetos Vaca en su interior

Funciones de Granja
-> Si es de leche, ¿cuántos litros diarios se recogen
al día entre todas las vacas de la granja?
-> Mostrar la información de todos los animales que hay en
la granja
 */


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cerdo cerdo1 = new Cerdo(1,"Meishan", false);
        Cerdo cerdo2 = new Cerdo(2,"Erhualian", true);
        Cerdo cerdo3 = new Cerdo(3,"Jiaxing Negro", true);
        Cerdo cerdo4 = new Cerdo(4,"Fengjing", false);
        Vaca vaca1 = new Vaca("Lola","leche");
        Vaca vaca2 = new Vaca("Mercedes","carne");
        Vaca vaca3 = new Vaca("Vicky", "leche");
        Vaca vaca4 = new Vaca("Antonia", "leche");
        Vaca[] vaquitas = {vaca1, vaca2, vaca3, vaca4};
        Cerdo[] cochinitos = {cerdo1, cerdo2, cerdo3, cerdo4};
        Granja miGranja = new Granja("Paco", cochinitos, vaquitas);
        int opcion = 1;
        while (opcion != 0) {
            System.out.println("Titulo menu");
            System.out.println("\t1. Litros que se recogen al día.");
            System.out.println("\t2. Mostrar información de todos los animales.");
            System.out.println("\t0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Se recogen al día: " + miGranja.litrosRecogidosAlDia(vaquitas) + " L.");

                }
                case 2 -> {
                    miGranja.mostrarInformacionAnimales(cochinitos, vaquitas);
                }
                case 0 -> System.out.println("Saliendo del programa. Nos vemos o/");
                default -> throw new IllegalStateException("Valor no identificado: " + opcion);

            }
        }
    }
}
