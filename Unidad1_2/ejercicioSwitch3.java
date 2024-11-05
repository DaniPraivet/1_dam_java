import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ejercicioSwitch3 {
    public static void main(String[] args) {
        int day;                        // Declaramos la variable días
        Scanner sc = new Scanner(in);   // Declaramos el scanner
        day = sc.nextInt();             // Creamos un nuevo escáner

        switch (day) {
            case 1 -> out.println("Lunes");
            case 2 -> out.println("Martes");
            case 3 -> out.println("Miércoles");
            case 4 -> out.println("Jueves");
            case 5 -> out.println("Viernes");
            case 6 -> out.println("Sábado");
            case 7 -> out.println("Domingo");
            default -> out.println("Debes elegir un número del 1 al 7.");
        }
    }
}
