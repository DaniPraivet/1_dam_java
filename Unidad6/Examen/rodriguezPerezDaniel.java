package Unidad6.Examen;

import java.util.Random;
import java.util.Scanner;

public class rodriguezPerezDaniel {
    private static int LIMITE_GENERACION = 10;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int opcion;

        do {
            System.out.println("\nMenu examen: ");
            System.out.println("\t1. Ejercicio 1");
            System.out.println("\t2. Ejercicio 2");
            System.out.println("\t3. Ejercicio 3");
            System.out.println("\t0. Salir");
            System.out.println("\n");
            opcion = sc.nextInt();
            sc.nextLine(); // Amortiguar los datos que vayamos a introducir

            switch (opcion) {
                case 1:
                    ejercicio1(sc, rnd);
                    break;
                case 2:
                    ejercicio2(sc);
                    break;
                case 3:
                    ejercicio3(sc, rnd);
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    break;
                case 0:
                    System.out.println("Nos vemos");
                default:
                    System.out.println("WARNING: Introduce los números del 0 al 4.");
                    break;
            }
        }
        while(opcion != 0);

        sc.close();
    }

    public static void ejercicio1 (Scanner sc, Random rnd) {
        double[] resultado = unoA(sc, rnd);
        int nuevoMayor = unoB(resultado);
        long nuevoMenor = unoC(resultado);


        System.out.println("El numero menor original es: " + resultado[0]);
        System.out.println("El numero mayor original es: " + resultado[1]);
        System.out.println("El nuevo numero mayor es: " + nuevoMayor);
        System.out.println("El nuevo numero menor es: " + nuevoMenor);
    }

    public static double[] unoA (Scanner sc, Random rnd) {

            /*
            A) Escribe una función que encuentre el valor máximo y el valor
            mínimo en un array de números double. (2 punto)
             */

        System.out.println("Dime la longitud del array.");
        System.out.println("Los números se compararán para saber cuál es el más pequeño.");
        int longitudArray = sc.nextInt();
        double[] array = new double[longitudArray];
        double menor = LIMITE_GENERACION + 1;
        double mayor = 0;
        double[] resultado = new double[2];

        // Generamos los números
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextDouble(LIMITE_GENERACION);
        }

        // Comprobamos cuál es el más pequeño y más grande
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] < menor) { // Si array[i] es menor que la variable `menor`
                menor = array[i]; // es el nuevo valor de esta variable
            }
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        System.out.println();
        System.out.println();
        resultado[0] = menor;
        resultado[1] = mayor;


        return resultado;
    }
    public static int unoB (double[] array) {
        /*
        B) Crear una función que devuelva un int con el valor máximo
        obtenido en el apartado A mediante un cast. (0,5 puntos)
         */
        int nuevoMayor = (int) array[1];
        return nuevoMayor;
    }
    public static long unoC (double[] array) {
        /*
        C) Crear una función que devuelva un long con el valor mínimo
        obtenido en el apartado A mediante el uso de un metodo de la
        librería Math (0,5 puntos).
         */
        long nuevoMenor = (long) array[0];
        return nuevoMenor;
    }

    public static void ejercicio2 (Scanner sc) {
        /*
        A) Crea una función que reciba una cadena de texto y determine si es un palíndromo (1,5 punto)
        B) Crea una función que reciba una cadena de texto y cuente los diferentes tipos de caracteres
        que hay. La función deberá escribir el número de letras, dígitos y espacios en blanco de la cadena.
        Para ello puedes utilizar funciones de la clase Character (0,5 punto)
        C) Introduce otra cadena de texto y una palabra, y crea una función que diga la posición en la que
        se encuentra la palabra dentro de la cadena, y si no está, pues que diga que dicha palabra no se
        encuentra en la cadena. (1 punto)
         */

        System.out.println("Introduce una palabra: ");
        String palabra = sc.nextLine();
        String palabraReversa = new StringBuilder(palabra).reverse().toString();

        if (palabra.equals(palabraReversa)) {
            System.out.println("La palabra " + palabra + " es capicúa.");
        } else {
            System.out.println("La palabra " + palabra + " no es capicúa.");
        }

        System.out.println("Dime una frase: ");
        String frase = sc.nextLine();
        char[] fraseChar = frase.toCharArray();
        int contadorEspacios = 0;
        int contadorLetras = 0;

        for (int i = 0; i < fraseChar.length; i++) {
            if (fraseChar[i] == ' ') {
                contadorEspacios++;
            }
            else {
                contadorLetras++;
            }
        }

        System.out.println("Hay " + contadorLetras + " letras.");
        System.out.println("Hay " + contadorEspacios + " espacios.");

        System.out.println("Dime otra frase para hallar una palabra dentro de ella: ");
        String frase2 = sc.nextLine();
        System.out.println("Dime la palabra ha hallar dentro de la frase: ");
        String palabraEnFrase2 = sc.nextLine();

        int indicePalabra = frase2.indexOf(palabraEnFrase2);

        System.out.println("La palabra ha sido hallada en el índice " + indicePalabra);


    }

    public static void ejercicio3 (Scanner sc, Random rnd) {
            /*
            Enunciado
        Dadas dos matrices de tamaño nxn (Siendo n un número introducido por teclado)
        generadas aleatoriamente con valores entre 0 y 9. (1,5 puntos)
        Realiza las siguientes operaciones:
        A)Función que devuelva la transpuesta de una matriz recibida como parámetro (1 punto)
        B)Función que devuelva una matriz con la multiplicación de matrices (1 punto)
        C)Mostrar todas las matrices en formato matricial. Las dos matrices generadas
        aleatoriamente, la matriz suma y la matriz multiplicación (0,5 punto)
             */
        System.out.println("Dime la longitud de los arrays a multiplicar: ");
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        int[][] arrayAMultiplicar = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd.nextInt(9) + 1;

            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayAMultiplicar[i][j] = rnd.nextInt(9) + 1;
            }
        }



        int[][] resultadoMultiplicacion = multiplicacionMatrices(array, arrayAMultiplicar);
        int[][] arrayTranspuesto = matrizTranspuesta(array);


        System.out.println("Esta es la matriz original:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Esta es la matriz transpuesta");
        // Imprimimos el array transpuesto
        for (int i = 0; i < arrayTranspuesto.length; i++) {
            for (int j = 0; j < arrayTranspuesto[0].length; j++) {
                System.out.print(arrayTranspuesto[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Este es el resultado de la multiplicación:");
        // Imprimimos el resultado de la multiplicación
        for (int i = 0; i < resultadoMultiplicacion.length; i++) {
            for (int j = 0; j < resultadoMultiplicacion[0].length; j++) {
                System.out.print(resultadoMultiplicacion[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] matrizTranspuesta (int[][] arrayOriginal) {
        int[][] nuevoArray = new int[arrayOriginal[0].length][arrayOriginal.length];

        for (int i = 0; i < arrayOriginal.length; i++) {
            for (int j = 0; j < arrayOriginal[0].length; j++) {
                nuevoArray[j][i] = arrayOriginal[i][j];
            }
        }
        return nuevoArray;
    }

    public static int[][] multiplicacionMatrices (int[][] array, int[][] arrayAMultiplicar) {
        int[][] suma = new int[array.length][array.length];

        if (array[0].length == arrayAMultiplicar.length) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < arrayAMultiplicar[0].length; j++) {
                    for (int k = 0; k < array[0].length; k++) {
                        suma[i][j] += array[i][k] * arrayAMultiplicar[k][j];
                    }
                }
            }
        }

        return suma;
    }



}