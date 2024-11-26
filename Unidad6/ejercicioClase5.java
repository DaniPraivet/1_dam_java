package Unidad6;

/*
Diseñar una aplicación que pida al usuario que introduzca una
frase por teclado e indique cuántos espacios en blanco tiene.
*/


import java.util.Scanner;


/*
Lo que hace este programa es eliminar los espacios en blanco, es decir, si antes de iniciar la frase
introducimos 6 veces la barra espaciadora o al terminar la frase, te elimina esos espacios
usando .strip() y te cuenta la diferencia de longitud de cada String dando como resultado el número
de espacios en blanco de la frase introducida por el usuario.
*/

public class ejercicioClase5 {
    public static void main(String[] args) {

        // pedimos la frase al usuario
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        int espacios = 0;

        //String fraseSinEspacios = frase.strip();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                espacios++;
            }
        }
        //int nEspacios = frase.length() - fraseSinEspacios.length();
        System.out.println("La frase introducida tenía : " + espacios + " espacios.");

    }
}