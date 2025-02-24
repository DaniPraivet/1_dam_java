package Unidad7.ejercicio10.Maquinaria;

import Unidad7.ejercicio10.Empleados.Mecanico;

public class Locomotoras {
    String matricula;
    int potenciaMotores;
    int antiguedad;
    Mecanico empleadoAsignado;

    public Locomotoras(String matricula, int potenciaMotores, int antiguedad, Mecanico empleadoAsignado) {
        this.matricula = matricula;
        this.potenciaMotores = potenciaMotores;
        this.antiguedad = antiguedad;
        this.empleadoAsignado = empleadoAsignado;
    }

    public void mostrarInformacion() {
        System.out.println("\t--\tLocomotora\t--");
        System.out.println("\t\t Matrícula: " + this.matricula);
        System.out.println("\t\t Antigüedad: " + this.antiguedad + "años");
        System.out.println("\t\t Potencia: " + this.potenciaMotores + " caballos");

    }

}
