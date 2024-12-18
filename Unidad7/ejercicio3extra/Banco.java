package Unidad7.ejercicio3extra;

public class Banco {
    private CuentaBancaria[] cuentas;
    private int numeroCuentas;

    public CuentaBancaria[] getCuentas() {
        return cuentas;
    }

    public Banco(int capacidad) {
        this.cuentas = new CuentaBancaria[capacidad];
        this.numeroCuentas = 0;
    }

    public boolean agregarCuenta(CuentaBancaria cuenta) {
        if (numeroCuentas < cuentas.length) {
            cuentas[numeroCuentas] = cuenta;
            numeroCuentas++;
            System.out.println("Cuenta agregada para: " + cuenta.getTitular());
            return true;
        } else {
            System.out.println("No se pueden agregar más cuentas, el banco está lleno.");
            return false;
        }
    }

    public boolean realizarTransferencia(CuentaBancaria origen, CuentaBancaria destino, double cantidad) {
        boolean origenValido = false;
        boolean destinoValido = false;
        for (int i = 0; i < numeroCuentas; i++) {
            if (cuentas[i] == origen) {
                origenValido = true;
            }
            if (cuentas[i] == destino) {
                destinoValido = true;
            }
        }

        if (origenValido && destinoValido) {
            if (origen.retirar((cantidad))) {
                destino.depositar(cantidad);
                System.out.println("Transferencia de " + cantidad + " realizada de " + origen.getTitular() + " a " + destino.getTitular());
                return true;
            }
        } else {
            System.out.println("No se ha podido hacer la transferencia.");
        }
        return false;
    }

    public double obtenerSaldoTotal() {
        double saldoTotal = 0;
        for (int i = 0; i < numeroCuentas; i++) {
            saldoTotal += cuentas[i].getSaldo();
        }
        return saldoTotal;
    }

    public void mostrarInformacionCuentas() {
        for (int i = 0; i < numeroCuentas; i++) {
            System.out.println(cuentas[i]);
        }
    }
}
