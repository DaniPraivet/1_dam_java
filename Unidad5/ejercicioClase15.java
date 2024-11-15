package Unidad5;

/*
Escribe un programa que con un array bidimensional
dibuje en pantalla un tablero de ajedrez (B y N).

Además, pedirá la posición de la dama en el tablero y
mostrará con un X todas las casillas a las que puede ir la
reina en sus desplazamientos. (puede recorrer todas las
posiciones de su fila, de su columna y en ambas
diagonales desde donde está)
*/

import java.util.Arrays;

public class ejercicioClase15 {
    public static void main(String[] args) {
        // tablero de ajedrez
        String[][] tablero = new String[8][8];
        // elección de lugar de la doma
        int[] dama = new int[2];


        for (int i = 0; i < tablero.length ; i++) {
            for (int j = 0; j < tablero[i].length ; j++) {
                if ((i + j) % 2 == 0) {
                    tablero[i][j] = " B ";
                } else {
                    tablero[i][j] = " N ";
                }
            }
            System.out.println();
        }

        for (int i = 0; i < dama.length; i++) {
            dama[i] = (int) (Math.random() * tablero.length);
        }
        tablero[dama[0]][dama[1]] =  " D ";

        for (int i = 0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i]));
        }




    }
}
