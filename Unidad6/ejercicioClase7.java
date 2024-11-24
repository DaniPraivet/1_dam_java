package Unidad6;

/*
Escribir un programa que pida el nombre completo al
usuario y lo muestre sin vocales (mayúsculas,
minúsculas y acentuadas).

Por ejemplo:

“Álvaro Pérez” → “lvr Prz”
 */

import java.util.Scanner;

public class ejercicioClase7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario = sc.nextLine();

        String prohibido = "aeiouáéíóúAEIOUÁÉÍÓÚ";

        StringBuilder sinVocales = new StringBuilder();
        for (char c : usuario.toCharArray()) {
            if (prohibido.indexOf(c)==-1) {
                sinVocales.append(c);
            }
        }

        System.out.println(sinVocales);
    }
}
