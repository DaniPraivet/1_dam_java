package Unidad4;

public class ejercicioFuncion4 {
    /*System.out.println("Inserta un número: ");
     Scanner sc = new Scanner (System.in);
     int n = sc.nextInt();
     int nDiv= numDivisibles(n);
     boolean primo = esPrimo(n);
         System.out.println("El número " + n + " tiene " + nDiv + " divisores primos.");
    }
    // Creo la función para averiguar si es primo
    static boolean esPrimo(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
    // Creo la función para averiguar los números divisibles primos
    static int numDivisibles (int n) {
        int nDivPrimos = 0;

        // Recorremos desde el primer primo hasta el nùmero por debajo del insertado
        // Se comprueba si ese iterador divide a mi número
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                if (esPrimo(i)) {
                    nDivPrimos++;
                }
            }
        }
        return nDivPrimos;
    }
    static String numDivisibles (int n) {
        String divNum = "Son : ";
        int nDivPrimos = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                if (esPrimo(i)) {
                    nDivPrimos++;
                    divNum = String.valueOf(+ i);
                }
            }
        }
        return divNum;
    }*/
}
