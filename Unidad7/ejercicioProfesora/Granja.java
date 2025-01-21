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


    public double litrosRecogidosAlDia (Vaca[] vacas) {
        double produccionVacaLechera = (34.5*305)/365;
        double litrosPorDia = 0;
        for (Vaca vaca : vacas) {
            if (vaca.producto.equalsIgnoreCase("leche")) {
                litrosPorDia += produccionVacaLechera;
            }
        }
        return litrosPorDia;
    }

    public void mostrarInformacionAnimales ( Cerdo[] cerdos, Vaca[] vacas) {
        for (Cerdo cerdo : cerdos) {
            System.out.println(cerdo.toString());
        }
        for (Vaca vaca : vacas) {
            System.out.println(vaca.toString());
        }
    }
}
