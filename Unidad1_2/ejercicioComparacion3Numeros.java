import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ejercicioComparacion3Numeros {
    public static void main(String[] args) {

        // Creamos las variables como enteros
        int num1, num2, num3;
        Scanner sc = new Scanner(in);

        // Preguntamos al usuario las variables de los números
        out.println("Ingrese su primer número: ");
        num1 = sc.nextInt();
        out.println("Ingrese su segundo número: ");
        num2 = sc.nextInt();
        out.println("Ingrese su tercer número: ");
        num3 = sc.nextInt();

        // Comprobamos cual de los 6 casos es correcto
        // Si número 1 es el más grande
        if (( num1 > num2) && ( num1 > num3 )) {
            if ( num2 > num3) {
                out.println(num1 + " > " + num2 + " > " + num3);
            }
            else{
                out.println(num1 + " > " + num3 + " > " + num2);
            }
        }
        // Si número 2 es el más grande
        if (( num2 > num1) && ( num2 > num3 )) {
            if ( num1 > num3) {
                out.println(num2 + " > " + num1 + " > " + num3);
            }
            else{
                out.println(num2 + " > " + num3 + " > " + num1);
            }
        }
        // Si número 3 es el más grande
        if (( num3 > num1) && ( num3 > num2 )) {
            if ( num1 > num2) {
                out.println(num3 + " > " + num1 + " > " + num2);
            }
            else{
                out.println(num3 + " > " + num2 + " > " + num1);
            }
        }
    }
}
