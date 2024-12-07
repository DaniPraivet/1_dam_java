package Unidad7.ejercicio1;

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
    public String dni;
    public String nombre;
    public double saldo;
    public int idCuenta = 0;

    public CuentaCorriente(String dni, String nombre, double saldo, int idCuenta) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
        this.idCuenta = idCuenta;
    }

    public static CuentaCorriente crearCuenta(int idCuenta) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        String dni;

        for (;;){
            System.out.println("Introduce el nombre del titular de la cuenta: ");
            nombre = scanner.nextLine();

            System.out.println("Introduce");
            dni = scanner.nextLine();

            if (nombre.isEmpty() || dni.isEmpty()) {
                System.out.println("No puedes dejar ni el nombre ni el DNI en blanco.");
            } else {
                break;
            }

            scanner.close();
        }

        return new CuentaCorriente(dni, nombre, 0, idCuenta);
    }
}
