package Unidad6;

import java.util.Scanner;

/*
    Vamos a plantear y resolver un ejercicio: queremos almacenar en una matriz el número de alumnos con el que cuenta una academia,
    ordenados en función del nivel y del idioma que se estudia. Tendremos 3 filas que representarán al Nivel básico, medio y de
    perfeccionamiento y 4 columnas en las que figurarán los idiomas (0 = Inglés, 1 = Francés, 2 = Alemán y 3 = Ruso). Se pide realizar
    la declaración de la matriz y asignarle unos valores de ejemplo a cada elemento.
 */
public class ejercicioExamen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nAlumnos = sc.nextInt();
        String[][][] alumnos = new String[nAlumnos][4][3];
        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < alumnos[0].length; j++) {
                for (int k = 0; k < alumnos[0][0].length; k++) {
                    System.out.println("");
                }
            }
        }
    }
}
