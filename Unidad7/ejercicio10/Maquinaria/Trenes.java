package Unidad7.ejercicio10.Maquinaria;

import Unidad7.ejercicio10.Empleados.Maquinista;

public class Trenes {
    Locomotoras locomotora;
    Vagones[] vagones = new Vagones[5];
    Maquinista empleadoAsignado;

    public Trenes(Locomotoras locomotora, Maquinista empleadoAsignado) {
        this.locomotora = locomotora;
        this.empleadoAsignado = empleadoAsignado;
    }

    public Vagones[] getVagones() {
        return vagones;
    }
    public void añadirVagones() {
        vagones[0] = new Vagones(1,6500,4200, "Carbón");
        vagones[1] = new Vagones(2,8000, 5000, "Carbón");
        vagones[2] = new Vagones(3, 3500, 2000, "Piedra");
    }

    public void mostrarInformacion() {
        System.out.println("--\tInformación tren\t--");

        System.out.println("\t--\tVagones\t--");
        for (Vagones vagone : vagones) {
            if (vagone != null) {
                assert vagones[0] != null;
                System.out.println("\t\t Vagon nº" + vagone.identificador);
                System.out.println("\t\t\t Mercancia: " + vagone.tipoMercancia);
                System.out.println("\t\t\t Carga actual: " + vagone.cargaActual);
                System.out.println("\t\t\t Carga máxima: " + vagone.cargaMaxima);
            }
        }
        System.out.println("\t--\tMaquinista\t--");
        System.out.println("\t\t Nombre: " + empleadoAsignado.getNombre());
        System.out.println("\t\t DNI: " + empleadoAsignado.getDni());
        System.out.println("\t\t Rango: " + empleadoAsignado.getRango());
        System.out.println("\t\t Sueldo: " + empleadoAsignado.getSueldo());

    }
}

