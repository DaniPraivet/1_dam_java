package Unidad4;

import java.util.Scanner;

public class ejercicioCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 1;

        while (opcion != 0) { // Hasta que "opcion" no sea 7, se repite el bucle
            System.out.println("------CALCULADORA------");
            System.out.println("\t 1. Sumar");
            System.out.println("\t 2. Restar");
            System.out.println("\t 3. Multiplicar");
            System.out.println("\t 4. Dividir");
            System.out.println("\t 5. Media aritmética de 3 números");
            System.out.println("\t 6. Potencia");
            System.out.println("\t 7. Números impares");
            System.out.println("\t 8. Trigonometría");
            System.out.println("\t 9. Distancia euclídea");
            System.out.println("\t 0. Salir");

            opcion = sc.nextInt();
            System.out.println("Dime n1: ");
            float n1 = sc.nextFloat();


            switch (opcion) { // Pedir números en el switch para optimizar las funciones
                case 1 -> {
                    System.out.println("Dime n2: ");
                    float n2 = sc.nextFloat();
                    System.out.println("El resultado de la suma es: " + sumar(n1, n2));
                }
                case 2 -> {
                    System.out.println("Dime n2: ");
                    float n2 = sc.nextFloat();
                    System.out.println("El resultado de la resta es: " + restar(n1, n2));
                }
                case 3 -> {
                    System.out.println("Dime n2: ");
                    float n2 = sc.nextFloat();
                    System.out.println("El resultado de la multiplicación es: " + multiplicar(n1, n2));
                }
                case 4 -> {
                    System.out.println("Dime n2: ");
                    float n2 = sc.nextFloat();
                    System.out.println("El resultado de la división es: " + dividir(n1, n2));
                }
                case 5 -> {
                    System.out.println("Dime n2: ");
                    float n2 = sc.nextFloat();
                    System.out.println("Dime n3: ");
                    float n3 = sc.nextFloat();
                    System.out.println("El resultado de la media aritmética es: " + mediaAritmetica(n1, n2, n3));
                }
                case 6 -> {
                    System.out.println("Dime n2: ");
                    float n2 = sc.nextFloat();
                    System.out.println("El resultado de la potencia es: " + potencia(n1, n2));
                }
                case 7 -> {
                    System.out.println("La suma de los impares hasta" + n1 + " es " + sumaNumerosImpares(n1));
                }
                case 8 -> {
                    trigonometria(n1);
                }
                case 9 -> {
                    System.out.println("Dime x2: ");
                    float x2 = sc.nextFloat();
                    System.out.println("Dime y1: ");
                    float y1 = sc.nextFloat();
                    System.out.println("Dime y2: ");
                    float y2 = sc.nextFloat();
                    System.out.println("La distancia euclídea entre " + n1 + ", "  + x2 + " y " + y1 + ", " + y2 + " es " + distanciaEuclidea(n1, x2, y1, y2));
                }
                case 0 -> {
                    System.out.println("Nos vemos o/ ");
                }
                default -> {
                    System.out.println("Escribe valores comprendidos entre 1 y 10.");
                }

            }

        }


    }

    static float sumar(float n1, float n2) {
        float resultado = n1 + n2;
        return resultado;
    }

    static float restar(float n1, float n2) {
        float resultado = n1 - n2;
        return resultado;
    }

    static float multiplicar(float n1, float n2) {
        float resultado = n1 * n2;
        return resultado;
    }

    static float dividir(float n1, float n2) {
        float resultado = n1 / n2;
        return resultado;
    }

    static float mediaAritmetica(float n1, float n2, float n3) {
        float resultado = (sumar(sumar(n1, n2), n3)) / 3;
        return resultado;
    }

    static float potencia(float n1, float n2) {
        float resultado = 1;
        for (float i = 0; i < n2; i++) {
            resultado = multiplicar(resultado, n1);
        }
        return resultado;
    }

    static float sumaNumerosImpares(float n1) {
        float suma = 0;
        for (float i = 1; i <= n1; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }
        return suma;
    }

    static void trigonometria(float n1) {
        System.out.println("Seno: " + Math.sin(n1));
        System.out.println("Coseno: " + Math.cos(n1));
        System.out.println("Tangente: " + Math.tan(n1));
    }

    static double distanciaEuclidea(float n1, float x2, float y1, float y2) {
        double distancia = Math.sqrt(Math.pow(x2 - n1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }
}
