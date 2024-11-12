package Unidad5;

import java.util.Arrays;

public class ejercicioClase12 {
    /*Crear un array bidimensional de longitud 5x5 y rellenarla
    de la siguiente forma:

    El elemento de la posición [n][m] debe contener el valor 10
    x (n + m).

    Después se debe mostrar su contenido.*/
    public static void main(String[] args) {
        int[][] miArray = new int[5][5];


        for (int n = 0; n < miArray.length; n++) {
            for (int j = 0; j < miArray[n].length; j++) {
                miArray[n][j] = 10 * (n + j);
                System.out.print(miArray[n][j] + "\t");
            }
            System.out.println();
        }
    }
}
