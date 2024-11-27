package Unidad6;

import java.util.Arrays;

public class ejercicioInventado3 {
    public static void main(String[] args) {
        // tablero de ajedrez
        char[][] tablero = new char[8][8];
        // elección de lugar del caballo
        int[] caballo = new int[2];

        rellenarTablero(tablero);

        posicionCaballo(caballo, tablero);

        patronesCaballo(caballo, tablero);

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

    public static void posicionCaballo(int[] caballo, char[][] tablero) {
        for (int i = 0; i < caballo.length; i++) {
            caballo[i] = (int) (Math.random() * tablero.length);
        }
        tablero[caballo[0]][caballo[1]] =  '♘';
    }

    public static void patronesCaballo(int[] caballo, char[][] tablero) {
        int[][] movimientos = {
                {-2, 1}, {-2, -1},
                {-1, 2}, {-1, -2},
                {1, 2}, {1, -2},
                {2, 1}, {2, -1}
        };

        int fila = caballo[0];
        int columna = caballo[1];


        for (int[] movimiento : movimientos) {
            int nuevaFila = fila + movimiento[0];
            int nuevaColumna = columna + movimiento[1];

            if (nuevaFila >= 0 && nuevaFila < tablero.length && nuevaColumna >= 0 && nuevaColumna < tablero[0].length) {
                tablero[nuevaFila][nuevaColumna] = 'x';
            }
        }
    }
}

