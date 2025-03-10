package Unidad8.ejercicioClase.SeresVivos;

public class Gato extends Viviparo implements SonidoAnimal,MovimientoAnimal {


    public Gato(int esperanzaDeVida, int tiempoGestacion, int numExtremidades, String nombreCientifico, String nombre, String raza) {
        super(esperanzaDeVida, tiempoGestacion, numExtremidades, nombreCientifico, nombre, raza);
    }

    @Override
    public void voz() {
        System.out.println("Miau");
    }

    @Override
    public void velocidad() {
        System.out.println("La velocidad es de 12km/h");
    }
}
