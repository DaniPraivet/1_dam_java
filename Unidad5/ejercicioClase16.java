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



        for (int i = 0; i < mapa.length ; i++) {
            System.out.println(Arrays.toString(mapa[i]));
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

    }
}
