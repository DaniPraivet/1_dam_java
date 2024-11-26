package Unidad6;

/*
Diseñar una función a la que se le pase una cadena de
caracteres y la devuelva invertida.

Un ejemplo:

“hola mundo” → “odnum aloH”
 */

import java.util.Scanner;

public class ejercicioClase6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        String revFrase = "";

        for (int i = 0; i < frase.length(); i++) { // for para introducir de manera invertida
            revFrase = frase.charAt(i) + revFrase; // cada caracter
        }

        System.out.println("Frase original: " + frase);
        System.out.println("Reverb frase original: " + revFrase);
        metodo2(frase);
    }

public static void metodo2(String frase) {
        StringBuilder fraseInvertida = new StringBuilder();
        fraseInvertida.append(frase); // pasamos el contenido de frase a fraseInvertida
        fraseInvertida.reverse(); // le hacemos reverse
        System.out.println(fraseInvertida);
}


}


