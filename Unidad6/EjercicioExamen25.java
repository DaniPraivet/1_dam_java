package Unidad6;

/*
    Vamos a plantear y resolver un ejercicio: queremos almacenar en una matriz el número de alumnos con el que cuenta una academia,
    ordenados en función del nivel y del idioma que se estudia. Tendremos 3 filas que representarán al Nivel básico, medio y de
    perfeccionamiento y 4 columnas en las que figurarán los idiomas (0 = Inglés, 1 = Francés, 2 = Alemán y 3 = Ruso). Se pide realizar
    la declaración de la matriz y asignarle unos valores de ejemplo a cada elemento.
 */


import java.util.Scanner;

public class EjercicioExamen25 {


    private static final int NIVELES = 3;
    private static final int IDIOMAS = 4;
    private static final int NUMEROALUMNOS = 1;

    private static final String[] NOMBRES_NIVELES = {"Básico", "Medio", "Perfeccionamiento"};
    private static final String[] NOMBRES_IDIOMAS = {"Inglés", "Francés", "Alemán", "Ruso"};


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alumnos = new String[NUMEROALUMNOS];
        String[][] niveles = new String[NIVELES][IDIOMAS];



        for (int i = 0; i < NUMEROALUMNOS; i++) {
            System.out.println("Nombre del alumno: ");
            alumnos[i] = sc.nextLine();
            for (int j = 0; j < NIVELES; j++) {
                for (int k = 0; k < IDIOMAS; k++) {
                    System.out.println("Dime el " + NOMBRES_NIVELES[j] + " de " + NOMBRES_IDIOMAS[k] + ":");
                    niveles[j][k] = sc.nextLine();
                }
            }
        }

        for (int i = 0; i < NUMEROALUMNOS; i++) {
            System.out.println("Alumno: " + alumnos[i]);
            for (int j = 0; j < NIVELES; j++) {
                for (int k = 0; k < IDIOMAS; k++) {
                    System.out.println( "Nivel de " + NOMBRES_NIVELES[j] + " de " + NOMBRES_IDIOMAS[k] + " " +  niveles[j][k]);
                }
            }
        }


    }
}
