public class segundoPrograma {
    public static void main(String[] args) {
        /* Mi versión
        // Calcula la potencia de 3

        int n = 7;
        int p = 4;

        System.out.println("El resultado de " + n + " elevado a " + p + " es: " + Math.pow(n, p)); // Usamos math.pow para poder calcular más rápido la potencia
        */

        // Versión de la profe
        int base = 7;
        int exponente = 4;
        int i = 1;
        int resultado = base;

        while (i < exponente) {
            resultado = resultado* base;
            i = i +1;
        }

        System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultado);

        /*System.out.println("Hello and welcome!");
        int i = 1;
        for (i = 1;i <= 5; i++) {
            System.out.println("i = " + i);
        }*/
    }
}
