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
            System.out.println("\t5. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    CuentaCorriente nuevaCuenta = CuentaCorriente.crearCuenta(siguienteCuenta);

                    banco[siguienteCuenta] = nuevaCuenta;
                    System.out.println("Se ha creado una cuenta con los siguentes datos: ");
                    System.out.println("Nombre a: " + nuevaCuenta.nombre);
                    System.out.println("Con DNI: " + nuevaCuenta.dni);
                    System.out.println("Saldo: " + nuevaCuenta.saldo);
                    System.out.println("Con id de Cuenta: " + nuevaCuenta.idCuenta);

                    if (siguienteCuenta < banco.length) {
                        siguienteCuenta++;
                    } else {
                        System.out.println("Has superado el límite de cuentas.");
                    }
                }
                case 2 -> System.out.println("Selecciona una cuenta");
                default -> throw new IllegalStateException("Valor no identificado: " + opcion);
            }
        }
    }
}
