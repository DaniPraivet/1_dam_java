package Unidad8.Examen;

public class Guerrero extends Personaje{
    boolean proteccion;
    public Guerrero(String nombre, int salud, String tipoAtaque, boolean proteccion) {
        super(nombre, salud, tipoAtaque);
        this.proteccion = proteccion;
    }
}
