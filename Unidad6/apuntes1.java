package Unidad6;

public class apuntes1 {
    public static void main(String[] args) {
        char caracter = 'r';
        int codigo = caracter;
        String cadena = new String("r");
        System.out.println("El codigo de cadena es: " + cadena.codePointAt(0));
        System.out.println("El codigo del caracter es: " + codigo);
    }
}