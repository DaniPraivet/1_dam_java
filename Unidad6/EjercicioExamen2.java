package Unidad6;

import java.util.Scanner;

/*
    Vamos a plantear y resolver un ejercicio: queremos almacenar en una matriz el número de alumnos con el que cuenta una academia,
    ordenados en función del nivel y del idioma que se estudia. Tendremos 3 filas que representarán al Nivel básico, medio y de
    perfeccionamiento y 4 columnas en las que figurarán los idiomas (0 = Inglés, 1 = Francés, 2 = Alemán y 3 = Ruso). Se pide realizar
    la declaración de la matriz y asignarle unos valores de ejemplo a cada elemento.
 */
public class EjercicioExamen2 {

    Scanner sc = new Scanner(System.in);
    // Constantes para las dimensiones del array
    private static final int NIVELES = 3;
    private static final int IDIOMAS = 4;
    private static final int NUMEROALUMNOS = 1;

    // Constantes descriptivas
    private static final String[] NOMBRES_NIVELES = {"Básico", "Medio", "Perfeccionamiento"};
    private static final String[] NOMBRES_IDIOMAS = {"Inglés", "Francés", "Alemán", "Ruso"};



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nivelesAlumno = "";
        String idiomasAlumno = "";
        



        String[][][] alumnos = new String[NIVELES][IDIOMAS][NUMEROALUMNOS];


        alumnos[0][0][0] = "10";
        alumnos[0][1][0] = "8";
        alumnos[0][2][0] = "5";
        alumnos[0][3][0] = "3";

        alumnos[1][0][0] = "15";
        alumnos[1][1][0] = "12";
        alumnos[1][2][0] = "9";
        alumnos[1][3][0] = "6";

        alumnos[2][0][0] = "7";
        alumnos[2][1][0] = "5";
        alumnos[2][2][0] = "3";
        alumnos[2][3][0] = "2";

        for (int i = 0; i < NIVELES; i++) {
            nivelesAlumno = sc.nextLine();
            for (int j = 0; j < IDIOMAS; j++) {
                idiomasAlumno = sc.nextLine();
                for (int k = 0; k < NUMEROALUMNOS; k++) {

                }
            }

        }




        for (int i = 0; i < NIVELES; i++) {
            System.out.println("Nivel " + NOMBRES_NIVELES[i] + ":");
            for (int j = 0; j < IDIOMAS; j++) {
                System.out.println("  " + NOMBRES_IDIOMAS[j] + ": " + alumnos[i][j][0] + " alumnos");
            }
        }
    }
}
