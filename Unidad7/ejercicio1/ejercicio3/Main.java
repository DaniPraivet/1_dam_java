package Unidad7.ejercicio3;

import Unidad7.ejercicio1.CuentaCorriente;

import java.util.Scanner;

/*
Diseñar la clase Alumno que deberá tener los siguientes parámetros:
String con Nombre
Int con Edad
Double con Calificación
Además, le deberás agregar los siguientes métodos:
Redondeo de nota
Diseñar las clase Aula que deberá tener los siguientes parámetros:
Int con Alumnos máximos
Array de Alumno
String con el Nombre del aula
Booleano con el estado del aula(ocupada o no) que por defecto será false.
Además, deberás agregar los siguientes métodos:
Añadir un nuevo alumno
Cambiar el estado del aula
Cualquier otro metodo necesario deberá ser añadido por vuestra cuenta.
 */
public class Main {
    public static void main(String[] args) {
        Aula[] instituto = new Aula[5];
        int siguienteCuenta = 0;
        Scanner sc = new Scanner(System.in);
        int opcion = 1;

        while (opcion != 0) {
            System.out.println("Bienvenido al banco, ¿qué desea hacer hoy?");
            System.out.println("\t1. Crear una aula");
            System.out.println("\t2. Añadir alumno en x clase");
            System.out.println("\t3. Editar información clase (WIP)");
            System.out.println("\t4. Editar información alumno (WIP)");
            System.out.println("\t5. Mostrar información clase");
            System.out.println("\t6. Mostrar información alumno");
            System.out.println("\t0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {

                }
                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 0 -> System.out.println("Saliendo del programa. Nos vemos o/");
                default -> throw new IllegalStateException("Valor no identificado: " + opcion);

            }
        }
    }
}
