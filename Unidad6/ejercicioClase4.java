package Unidad6;

import Utils.ConsoleUtils;

import java.util.Scanner;

public class ejercicioClase4 {
    public static void main(String[] args) {
        /*Diseñar el juego “Acierta la contraseña”.

        La mecánica del juego es la siguiente:

        El primer jugador introduce la contraseña

        El segundo jugador debe introducir palabras hasta que la acierte.

        Realizar dos versiones:

            Primera versión. El juego facilita al segundo jugador
            información como por ejemplo si la contraseña es mayor o
            menor que la palabra que está introduciendo

            Segunda versión. El juego facilita al jugador información sobre
            la longitud de la contraseña y una cadena de caracteres acertados
            en sus lugares respectivos así como asteriscos en los no
            acertados.*/



        Scanner sc = new Scanner(System.in);

        // El primer jugador introduce la contraseña
        System.out.println(ConsoleUtils.RED + "Jugador 1: \n Introduce tu contraseña");
        String contrasena = sc.nextLine();

        System.out.println("¿Quieres jugar la primera version o la segunda?");
        int modo_juego = sc.nextInt();

        switch (modo_juego) {
            case 1:
                // Modo de juego dando como pista si la longitud de la contraseña es más larga u corta





                break;
            case 2:
                // Modo de juego facilitando la longitud de la contraseña y mascara de caracteres = *
                break;
            default:
                System.out.println("Solo puedes usar como opción el número 1 o 2.");
                break;
        }



    }
}
