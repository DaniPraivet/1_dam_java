package Unidad8.ejercicioClase.SeresVivos;

public class Caracol extends Oviparo implements MovimientoAnimal{
    public Caracol(int esperanzaDeVida, int tiempoGestacion, int numExtremidades, String nombreCientifico, String nombre, String raza, int cantidadDeHuevos) {
        super(esperanzaDeVida, tiempoGestacion, numExtremidades, nombreCientifico, nombre, raza, cantidadDeHuevos);
    }

    @Override
    public void velocidad() {
        System.out.println("Va a 0,048km/h");
    }
}
