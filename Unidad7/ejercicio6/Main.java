package Unidad7.ejercicio6;

import java.util.Scanner;

/*
Existen gestores que administran las cuentas bancarias y atienden a sus propietarios.

Cada cuenta, en caso de tenerlo, cuenta con un único gestor.

Diseña la clase Gestor de la que interesa guardar su nombre, teléfono y el importe máximo autorizado con el
que pueden operar. Con respecto a los gestores, existen las siguientes restricciones:

Un gestor tendrá siempre un nombre y un teléfono.

Si no se asigna, el importe máximo autorizado por operación será de unos 10000 euros.

Un gestor, una vez asignado, no podrá cambiar su número de teléfono. Y todo el mundo podrá
consultarlo.

El nombre será público y el importe máximo sólo será visible por las clases vecinas.

Modificar la clase CuentaCorriente para que pueda disponer de un objeto Gestor. Escribir los métodos
necesarios.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco(10); // Crear un banco con capacidad para 10 cuentas

        int opcion;
        do {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Crear cuenta bancaria");
            System.out.println("2. Asignar gestor a una cuenta");
            System.out.println("3. Consultar información de cuentas");
            System.out.println("4. Realizar depósito");
            System.out.println("5. Realizar retiro");
            System.out.println("6. Crear una cuenta corriente con gestor");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el titular de la cuenta: ");
                    String titular = sc.nextLine();
                    System.out.print("Ingrese el saldo inicial: ");
                    double saldo = sc.nextDouble();
                    sc.nextLine();
                    CuentaBancaria cuenta = new CuentaBancaria(titular, saldo);
                    if (banco.agregarCuenta(cuenta)) {
                        System.out.println("Cuenta creada con éxito.");
                    }
                }
                case 2 -> {
                    System.out.print("Ingrese el nombre del gestor: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese el teléfono del gestor: ");
                    String tlf = sc.nextLine();
                    System.out.print("Desea asignar un importe máximo personalizado? (s/n): ");
                    String respuesta = sc.nextLine();

                    Gestor gestor;
                    if (respuesta.equalsIgnoreCase("s")) {
                        System.out.print("Ingrese el importe máximo autorizado: ");
                        double importe = sc.nextDouble();
                        sc.nextLine();
                        gestor = new Gestor(nombre, tlf, importe);
                    } else {
                        gestor = new Gestor(nombre, tlf);
                    }

                    System.out.print("Ingrese el índice de la cuenta a asignar el gestor (0 a " + (banco.getCuentas().length - 1) + "): ");
                    int indice = sc.nextInt();
                    sc.nextLine();
                    if (indice >= 0 && indice < banco.getCuentas().length && banco.getCuentas()[indice] != null) {
                        banco.getCuentas()[indice].asignarGestor(gestor);
                        System.out.println("Gestor asignado con éxito a la cuenta.");
                    } else {
                        System.out.println("Índice inválido o cuenta no existente.");
                    }
                }
                case 3 -> banco.mostrarInformacionCuentas();
                case 4 -> {
                    System.out.print("Ingrese el índice de la cuenta para depositar (0 a " + (banco.getCuentas().length - 1) + "): ");
                    int indice = sc.nextInt();
                    sc.nextLine();
                    if (indice >= 0 && indice < banco.getCuentas().length && banco.getCuentas()[indice] != null) {
                        System.out.print("Ingrese la cantidad a depositar: ");
                        double cantidad = sc.nextDouble();
                        sc.nextLine();
                        banco.getCuentas()[indice].depositar(cantidad);
                    } else {
                        System.out.println("Índice inválido o cuenta no existente.");
                    }
                }
                case 5 -> {
                    System.out.print("Ingrese el índice de la cuenta para retirar (0 a " + (banco.getCuentas().length - 1) + "): ");
                    int indice = sc.nextInt();
                    sc.nextLine();
                    if (indice >= 0 && indice < banco.getCuentas().length && banco.getCuentas()[indice] != null) {
                        System.out.print("Ingrese la cantidad a retirar: ");
                        double cantidad = sc.nextDouble();
                        sc.nextLine();
                        banco.getCuentas()[indice].retirar(cantidad);
                    } else {
                        System.out.println("Índice inválido o cuenta no existente.");
                    }
                }
                case 6 -> {
                    System.out.print("Ingrese el titular de la cuenta: ");
                    String titular = sc.nextLine();
                    System.out.print("Ingrese el saldo inicial: ");
                    double saldo = sc.nextDouble();
                    sc.nextLine();


                    System.out.print("Ingrese el nombre del gestor: ");
                    String titularGestor = sc.nextLine();
                    System.out.println("Ingrese el telefono del gestor: ");
                    String tlfGestor = sc.nextLine();
                    System.out.println("Ingrese la cantidad máxima a operar (opcional): ");
                    int cantidadGestor = sc.nextInt();
                    Gestor gestor = new Gestor(titularGestor,tlfGestor,cantidadGestor);
                    CuentaBancaria cuenta = new CuentaBancaria(titular, saldo, gestor);
                    if (banco.agregarCuenta(cuenta)) {
                        System.out.println("Cuenta creada con éxito.");
                    }

                }
                case 0 -> System.out.println("Saliendo del programa. ¡Hasta pronto!");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}