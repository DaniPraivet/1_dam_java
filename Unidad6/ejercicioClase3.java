package Unidad6;

import java.util.Scanner;

public class ejercicioClase3 {
    public static void main(String[] args) {
        /*Introducir por teclado dos frases e indicar cuál de ellas
        es la más corta, es decir, la que contiene menos
        caracteres.*/

        Scanner sc = new Scanner(System.in);
        String[] frases = new String[2];

        frases[0] = sc.nextLine();
        frases[1] = sc.nextLine();


        if (frases[0].length() > frases[1].length()) {
            System.out.println("La segunda frase es la más corta. ( " + frases[1].length() + " > " + frases[0].length() + " )");
        }
        else {
            System.out.println("La primera frase es la más corta. ( " + frases[0].length() + " > " + frases[1].length() + " )");
        }
    }
}
