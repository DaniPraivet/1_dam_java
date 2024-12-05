package Unidad7;

/*
Diseñar la clase CuentaCorriente, que almacena los datos:
DNI
Nombre del titular
Saldo

Las operaciones típicas con una cuenta corriente son:

Crear una cuenta: se necesita sí o sí el DNI y el nombre del titular. El
saldo inicial se inicializará por defecto a 0.

Sacar dinero: El metodo debe indicar si ha sido posible llevar a cabo la
operación.

Ingresar dinero: se incremente el saldo

Mostrar información: Se muestra la información de la cuenta.
 */

import java.util.Scanner;

public class CuentaCorriente {
    Scanner sc = new Scanner(System.in);
    static String dni;
    static String nombre;
    static double saldo;
    static int idCuenta;

    public CuentaCorriente(String dni, String nombre, double saldo, int idCuenta) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Bienvenido al banco, ¿qué desea hacer hoy?");
        System.out.println("\t1. Crear una cuenta");
        System.out.println("\t2. Sacar dinero");
        System.out.println("\t3. Ingresar dinero");
        System.out.println("\t4. Mostrar información");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> crearCuenta(dni, nombre, saldo, idCuenta, sc);
            case 2 -> System.out.println("Adios");
            default -> throw new IllegalStateException("Valor no identificado: " + opcion);
        }
    }
    public static CuentaCorriente crearCuenta(String dni, String nombre, double saldo, int idCuenta, Scanner sc) {
        boolean inicioSesion = false;
        while(!inicioSesion) {
            System.out.println("Introduce el nombre del titular de la cuenta: ");
            nombre = sc.nextLine();
            System.out.println("Introduce");
            dni = sc.nextLine();
            saldo = 0;
            if (nombre.isEmpty() || dni.isEmpty()) {
                System.out.println("No puedes dejar ni el nombre ni el DNI en blanco.");
            }
            else {
                inicioSesion = true;
            }
        }
        return new CuentaCorriente(dni,nombre,saldo, idCuenta);
    }


}
