package Unidad8.ejercicio5;

public class Triangulo extends Poligono{

    public Triangulo(double[] longLados) {
        super(3, longLados);
    }

    public void calcularArea() {
        double base = longLados[0];
        double altura = Math.sqrt(Math.pow(longLados[1],2) -Math.pow(base/2,2));
        double resultado = (base*altura)/2;
        System.out.println( "El área del triángulo es: " + resultado);
    }

    @Override
    public void mostrarInformacion() {
        calcularArea();
        super.mostrarInformacion();
    }
}
