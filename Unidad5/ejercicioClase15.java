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
        char[][] tablero = new char[8][8];
        // elección de lugar de la doma
        int[] dama = new int[2];

        rellenarTablero(tablero);

        posicionDama(dama, tablero);

        patronesDama(dama, tablero);

        // A printear el tablero coño
        for (char[] chars : tablero) {
            System.out.println(Arrays.toString(chars));
        }

    }


    public static void rellenarTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length ; i++) {
            for (int j = 0; j < tablero[i].length ; j++) {
                if ((i + j) % 2 == 0) {
                    tablero[i][j] = '■';
                } else {
                    tablero[i][j] = '□';
                }
            }
            System.out.println();
        }
    }

    public static void posicionDama(int[] dama, char[][] tablero) {
        for (int i = 0; i < dama.length; i++) {
            dama[i] = (int) (Math.random() * tablero.length);
        }
        tablero[dama[0]][dama[1]] =  '۩';
    }

    public static void patronesDama(int[] dama, char[][] tablero) {
        // Patrones verticales y horizontales
        for (int i = 0; i < tablero.length ; i++) {
            for (int j = 0; j < tablero[i].length ; j++) {
                if ( i == dama[0] && j != dama[1] ) {
                    tablero[i][j] = 'x';
                }
                if ( j == dama[1] && i != dama[0] ) {
                    tablero[i][j] = 'x';
                }
            }
        }


        // Patrones diagonales
        int fila = dama[0];
        int columna = dama[1];

        // arriba-izquierda
        for (int i = fila - 1, j = columna - 1; i >= 0 && j >= 0; i--, j--) { // si i o j llegan a 0 se detiene
            tablero[i][j] = 'x';
        }

        // arriba-derecha
        for (int i = fila - 1, j = columna + 1; i >= 0 && j < tablero.length; i--, j++) { // si i llega a 0 o j llega a tablero.length-1 (7) se detiene
            tablero[i][j] = 'x';
        }

        // abajo-izquierda
        for (int i = fila + 1, j = columna - 1; i < tablero.length && j >= 0; i++, j--) { // si i llega a 7 o j llega a 0 se detiene
            tablero[i][j] = 'x';
        }

        // abajo-derecha
        for (int i = fila + 1, j = columna + 1; i < tablero.length && j < tablero.length; i++, j++) { // si i o j llegan a 7 se detiene
            tablero[i][j] = 'x';
        }
    }


}
