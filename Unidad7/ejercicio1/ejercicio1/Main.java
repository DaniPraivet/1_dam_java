package Unidad7.ejercicio1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        CuentaCorriente[] banco = new CuentaCorriente[5];
        int siguienteCuenta = 0;
        Scanner sc = new Scanner (System.in);

        int opcion = 1;


        while (opcion != 0) {
            System.out.println("Bienvenido al banco, ¿qué desea hacer hoy?");
            System.out.println("\t1. Crear una cuenta");
            System.out.println("\t2. Sacar dinero");
            System.out.println("\t3. Ingresar dinero");
            System.out.println("\t4. Mostrar información");
            System.out.println("\t0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    CuentaCorriente nuevaCuenta = CuentaCorriente.crearCuenta(siguienteCuenta);

                    banco[siguienteCuenta] = nuevaCuenta;
                    System.out.println("Se ha creado una cuenta con la siguente ID: " + nuevaCuenta.idCuenta);

                    if (siguienteCuenta < banco.length) {
                        siguienteCuenta++;
                    } else {
                        System.out.println("Has superado el límite de cuentas.");
                    }
                }
                case 2 -> {
                    System.out.println("Introduce el ID de tu cuenta para poder retirar dinero: ");
                    int id = sc.nextInt();
                    if (id >= 0 && id < siguienteCuenta && banco[id] != null) {
                        System.out.println("Introduce la cantidad de dinero que deseas retirar: ");
                        double cantidad = sc.nextDouble();
                        banco[id].retirarDinero(cantidad);
                    }
                    else {
                        System.out.println("Esa cuenta no existe o has introducido incorrectamente el ID.");
                    }
                }
                case 3 -> {
                    System.out.println("Introduce el ID de tu cuenta para poder ingresar dinero: ");
                    int id = sc.nextInt();
                    if (id >= 0 && id < siguienteCuenta && banco[id] != null) {
                        System.out.println("Introduce la cantidad de dinero que quieres ingresar: ");
                        double cantidad = sc.nextDouble();
                        banco[id].ingresarDinero(cantidad);
                    }
                    else {
                        System.out.println("Esa cuenta no existe o has introducido incorrectamente el ID.");
                    }
                }
                case 4 -> {
                    System.out.println("Introduce el ID de tu cuenta para poder ingresar dinero: ");
                    int id = sc.nextInt();
                    if (id >= 0 && id < siguienteCuenta && banco[id] != null) {
                        CuentaCorriente cuenta = banco[id];
                        System.out.println("Información de la cuenta: ");
                        System.out.println("ID: " + cuenta.idCuenta);
                        System.out.println("Titular: " + cuenta.nombre);
                        System.out.println("DNI: " + cuenta.dni);
                        System.out.println("Saldo " + cuenta.saldo + "€");
                    }

                    else {
                        System.out.println("Esa cuenta no existe o has introducido incorrectamente el ID.");
                    }
                }
                case 0 -> System.out.println("Saliendo del programa. Nos vemos o/");
                default -> throw new IllegalStateException("Valor no identificado: " + opcion);

            }
        }
    }
}
