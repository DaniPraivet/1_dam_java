package Unidad6;

import java.util.Arrays;

public class ejercicioInventado3 {
    public static void main(String[] args) {
        // tablero de ajedrez
        char[][] tablero = new char[8][8];
        // elección de lugar de la doma
        int[] caballo = new int[2];

        rellenarTablero(tablero);

        posicionDama(caballo, tablero);

        patronesDama(caballo, tablero);

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

    public static void posicionDama(int[] caballo, char[][] tablero) {
        for (int i = 0; i < caballo.length; i++) {
            caballo[i] = (int) (Math.random() * tablero.length);
        }
        tablero[caballo[0]][caballo[1]] =  '♘';
    }

    public static void patronesDama(int[] caballo, char[][] tablero) {
        // patrones diagonales
        int fila = caballo[0];
        int columna = caballo[1];
        int damero = tablero.length;
        int[] posiciones = new int[8];

        posiciones[0] = fila-2;
        posiciones[1] = columna++;
        posiciones[2] = posiciones[0];
        posiciones[3] = columna--;
        posiciones[4] = fila--;
        posiciones[5] = columna+2;
        posiciones[6] = fila++;
        posiciones[7] = columna-2;

        for (int i = 0; i < posiciones.length; i++) {
            tablero[posiciones[i]][i+1] = 'x';
        }
            System.out.println();
        }
    }

