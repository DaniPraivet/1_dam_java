package Unidad7.ejercicio10;

import Unidad7.ejercicio10.Empleados.JefeEstacion;
import Unidad7.ejercicio10.Empleados.Maquinista;
import Unidad7.ejercicio10.Empleados.Mecanico;
import Unidad7.ejercicio10.Maquinaria.Locomotoras;
import Unidad7.ejercicio10.Maquinaria.Trenes;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Mecanico e1 = new Mecanico("Eduardo", "58340394Y", "584390231", "Frenos");
        Maquinista e2 = new Maquinista("Joaquín", "29843712D", 1700, "Maquinista I");
        JefeEstacion e3 = new JefeEstacion("Jairo", "48372539K", LocalDateTime.now());
        Locomotoras l1 = new Locomotoras("AWP 9999", 5000, 70, e1);
        Trenes tren = new Trenes(l1, e2);
        tren.añadirVagones();
        tren.mostrarInformacion();
    }
}
