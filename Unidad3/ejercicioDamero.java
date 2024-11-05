package Unidad3;

public class ejercicioDamero {
    public static void main(String[] args) {
        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {

                if ((i + j) % 2 == 0) {
                    System.out.print(" B ");
                } else {
                    System.out.print(" N ");
                }
            }
            System.out.println();
        }
    }
}
