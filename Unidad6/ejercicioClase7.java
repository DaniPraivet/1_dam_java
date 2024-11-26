package Unidad6;

/*
Escribir un programa que pida el nombre completo al
usuario y lo muestre sin vocales (mayúsculas,
minúsculas y acentuadas).

Por ejemplo:

“Álvaro Pérez” → “lvr Prz”
 */

import Utils.ConsoleUtils;

import java.util.Scanner;

public class ejercicioClase7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

        String prohibido = "aeiouáéíóúAEIOUÁÉÍÓÚ";

        StringBuilder sinVocales = new StringBuilder();
        for (char c  : frase.toCharArray()) {
            if (prohibido.indexOf(c)==-1) { // Sino encuentra el caracter...
                sinVocales.append(c); // Añade el caracter al nuevo array
            }
        }

        System.out.println(ConsoleUtils.RED_BOLD + sinVocales + ConsoleUtils.RESET);
    }
}