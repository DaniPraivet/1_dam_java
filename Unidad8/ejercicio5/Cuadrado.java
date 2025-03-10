package Unidad8.ejercicio5;

public class Cuadrado extends Poligono{
    public Cuadrado(double[] longLados) {
        super(4, longLados);
    }

    public void calcularArea() {
        double resultado = Math.pow(this.longLados[0], 2);
        System.out.println( "El área del cuadrado es: " + resultado);
    }

    @Override
    public void mostrarInformacion() {
        calcularArea();
        super.mostrarInformacion();
    }
}
