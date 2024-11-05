package Unidad3;

public class ejercicioArbol {
    public static void main(String[] args) {
        int i, j, k, n;
        n = 10;
        for (i = 1; i < n + (n / 2); i++) {
            for (j = n + (n / 2); j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
