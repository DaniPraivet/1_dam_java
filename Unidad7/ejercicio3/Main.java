package Unidad7.ejercicio3;

import java.util.Scanner;

import Utils.*;

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

        do {
            System.out.println("Bienvenido al sistema de gestión de aulas, ¿qué desea hacer hoy?");
            System.out.println("\t1. Crear una aula");
            System.out.println("\t2. Añadir alumno en una clase");
            System.out.println("\t3. Cambiar el estado de un aula");
            System.out.println("\t4. Mostrar información de un aula");
            System.out.println("\t0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    if (siguienteCuenta < instituto.length) {
                        System.out.println("Dime el nombre de la nueva aula:");
                        String nombre = sc.nextLine();

                        System.out.println("Dime la cantidad máxima de alumnos en el aula:");
                        int maxAlumnos = sc.nextInt();
                        sc.nextLine();

                        if (maxAlumnos > 0 && !nombre.isEmpty()) {
                            instituto[siguienteCuenta] = new Aula(maxAlumnos, nombre);
                            siguienteCuenta++;
                        } else {
                            System.out.println("Datos inválidos para crear el aula.");
                        }
                    } else {
                        System.out.println("No se pueden crear más aulas.");
                    }
                }
                case 2 -> {
                    System.out.println("¿En cuál clase deseas añadir el alumno? (Introduce el índice del aula)");
                    int indice = sc.nextInt();
                    sc.nextLine();
                    if (indice >= 0 && indice < siguienteCuenta) {
                        System.out.println("Dime el nombre del nuevo alumn@:");
                        String nombre = sc.nextLine();

                        System.out.println("Dime la edad del nuevo alumn@:");
                        int edad = sc.nextInt();

                        System.out.println("Dime la calificación del nuevo alumn@:");
                        double calificacion = sc.nextDouble();
                        sc.nextLine();

                        if (!nombre.isEmpty() && edad > 0 && calificacion >= 0 && calificacion <= 10) {
                            Alumno nuevoAlumno = new Alumno(nombre, edad, calificacion, instituto[indice].getAula().length);
                            instituto[indice].añadirAlumno(nuevoAlumno);
                        } else {
                            System.out.println("Datos inválidos para el alumno.");
                        }
                    } else {
                        System.out.println("Índice no válido.");
                    }
                }
                case 3 -> {
                    System.out.println("¿En cuál clase deseas cambiar el estado? (Introduce el índice del aula)");
                    int indice = sc.nextInt();
                    sc.nextLine();
                    if (indice >= 0 && indice < siguienteCuenta) {
                        instituto[indice].cambiarEstado();
                    } else {
                        System.out.println("Índice no válido.");
                    }
                }
                case 4 -> {
                    System.out.println("¿De cuál aula deseas mostrar la información? (Introduce el índice del aula)");
                    int indice = sc.nextInt();
                    sc.nextLine();
                    if (indice >= 0 && indice < siguienteCuenta) {
                        instituto[indice].mostrarInformacion();
                    } else {
                        System.out.println("Índice no válido.");
                    }
                }
                case 0 -> System.out.println("Saliendo del programa. Nos vemos o/");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}