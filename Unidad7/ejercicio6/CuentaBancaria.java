package Unidad7.ejercicio6;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private Gestor gestor;

    // Constructor predeterminado
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public CuentaBancaria(String titular, double saldoInicial, Gestor gestor) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.gestor = gestor;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Cantidad no válida para depósito.");
        }
    }

    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
            return true;
        } else {
            System.out.println("Fondos insuficientes o cantidad no válida.");
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }


    public Gestor getGestor() {
        return gestor;
    }

    @Override
    public String toString() {
        String gestorInfo = (gestor != null) ? ", Gestor: " + gestor.nombre : ", Sin gestor asignado";
        return "Cuenta Bancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                gestorInfo +
                '}';
    }

    public void asignarGestor(Gestor gestor) {
    }
}