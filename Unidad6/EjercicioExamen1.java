package Unidad6;

/*
Crea un programa que pida por pantalla cuatro países y a continuación tres ciudades de cada uno de
estos países. Los nombres de ciudades deben almacenarse en un array multidimensional cuyo primer
índice sea el número asignado a cada país y el segundo índice el número asignado a cada ciudad.
Ejemplo de resultados que debe mostrar el programa:
País: Argentina Ciudades: Buenos Aires Cordoba La Plata
País: España Ciudades: Madrid Lugo Sevilla
País: Francia Ciudades: Paris Niza Lyon
País: Italia Ciudades: Roma Napoles Sicilia
 */

import java.util.Scanner;

public class EjercicioExamen1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] paises = new String[4];
        String[][] ciudades = new String[4][3];

        System.out.println("Introduce tus 4 paises: ");
        for (int i = 0; i < ciudades.length; i++) {
            paises[i] = sc.nextLine();
            System.out.println("Introduce las 3 ciudades de : " + paises[i]);
            for (int j = 0; j < ciudades[0].length; j++) {
                ciudades[i][j] = sc.nextLine();
            }
            System.out.println("Dime el siguiente pais.");
        }
        sc.close();
        // Imprimimos el resultado

        for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i] + ":" );
            for (int j = 0; j < ciudades[0].length; j++) {
                System.out.print(ciudades[i][j] + " ");
            }
            System.out.println();
        }
    }
}
