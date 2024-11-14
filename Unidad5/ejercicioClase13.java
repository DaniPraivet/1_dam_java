package Unidad5;

    /*
    Rotar una matriz 2x2 90 grados en sentido horario.
    */
public class ejercicioClase13 {
    public static void main(String[] args) {
        int[][] matriz = new int [2][2];

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);
            }
        }


        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }


        int[][] matrizRotada = rotarMatriz90Grados(matriz);



        System.out.println("\nMatriz rotada 90 grados en sentido horario:");
        mostrarMatriz(matrizRotada);
    }

    public static int[][] rotarMatriz90Grados(int[][] matriz) {
        int[][] rotada = new int[2][2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0) {
                    if (j == 0) {
                        rotada[i][j] = matriz[i+1][j];
                    }
                    else {
                        rotada[i][j] = matriz[i][j-1];
                    }
                }
                else {
                    if ( j == 0) {
                        rotada[i][j] = matriz[i][j+1];
                    }
                    else {
                        rotada[i][j] = matriz[i-1][j];
                    }
                }
            }
        }

        /*rotada[0][0] = matriz[1][0];
        rotada[0][1] = matriz[0][0];
        rotada[1][0] = matriz[1][1];
        rotada[1][1] = matriz[0][1];
        */
        return rotada;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

