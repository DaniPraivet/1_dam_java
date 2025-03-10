package Unidad8.ejercicioClase.SeresVivos;

public abstract class Oviparo extends Animal {
    int cantidadDeHuevos;

    public Oviparo(int esperanzaDeVida, int tiempoGestacion, int numExtremidades, String nombreCientifico, String nombre, String raza, int cantidadDeHuevos) {
        super(esperanzaDeVida, false, tiempoGestacion, numExtremidades, nombreCientifico, nombre, raza);
        this.cantidadDeHuevos = cantidadDeHuevos;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cantidad de huevos que pone : " + this.cantidadDeHuevos);
    }
}
