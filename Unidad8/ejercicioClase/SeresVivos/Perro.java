package Unidad8.ejercicioClase.SeresVivos;

public class Perro extends Viviparo implements SonidoAnimal,MovimientoAnimal{

    public Perro(int esperanzaDeVida, int tiempoGestacion, int numExtremidades, String nombreCientifico, String nombre, String raza) {
        super(esperanzaDeVida, tiempoGestacion, numExtremidades, nombreCientifico, nombre, raza);
    }

    @Override
    public void voz() {
        System.out.println("Guau");
    }

    @Override
    public void velocidad() {
        System.out.println("La velocidad es de 15km/h");
    }
}
