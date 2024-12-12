package Unidad7.ejercicio2;

/*
En la clase CuentaCorriente sobrecarga los constructores
para poder crear objetos:

Con el DNI del titular de la cuenta y un saldo inicial

Con el DNI, nombre y el saldo inicial.

Escribe un programa que compruebe el funcionamiento de
estos métodos.
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

            System.out.println("Introduca su DNI: ");
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
        }
        saldo += cantidad;
        System.out.println("Has ingresado " + cantidad + "€ y actualmente tienes " + saldo + "€.");
        return true;
    }
}
