package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicioClase9 {

    /*
    Escribe la función:

    int[] eliminarMayores(int t[], int valor)

    que crea y devuelve una copia de el array t donde se han
    eliminado todos los elementos que son mayores que valor.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la longitud del array:");
        int arrayLength = sc.nextInt();
        int numeros[] = new int[arrayLength];
        System.out.println("Dime el valor que quieres que filtre:");
        final int valor = sc.nextInt(); // Pedimos el valor al que queremos eliminar los números mayores
        int contadorMenores = 0; // Contador de los ceros

        eliminarMayores(numeros, valor, contadorMenores);
        System.out.println("Este es el array con números mayores:");
        System.out.println(Arrays.toString(numeros));

    }

    public static int[] eliminarMayores(int[] t, int valor, int contadorPosiciones) {
        for (int i = 0; i < t.length; i++){
            t[i] = ((int) (Math.random() * 100)) + 1;
            if ( t[i] <= valor ) {
                contadorPosiciones++;
            }
        }
        Arrays.sort(t);
        t = Arrays.copyOf(t, contadorPosiciones);
        System.out.println("Este es el array sin números mayores: ");
        System.out.println(Arrays.toString(t)+"\n");
        return t;
    }

}
