package Unidad8.ejercicio5;

import java.util.Arrays;

public abstract class Poligono {
    int nLados;
    double[] longLados = new double[nLados];

    public Poligono(int nLados, double[] longLados) {
        this.nLados = nLados;
        this.longLados = longLados;
    }

    public double[] getLongLados() {
        return longLados;
    }

    public void setLongLados(double[] longLados) {
        this.longLados = longLados;
    }


    public void hallarPerimetro() {
        double resultado = 0;
        for (double longLado : this.longLados) {
            resultado += longLado;
        }
        System.out.println("El perímetro es de -> " + resultado);
    }

    public void mostrarInformacion() {
        hallarPerimetro();
        System.out.println("La longitud de los lados es la siguiente: \n" + Arrays.toString(this.longLados));

    }
}
