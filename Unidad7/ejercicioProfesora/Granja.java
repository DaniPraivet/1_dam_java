package Unidad7.ejercicioProfesora;

public class Granja {
    String nombre;
    Cerdo[] cerdos;
    Vaca[] vacas;

    public Granja(String nombre, Cerdo[] cerdos, Vaca[] vacas){
        this.nombre = nombre;
        this.cerdos = cerdos;
        this.vacas = vacas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cerdo[] getCerdos() {
        return cerdos;
    }

    public void setCerdos(Cerdo[] cerdos) {
        this.cerdos = cerdos;
    }

    public Vaca[] getVacas() {
        return vacas;
    }

    public void setVacas(Vaca[] vacas) {
        this.vacas = vacas;
    }

    public double litrosRecogidosAlDia (Vaca[] vacas) {
        double produccionVacaLechera = 0;
        produccionVacaLechera = (34.5*305)/365;
        double litrosPorDia = 0;
        for (Vaca vaca : vacas) {
            if (vaca.producto.equalsIgnoreCase("leche")) {
                litrosPorDia += produccionVacaLechera;
            }
        }
        return litrosPorDia;
    }

    public void mostrarInformacionAnimales () {

    }
}
