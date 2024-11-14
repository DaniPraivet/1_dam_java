package Unidad5;

/*Implementar la función:

    int[] suma(int t[], int numElementos)

    Crea y devuelve un array con las sumas de los elementos consecutivos de t.

    Por ejemplo, si t = [10,1,5,8,9,2], si los elementos se agrupan de 3 en 3, se realizarán
    las sumas:

    10 + 1 + 5 = 16.

    1 + 5 + 8 = 14

    5 + 8 + 9 = 22

    8 +9 + 2 = 19

    Por lo tanto, la función debe devolver un array con los resultados: [16,14,22,19]*/
public class ejercicioClase14 {
    public static void main(String[] args) {
        int[] t = {10, 1, 5, 8, 9, 2};
        int numElementos = 3; // Agrupamos los elementos en grupos de 3
        int[] resultado = suma(t, numElementos);

        System.out.print("Resultado: ");
        for (int suma : resultado) {
            System.out.print(suma + " ");
        }
    }

    public static int[] suma(int[] t, int numElementos) {
        if (numElementos <= 0 || t.length < numElementos) {
            return new int[0];
        }

        int[] resultado = new int[t.length - numElementos + 1];

        for (int i = 0; i <= t.length - numElementos; i++) {
            int suma = 0;
            for (int j = 0; j < numElementos; j++) {
                suma += t[i + j];
            }
            resultado[i] = suma;
        }

        return resultado;
    }
}

