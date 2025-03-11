public class Mago extends Personaje{
    public Mago(String nombre, int salud, int tipoAtaque) {
        super(nombre, salud, tipoAtaque);
    }

    public void lanzarHechizo(Personaje oponente) {
        atacar(oponente);
    }
}
