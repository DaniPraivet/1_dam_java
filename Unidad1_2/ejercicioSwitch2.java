import java.util.Scanner;

import static java.lang.System.in;

public class ejercicioSwitch2 {
    public static void main(String[] args) {
        int nota; // Declaramos la variable nota
        Scanner sc = new Scanner(in); // Declaramos la variable scanner
        nota = sc.nextInt(); // Creamos un scanner en el variable nota

        switch (nota) {
            case 0, 1, 2, 3, 4 -> System.out.print("Estás suspenso máquina");
            case 5 -> System.out.print("Aprobao por los pelos");
            case 6, 7 -> System.out.print("Bien hecho sosio");
            case 8 -> System.out.print("Notable");
            case 9, 10 -> System.out.print("Sobre pa casa fiera");
            default -> System.out.print("Pon los números del 0 al 10.");
        }
    }
}
