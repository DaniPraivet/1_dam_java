package Unidad6;

import java.util.Scanner;

public class tableroAjedrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // tablero de ajedrez
        char[][] tablero = new char[8][8];
        int[] pieza = new int[2];
        char simboloPieza = ' ';

        System.out.println("Introduce una de las siguientes opciones del 1 al 4: ");
        System.out.println("\t1. Dama.");
        System.out.println("\t2. Caballo.");
        System.out.println("\t3. Torre.");
        System.out.println("\t4. Alfil.");
        int opcion = sc.nextInt();



        rellenarTablero(tablero);
        switch (opcion) {
            case 1:
                simboloPieza = '۩';
                posicion(pieza, tablero, simboloPieza);
                patronesDama(pieza, tablero);
                break;
            case 2:
                simboloPieza = '♞';
                posicion(pieza, tablero, simboloPieza);
                patronesCaballo(pieza, tablero);
                break;
            case 3:
                simboloPieza = '♜';
                posicion(pieza, tablero, simboloPieza);
                patronesTorre(pieza, tablero);
                break;
            case 4:
                simboloPieza = '♝';
                posicion(pieza, tablero, simboloPieza);
                patronesAlfil(pieza, tablero);
                break;
        }
        for (char[] chars : tablero) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(chars[j] + "  ");
            }
            System.out.println();
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
        }
    }

    public static void posicion(int[] pieza, char[][] tablero, char simboloPieza) {
        for (int i = 0; i < pieza.length; i++) {
            pieza[i] = (int) (Math.random() * tablero.length);
        }
        tablero[pieza[0]][pieza[1]] =  simboloPieza;
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

    // Dama
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


        // patrones diagonales
        int fila = dama[0];
        int columna = dama[1];
        int damero = tablero.length;

        // arriba-izquierda
        for (int i = fila - 1, j = columna - 1; i >= 0 && j >= 0; i--, j--) { // si i o j llegan a 0 se detiene
            tablero[i][j] = 'x';
        }

        // arriba-derecha
        for (int i = fila - 1, j = columna + 1; i >= 0 && j < damero; i--, j++) { // si i llega a 0 o j llega a tablero.length-1 (7) se detiene
            tablero[i][j] = 'x';
        }

        // abajo-izquierda
        for (int i = fila + 1, j = columna - 1; i < damero && j >= 0; i++, j--) { // si i llega a 7 o j llega a 0 se detiene
            tablero[i][j] = 'x';
        }

        // abajo-derecha
        for (int i = fila + 1, j = columna + 1; i < damero && j < damero; i++, j++) { // si i o j llegan a 7 se detiene
            tablero[i][j] = 'x';
        }
    }

    // Torre
    public static void patronesTorre(int[] torre, char[][] tablero) {
        // Patrones verticales y horizontales
        for (int i = 0; i < tablero.length ; i++) {
            for (int j = 0; j < tablero[i].length ; j++) {
                if ( i == torre[0] && j != torre[1] ) {
                    tablero[i][j] = 'x';
                }
                if ( j == torre[1] && i != torre[0] ) {
                    tablero[i][j] = 'x';
                }
            }
        }
    }

    // Alfil
    public static void patronesAlfil(int[] alfil, char[][] tablero) {
        // patrones diagonales
        int fila = alfil[0];
        int columna = alfil[1];
        int damero = tablero.length;

        // arriba-izquierda
        for (int i = fila - 1, j = columna - 1; i >= 0 && j >= 0; i--, j--) { // si i o j llegan a 0 se detiene
            tablero[i][j] = 'x';
        }

        // arriba-derecha
        for (int i = fila - 1, j = columna + 1; i >= 0 && j < damero; i--, j++) { // si i llega a 0 o j llega a tablero.length-1 (7) se detiene
            tablero[i][j] = 'x';
        }

        // abajo-izquierda
        for (int i = fila + 1, j = columna - 1; i < damero && j >= 0; i++, j--) { // si i llega a 7 o j llega a 0 se detiene
            tablero[i][j] = 'x';
        }

        // abajo-derecha
        for (int i = fila + 1, j = columna + 1; i < damero && j < damero; i++, j++) { // si i o j llegan a 7 se detiene
            tablero[i][j] = 'x';
        }
    }

}

