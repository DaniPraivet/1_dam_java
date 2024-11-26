package Unidad6;

import java.util.Scanner;
/*
Se dispone de la siguiente relación de letras:

Conjunto1: e, i, k, m, p, q, r, s, t, u, v
Conjunto2: p, v, i, u, m, t, e, r, k, q, s

Con ella es posible codificar un texto, convirtiendo cada letra del conjunto 1 en su correspondiente
del conjunto 2. El resto de las letras no se modifican.

Deberían de poder codificarse mayúsculas y minúsculas, pero la codificación siempre se
muestra en minúsculas.

Un ejemplo: la palabra PaquiTo se convierte en matqvko.

Deberás de implementar la siguiente función que codificará un texto:

char codifica(char conjunto1[], char conjunto2[], char c)

que devuelve el carácter c codificado según los conjuntos 1 y 2 que se le pasan.
 */
public class ejercicioClase8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        char[] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};

        String fraseACodificar = sc.nextLine();
        System.out.println("Frase antes de codificar: " + fraseACodificar);

        String textoCodificado = codificarFrase(conjunto1,conjunto2,fraseACodificar);
    }

    public static String codificarFrase (char[] conjunto1, char[] conjunto2, String frase) {
        String resultado = "";

        for (int i = 0; i < frase.length(); i++) {
            resultado += compararCaracter(conjunto1,conjunto2,frase.charAt(i));
        }
        return resultado;

    }

    public static char compararCaracter (char[] conjunto1, char[] conjunto2, char c) {
        c = Character.toLowerCase(c);

        for (int i = 0; i < conjunto1.length; i++) {
            if (conjunto1[i] == c) {
                return conjunto2[i];
            }
        }
        return c;
    }
}