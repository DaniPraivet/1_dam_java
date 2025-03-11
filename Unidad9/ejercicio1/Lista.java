package Unidad9.ejercicio1;

import java.util.Arrays;

public class Lista {
    int[] lista;

    public Lista() {
        this.lista = new int[0];
    }

    public Lista(int[] lista) {
        this.lista = lista;
    }

    int obtenerNumerosElementos() {
       return this.lista.length;
    }

    void mostrarElementos() {
        System.out.println(Arrays.toString(lista));
    }

    void insertarNumeroPrincipio(int numero) {
        int[] lista2 = Arrays.copyOf(this.lista, this.lista.length+1);
        lista2[0] = numero;
        for (int i = 1; i < lista2.length-1; i++) {
            lista2[i] = this.lista[i];
        }
        this.lista = lista2;
    }

    void insertarNumeroFinal(int numero) {
        this.lista = Arrays.copyOf(this.lista, this.lista.length+1);
        this.lista[lista.length-1] = numero;
    }

    void insertarNumeroParametro(int numero, int posicion) {
        int[] nuevaLista = new int[this.lista.length+1];
        for (int i = 0; i < this.lista.length; i++) {
            if (i < posicion -1) {
                nuevaLista[i] = this.lista[i];
            } else if (i == posicion -1) {
                nuevaLista[i] = numero;
            } else {
                nuevaLista[i] = this.lista[i-1];
            }
        }
        this.lista = nuevaLista;
    }

    void insertarListaFinal(Lista listaParaAgregar) {
        int longitudArray = this.lista.length;
        this.lista = Arrays.copyOf(this.lista, this.lista.length+listaParaAgregar.lista.length);
        for (int i = 0; i < listaParaAgregar.lista.length; i++) {
            this.lista[longitudArray+i] = listaParaAgregar.lista[i];
        }
    }

    void eliminarElementoParametro(int posicion) {
        for (int i = 0; i < this.lista.length; i++) {
            if (i == posicion) {
                this.lista[i] = 0;
            } else if (i == this.lista.length-1) {
                this.lista[posicion] = this.lista[this.lista.length-1];
            }
            this.lista = Arrays.copyOf(this.lista, this.lista.length-1);
        }
    }

    int obtenerElementoParametro(int posicion) {
        return this.lista[posicion];
    }

    boolean buscarElementoParametro(int posicion) {

        for (int i = 0; i < this.lista.length; i++) {
            if (i == posicion) {
                return true;
            }
        }
        return false;
    }

}

