package Unidad8.ejercicioClase;

import Unidad8.ejercicioClase.SeresVivos.Gato;
import Unidad8.ejercicioClase.SeresVivos.Perro;

public class Main {
    public static void main(String[] args) {
        Gato g1 = new Gato(18,68,4,"Felis catus", "Bigotes", "Scottish Fold");
        g1.mostrarInformacion();
        g1.voz();
        Perro p1 = new Perro(14,65,4,"Canis lupus familiaris", "Rufus", "Beagle");
        p1.mostrarInformacion();
        p1.voz();
    }
}
