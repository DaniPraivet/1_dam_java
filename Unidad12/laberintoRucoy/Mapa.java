package Unidad12.laberintoRucoy;

import java.util.ArrayList;
import java.util.List;

public class Mapa {
    Casilla[] casillas = new Casilla[26];
    List<List<Casilla>> caminos = new ArrayList<>();

    public Mapa() {
        for (int i = 0; i < 26; i++) {
            casillas[i] = new Casilla(i);
        }

        casillas[1].izquierda = casillas[16];
        casillas[1].derecha = casillas[8];
        casillas[2].izquierda = casillas[17];
        casillas[2].derecha = casillas[13];
        casillas[3].izquierda = casillas[6];
        casillas[3].derecha = casillas[13];
        casillas[4].izquierda = casillas[7];
        casillas[4].derecha = casillas[23];
        casillas[5].izquierda = casillas[11];
        casillas[5].derecha = casillas[6];
        casillas[6].izquierda = casillas[9];
        casillas[6].derecha = casillas[7];
        casillas[7].izquierda = casillas[9];
        casillas[7].derecha = casillas[6];
        casillas[8].izquierda = casillas[19];
        casillas[8].derecha = casillas[22];
        casillas[9].izquierda = casillas[7];
        casillas[9].derecha = casillas[21];
        casillas[10].izquierda = casillas[22];
        casillas[10].derecha = casillas[24];
        casillas[11].izquierda = casillas[20];
        casillas[11].derecha = casillas[7];
        casillas[12].izquierda = casillas[7];
        casillas[12].derecha = casillas[18];
        casillas[13].izquierda = casillas[16];
        casillas[13].derecha = casillas[12];
        casillas[14].izquierda = casillas[21];
        casillas[14].derecha = casillas[15];
        casillas[15].izquierda = casillas[1];
        casillas[15].derecha = casillas[22];
        casillas[16].izquierda = casillas[15];
        casillas[16].derecha = casillas[10];
        casillas[17].izquierda = casillas[15];
        casillas[17].derecha = casillas[22];
        casillas[18].izquierda = casillas[9];
        casillas[18].derecha = casillas[4];
        casillas[19].izquierda = casillas[25];
        casillas[19].derecha = casillas[17];
        casillas[20].izquierda = casillas[9];
        casillas[20].derecha = casillas[3];
        casillas[21].izquierda = casillas[5];
        casillas[21].derecha = casillas[12];
        casillas[22].izquierda = casillas[15];
        casillas[22].derecha = casillas[17];
        casillas[23].izquierda = casillas[1];
        casillas[23].derecha = casillas[9];
        casillas[24].izquierda = casillas[14];
        casillas[24].derecha = casillas[17];
        casillas[25].izquierda = casillas[2];
        casillas[25].derecha = casillas[15];


    }

    public void buscarCamino(Casilla inicio, Casilla fin, List<Casilla> actual) {
        actual.add(inicio);

        if (inicio != fin) {
            if (inicio.izquierda != null && !actual.contains(inicio.izquierda)) {
                buscarCamino(inicio.izquierda, fin, new ArrayList<>(actual));
            }
            if (inicio.derecha != null && !actual.contains(inicio.derecha)) {
                buscarCamino(inicio.derecha, fin, new ArrayList<>(actual));
            }
        } else {
            caminos.add(actual);
        }
    }

    public void mostrarTrayecto(List<Casilla> camino) {
        List<String> numeros = new ArrayList<>();
        for (Casilla c : camino) {
            numeros.add(String.format("%02d", c.numero));
        }

        List<String> direcciones = new ArrayList<>();
        for (int i = 0; i < camino.size() - 1; i++) {
            Casilla actual = camino.get(i);
            Casilla siguiente = camino.get(i + 1);
            if (actual.izquierda == siguiente) {
                direcciones.add("L");
            } else if (actual.derecha == siguiente) {
                direcciones.add("R");
            } else {
                direcciones.add("x");
            }
        }

        System.out.println();
        System.out.println(String.join(" ", numeros));
        System.out.println(String.join("  ", direcciones));
    }
}
