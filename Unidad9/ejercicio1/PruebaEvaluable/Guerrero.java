public class Guerrero extends Personaje{
    boolean proteccion;
    public Guerrero(String nombre, int salud, int tipoAtaque) {
        super(nombre, salud, tipoAtaque);
        this.proteccion = false;
    }

    public void activarProteccion() {
            this.proteccion=true;
    }

    @Override
    void recibirAtaque() {
        if (!this.proteccion) {
            super.recibirAtaque();
        } else {
            this.proteccion=false;
        }
    }
    @Override
    void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("¿Tiene la protección activada?: " + this.proteccion);
    }

}
