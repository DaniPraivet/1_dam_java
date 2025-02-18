package Unidad6.Examen;

import Utils.*;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenu examen: ");
            System.out.println("\t1. Calcular la letra del DNI");
            System.out.println("\t2. Verificar si un número es capicúa");
            System.out.println("\t3. Determinar si un número es punto de silla de una matriz");
            System.out.println("\t4. Generar matriz identidad");
            System.out.println("\t5. Salir");
            System.out.println("\n");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    calcularLetraDNI(sc);
                    break;
                case 2:
                    verificarCapicua(sc);
                    break;
                case 3:
                    verificarPuntoDeSilla(sc);
                    break;
                case 4:
                    generarMatrizIdentidad();
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("WARNING: Introduce los números del 1 al 5 gilipollas");
                    break;
            }
        }
        while(opcion != 5);

        sc.close();
    }
    public static void calcularLetraDNI(Scanner sc) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P',
                'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        System.out.println("Introduce tu DNI (sin letra máquina): ");
        int dni = sc.nextInt();
        int resto = dni % 23;
        char letra = letras[resto];
        System.out.println("El dni completo es: " + dni + letra);
    }
    public static void verificarCapicua(Scanner sc) {
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        String numeroStr = Integer.toString(numero);
        String numeroReverso = new StringBuilder(numeroStr).reverse().toString();

        if (numeroStr.equals(numeroReverso)) {
            System.out.println("El número " + numero + " es capicúa.");
        } else {
            System.out.println("El número " + numero + " no es capicúa.");
        }
    }
    public static void verificarPuntoDeSilla(Scanner sc) {
        Random random = new Random();
        System.out.println("Introduce las dimensiones de la matriz ( fila x columna): ");
        int filas = sc.nextInt();
        int columnas = sc.nextInt();
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(10) + 1;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Introduce la fila que quieres comprobar: ");
        int fila = sc.nextInt();
        System.out.println("Introduce la columna que quieres comprobar: ");
        int columna = sc.nextInt();

        int valor = matriz[fila][columna];
        boolean esMinimoFila = true;
        boolean esMaximoColumna = true;

        for (int i = 0; i < columnas; i++) {
            if (matriz[fila][i] < valor) {
                esMinimoFila = false;
                break;
            }
        }

        for (int i = 0; i < filas; i++) {
            if (matriz[i][columna] > valor) {
                esMaximoColumna = false;
                break;
            }
        }

        if (esMinimoFila && esMaximoColumna) {
            System.out.println("El número " + valor + " es un punto de silla.");
        } else {
            System.out.println("El número " + valor + " no es un punto de silla.");
        }
    }
    public static void generarMatrizIdentidad() {

        int n = 3;
        int[][] matrizIdentidad = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               if (i == j) {
                   matrizIdentidad[i][j] = 1;
               } else {
                   matrizIdentidad[i][j] = 0;
               }
            }
        }

        System.out.println("Matriz identidad generada: ");
        for (int[] fila : matrizIdentidad) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
