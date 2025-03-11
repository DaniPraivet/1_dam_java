public abstract class Personaje {
    String nombre;
    int salud;
    int tipoAtaque;
    String tipoAtaqueStr;

    public Personaje(String nombre, int salud, int tipoAtaque) {
        this.nombre = nombre;
        this.salud = salud;
        this.tipoAtaqueStr = setAtaque(tipoAtaque);
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAtaqueStr() {
        return tipoAtaqueStr;
    }

    public void setTipoAtaqueStr(String tipoAtaqueStr) {
        this.tipoAtaqueStr = tipoAtaqueStr;
    }

    public String setAtaque(int tipoAtaque) {
        switch (tipoAtaque) {
            case 1 -> {return "Espada";}
            case 2 -> {return "Arco";}
            case 3 -> {return "Piedras";}
            case 4 -> {return "Pócimas";}
            default -> {return "Desconocido";}
        }
    }

    public void atacar(Personaje enemigo) {
        enemigo.recibirAtaque();
    }

    void recibirAtaque() {
        this.salud -= 20;
        if (this.salud <= 0) this.salud = 0;
    }

    void mostrarInformacion() {
        System.out.println("Tipo personaje: " + this.getClass());
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Salud: " + this.salud + " HP");
        System.out.println("Tipo de ataque: " + this.tipoAtaqueStr);
    }

}
