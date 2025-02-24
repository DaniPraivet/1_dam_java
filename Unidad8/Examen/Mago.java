package Unidad8.Examen;

public class Mago extends Personaje{
    String poderMagico;
    public Mago(String nombre, int salud, String tipoAtaque, String poderMagico) {
        super(nombre, salud, tipoAtaque);
        this.poderMagico = poderMagico;
    }


}
