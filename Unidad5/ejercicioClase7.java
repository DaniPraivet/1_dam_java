package Unidad5;

import java.util.Arrays;

public class ejercicioClase7 {
    public static void main(String[] args) {
        /*
        Implementar la función:

        int[] sinRepetidos(int t[])

        Que construye y devuelve un array de longitud apropiada,
        con los elementos de t, donde se han eliminado los datos
        repetidos.*/

        int[] t = {2,67,12,41,22,2,41};
        int[] tUnico = new int[t.length];
        int[] pos = {};

        Arrays.sort(t);
        System.out.println(Arrays.toString(t));

        for (int i = 0; i < t.length; i++) {
            pos[i] = Arrays.binarySearch(t, t[i]);


        }



        System.out.println(Arrays.toString(tUnico));



    }
    /*static int[] sinRepetidos(int[] t) {

    }*/
}
