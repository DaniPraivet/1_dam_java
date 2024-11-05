import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ejercicioSwith4 {
    public static void main(String[] args) {
        // <10k -> 10%
        // 10k-50k -> 20%
        // >50k -> 30%
        int ingresosMensuales;
        int caso = 1;
        Scanner sc = new Scanner(in);
        ingresosMensuales = sc.nextInt();

        if (ingresosMensuales > 10000 && ingresosMensuales <= 50000) {
            caso = 2;
        }
        else if ( ingresosMensuales > 50000 ) {
            caso = 3;
        }

        int impuestos = switch (caso) {
            case 1 -> 10;
            case 2 -> 20;
            case 3 -> 30;
            default -> -1;
        };

        out.println("Pagas un " + impuestos + "% de impuestos");

    }
}
