package Unidad12.ejercicio14;

import java.util.*;

public class Sorteo <T>{
        private Set<T> elementos;

        public Sorteo() {
            elementos = new HashSet<>();
        }

        public boolean add(T elemento) {
            return elementos.add(elemento);
        }

        public Set<T> premiados(int numPremiados) {
            if (numPremiados > elementos.size()) {
                throw new IllegalArgumentException("No hay suficientes elementos para premiar.");
            }

            List<T> lista = new ArrayList<>(elementos);
            Collections.shuffle(lista);

            return new HashSet<>(lista.subList(0, numPremiados));
        }

        public void mostrarElementos() {
            System.out.println("Elementos actuales: " + elementos);
        }
}
