package Unidad12.laberintoRucoy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
    Debes hacer un programa para aquellos principiantes en Rucoy Online que acaban de llegar al laberinto de Lizards
    y no saben que caminos tomar para llegar a donde ellos quieren.

    El programa debe pedir por input de teclado en qué casilla están y la casilla de destino, deberás dejar una falsilla
    para aquellos que no sepan donde está Lizard 3, Lizard 2 y Lizard 1:

    Lizard 3 -> 13
    Lizard 2 -> 21
    Lizard 1 -> 1

    Aquí tienes el laberinto en formato ascii, la fila superior es a donde te lleva si escoges el portal de la
    izquierda o de la derecha, y la fila de en medio es la casilla donde te encuentras:

    +--------+--------+--------+--------+--------+
    | 12  05 | 15  17 | 09  01 | 17 14  | 15 02  |
    |   21   |   22   |   23   |   24   |   25   |
    +--------+--------+--------+--------+--------+
    | 10  15 | 15  22 | 09  04 | 25  17 | 09  03 |
    |   16   |   17   |   18   |   19   |   20   |
    +--------+--------+--------+--------+--------+
    | 20  07 | 07  18 | 16 12  | 21  15 | 22  01 |
    |   11   |   12   |   13   |   14   |   15   |
    +--------+--------+--------+--------+--------+
    | 09  07 | 09  06 | 19  22 | 07  21 | 22  24 |
    |   06   |   07   |   08   |   09   |   10   |
    +--------+--------+--------+--------+--------+
    |  8  16 | 17  13 | 06  13 | 07  23 | 11  06 |
    |   01   |   02   |   03   |   04   |   05   |
    +--------+--------+--------+--------+--------+

     */
    public static void main(String[] args) {
        Mapa mapa = new Mapa();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lizards 1 -> 1");
        System.out.println("Lizards 2 -> 21");
        System.out.println("Lizards 3 -> 13");
        System.out.print("Inicio: ");
        int inicio = scanner.nextInt();
        System.out.print("Fin: ");
        int fin = scanner.nextInt();
        mapa.buscarCamino(mapa.casillas[inicio], mapa.casillas[fin], new ArrayList<>());
        mapa.caminos.sort((a, b) -> b.size() - a.size());
        for (List<Casilla> camino : mapa.caminos) {
            mapa.mostrarTrayecto(camino);
        }
        mapa.caminos.clear();
    }
}
