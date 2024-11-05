import java.util.Scanner;

public class actividadEvaluableCajero {
    public static void main(String[] args) {
        // Generamos valor al azar un valor entre 0 y 10000
        int dinero = (int) (Math.random() * (10001));
        int opcion = 0;
        int retiroSesion = 0;
        Scanner sc = new Scanner(System.in);

        // Usuario rodriguez.pedan
        // Contraseña usuario123
        System.out.println("Ingrese su número de cuenta: ");
        String user = sc.nextLine(); // Creamos escaner para el usuario
        System.out.println("Ingrese su contraseña de la cuenta " + user + " .");
        String pswd = sc.nextLine(); // Creamos escaner para la contraseña

        if ((user.equals("rodriguez.pedan")) && (pswd.equals("usuario123"))) {
            while (opcion != 4) { // Si no introducimos el valor 4 en la variable opción, se repite el bucle
                // Menu
                System.out.println("Cajero Automático");
                System.out.println("1. Retirar Dinero");
                System.out.println("2. Verificar Saldo");
                System.out.println("3. Depositar dinero");
                System.out.println("4. Salir");
                System.out.println("Debes elegir la opción según el número de la izquierda: ");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1 -> {
                        System.out.println("¿Cuánto dinero quieres retirar? (tienes " + dinero + " €)");
                        int retirar = sc.nextInt(); // Creamos escaner para introducir la cantidad a retirar
                        if (retirar > dinero) { // Comprobar si el usuario quiere sacar más dinero del que tiene
                            System.out.println("No tienes suficiente saldo");
                        }
                        if (retiroSesion == 0) { // Si es el primer retiro del usuario es igual
                            retiroSesion=retirar;
                        }
                        else {retiroSesion= retiroSesion + retirar;} // Sino, se suman los retiros anteriores más el actual
                        int retiroDiario = 600; // El retiro máximo por sesión (Diario)
                        if (retiroSesion > retiroDiario) { // Comparamos nuestros retiros totales con el retiro máximo
                            System.out.println("Has alcanzado el retiro máximo diario.");
                        }
                        else {
                            int saldoFinal = dinero - retirar; // Calculamos como se queda nuestro saldo después del retiro
                            System.out.println("Actualmente tienes " + saldoFinal + " €");
                        }
                    }
                    case 2 -> { // Mostramos el dinero en la cuenta
                        System.out.println("Tienes actualmente " + dinero + " €.");
                    }
                    case 3 -> {
                        System.out.println("¿Cuánto dinero quieres ingresar?");
                        int ingresar = sc.nextInt();
                        int saldoFinal = dinero + ingresar; // Calculamos el saldo después del ingreso
                        System.out.println("Tienes " + saldoFinal + " €.");
                    }
                    case 4 -> System.out.println("Gracias por usar este cajero :)"); // Mensaje amigable

                    default -> System.out.println("Ingresa una opción válida."); // Por si el usuario no introduce un valor contemplado
                }

            }
        }
        else {System.out.println("Nombre de cuenta y/o contraseña incorrectos.");}
    }
}
