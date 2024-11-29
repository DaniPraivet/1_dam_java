package Unidad5;

/*
En un juego de rol, el mapa puede implementarse como una matriz donde las filas y
las columnas representan lugares (lugar 0, lugar 1, lugar 2, etc) que estarán
conectados.

Si desde el lugar A podemos ir hacia el lugar B, entonces la matriz en la posición
[x][y] valdrá true, en caso contrario, valdrá false.

Para hacer el programa más realista, antes de comprobar si se puede viajar
rellenaremos nuestra matriz de forma aleatoria con 0 o 1. Donde caiga un 0 significa
que no es transitable, si cae un 1 significa que si es transitable.

Escribe una función que , dada una matriz que representa el mapa y dos lugares (que
sean transitables), indique si es posible viajar desde el primer lugar al segundo
(directamente o pasando por lugares intermedios).
 */


import java.util.Arrays;

public class ejercicioClase16 {
    public static void main(String[] args) {
        int[][] mapa = new int[8][8];
        int[] lugares = new int [4];

        rellenarMapa(mapa);
        generacionLugares(lugares,mapa);
        comprobarLugares(mapa);


        for (int[] ints : mapa) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void rellenarMapa(int[][] mapa) {
        for (int i = 0; i < mapa.length ; i++) {
            for (int j = 0; j < mapa[i].length ; j++) {
                mapa[i][j] = (int) (Math.random() * 2);
            }
        }
    }

    public static void generacionLugares(int[] lugares, int[][] mapa) {
        for (int i = 0; i < lugares.length; i++) {
            lugares[i] = (int) (Math.random() * mapa.length);
        }
        mapa[lugares[0]][lugares[1]] = 3;
        mapa[lugares[2]][lugares[3]] = 4;
    }

    public static void comprobarLugares(int[][] mapa) {
        int[] inicio = buscarLugar(mapa, 3);
        int[] destino = buscarLugar(mapa, 4);

        // Comprobamos que existe inicio y destino.
        if (inicio == null || destino == null) {
            System.out.println("No se encontraron los lugares de inicio o destino.");
            return;
        }

        boolean[][] visitados = new boolean[mapa.length][mapa[0].length];

        if (buscarCamino(mapa, inicio[0], inicio[1], destino[0], destino[1], visitados)) {
            System.out.println("Se puede viajar.");
        } else {
            System.out.println("No se puede viajar.");
        }
    }

    public static boolean buscarCamino(int[][] mapa, int x, int y, int destX, int destY, boolean[][] visitados) {
        // Verificamos si no se sale del array y que cumple esas condiciones.
        if (x < 0 || y < 0 || x >= mapa.length || y >= mapa[0].length || visitados[x][y] || mapa[x][y] == 0) {
            return false;
        }

        // Si llegamos al destino, no cambiamos el 4.
        if (x == destX && y == destY) {
            return true;
        }

        // Marcar como visitado.
        visitados[x][y] = true;

        // Si no es el punto de inicio, marcamos el camino como 2.
        if (mapa[x][y] != 3) {
            mapa[x][y] = 2;
        }

        // Comprobar las 8 direcciones.
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};

        for (int[] direction : directions) {
            if (buscarCamino(mapa, x + direction[0], y + direction[1], destX, destY, visitados)) return true;
        }

        /* Mismo que el for pero con if.
        if (buscarCamino(mapa, x - 1, y, destX, destY, visitados) ||
                buscarCamino(mapa, x + 1, y, destX, destY, visitados) ||
                buscarCamino(mapa, x, y - 1, destX, destY, visitados) ||
                buscarCamino(mapa, x, y + 1, destX, destY, visitados) ||
                buscarCamino(mapa, x - 1, y - 1, destX, destY, visitados) ||
                buscarCamino(mapa, x - 1, y + 1, destX, destY, visitados) ||
                buscarCamino(mapa, x + 1, y - 1, destX, destY, visitados) ||
                buscarCamino(mapa, x + 1, y + 1, destX, destY, visitados)) {
            return true;
        }*/

        // Si no es parte del camino, convertimos el 2 a 1.
        if (mapa[x][y] != 3) {
            mapa[x][y] = 1;
        }

        return false;
    }



    public static int[] buscarLugar(int[][] mapa, int valor) {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == valor) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
