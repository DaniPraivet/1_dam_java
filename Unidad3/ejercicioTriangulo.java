package Unidad3;

public class ejercicioTriangulo {
    public static void main(String[] args) {
        int base = 10; // base del triángulo
        int altura = 5; // altura del triángulo

        // Calcular la posición inicial y final de la impresión de los asteriscos
        int inicio = (base - 1) / 2; // posición inicial (izquierda)
        int fin = inicio + base - 1; // posición final (derecha)

        // Iterar sobre la altura del triángulo
        for (int i = 0; i < altura; i++) {
            // Imprimir los asteriscos que forman la base del triángulo
            for (int j = inicio; j <= fin; j++) {
                System.out.print("*");
            }
            System.out.println();
            // Actualizar la posición inicial y final para la próxima iteración
            inicio--;
            fin--;
        }
    }
}
