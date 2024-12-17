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
    String dni;
    String nombre;
    double saldo = 0;
    int idCuenta = 0;

    protected CuentaCorriente(String dni, String nombre, int idCuenta) {
        this.dni = dni;
        this.nombre = nombre;
        this.idCuenta = idCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public static CuentaCorriente crearCuenta(int idCuenta) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        String dni;

        for (;;){
            System.out.println("Introduce el nombre del titular de la cuenta: ");
            nombre = scanner.nextLine();

            System.out.println("Introduca su DNI: ");
            dni = scanner.nextLine();

            if (nombre.isEmpty() || dni.isEmpty()) {
                System.out.println("No puedes dejar ni el nombre ni el DNI en blanco.");
            } else {
                break;
            }

            scanner.close();
        }

        return new CuentaCorriente(dni,nombre,idCuenta);
    }

    public boolean retirarDinero(double cantidad) {
        if (cantidad<=0) {
            return false;
        }
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente para realizar esta operación.");
            return false;
        }
        saldo -= cantidad;
        System.out.println("Has retirado " + cantidad + "€ y actualmente tienes " + saldo + "€.");
        return true;
    }

    public boolean ingresarDinero(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser positiva.");
            return false;
        } else {
            saldo += cantidad;
            System.out.println("Has ingresado " + cantidad + "€ y actualmente tienes " + saldo + "€.");
            return true;
        }
    }
}
