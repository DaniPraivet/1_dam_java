package Unidad6;

public class ejercicioClase1 {
    public static void main(String[] args) {
        /*
        Escribir un programa que muestre todos los caracteres
        Unicode junto a su code point, cuyo valor esté
        comprendido entre \u0000 y \uFFFF.
        */
        for ( int i = 0x0000; i <= 0xffff; i++) {
            String caracteres = Integer.toHexString(i);
            System.out.println("/u" + caracteres + " : " + (char)i);
        }
    }
}
