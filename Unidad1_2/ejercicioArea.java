public class ejercicioArea {
    final static double PI = 3.14159;


    public static void main(String[] args) {
        //Definimos variables con diferentes ambitos y tipos
        /*int numLados = 3;
        double diametro = 10.2;
        double radio = diametro/2;

        double areaCirculo = PI * Math.pow(radio, 2);
        String resultado;

        resultado = String.format("%.2f", areaCirculo);

        System.out.println("El área es: " + resultado);*/

        int numLados = 3;
        double a = 4;   // Altura
        double b = 5;   // Base
        double areaTriangulo = (b*a) / 2; // Formulita táctica

        String resultado;   // Crear variable de resultado
        resultado = String.format("%.2f", areaTriangulo);    // Dejar los últimos 2 decimales

        System.out.println("El área es: " + resultado); // Imprimimos el resultado


    }
}
