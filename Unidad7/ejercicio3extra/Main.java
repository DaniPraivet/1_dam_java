package Unidad7.ejercicio3extra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco(5);
        int opcion = 1;

        while (true) {
            System.out.println("Gestión del Banco");
            System.out.println("\t1. Crear cuenta bancaria");
            System.out.println("\t2. Mostrar información de todas las cuentas");
            System.out.println("\t3. Realizar transferencia");
            System.out.println("\t4. Mostrar saldo total del banco");
            System.out.println("\t0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese el nombre del titular:");
                    String titular = sc.nextLine();

                    System.out.println("Ingrese el saldo incial:");
                    double saldoInicial = sc.nextDouble();
                    sc.nextLine();

                    banco.agregarCuenta(new CuentaBancaria(titular, saldoInicial));
                }
                case 2 -> banco.mostrarInformacionCuentas();
                case 3 -> {
                    System.out.println("Ingrese el índice de la cuenta de origen");
                    int indiceOrigen = sc.nextInt();

                    System.out.println("Ingrese el índice de la cuenta de destino:");
                    int indiceDestino = sc.nextInt();

                    System.out.println("Ingrese la cantidad a transferir:");
                    double cantidad = sc.nextDouble();

                    if (indiceOrigen >= 0 && indiceOrigen < banco.getCuentas().length &&
                            indiceDestino >= 0 && indiceDestino < banco.getCuentas().length) {
                        banco.realizarTransferencia(
                                banco.getCuentas()[indiceOrigen],
                                banco.getCuentas()[indiceDestino],
                                cantidad
                        );
                    } else {
                        System.out.println("Índices de cuenta no válidos.");
                    }
                }
                case 4 -> System.out.println("Saldo total del banco: " + banco.obtenerSaldoTotal());
                case 0 -> {
                    System.out.println("Nos vemos o/");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opción no válida");
            }
        }
    }
}
