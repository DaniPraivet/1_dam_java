import java.util.Locale;
import java.util.Scanner;

public class ejercicioNumeroNegativoPositivo {

        // Practica de clase, determinar si un número es positivo o negativo
        public static void main(String[] args) {
            System.out.println("Introduce tu número: ");
            Scanner sc;
            int num;
            sc = new Scanner(System.in);
            sc.useLocale(Locale.US);

            num = sc.nextInt();

            if (num > 0) {
                System.out.println("Tu número es posistivo");
            }
            else if ( num < 0 ) {
                System.out.println("Tu número es negativo");
            }
            else {
                System.out.println("Tu número es " + num);
            }

            //Vamos a considerar númeor positivo >= 0

            String resultado = (num < 0) ? "Negativo" : "Positivo";
            System.out.println(resultado);

        }
}
