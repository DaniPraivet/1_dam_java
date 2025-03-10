package Unidad8.ejercicioClase.SeresVivos;

public abstract class Animal {
    int esperanzaDeVida;
    boolean tipoGestacion;
    int tiempoGestacion;
    int numExtremidades;
    String nombreCientifico;
    String nombre;
    String raza;

    public Animal(int esperanzaDeVida, boolean tipoGestacion, int tiempoGestacion, int numExtremidades, String nombreCientifico, String nombre, String raza) {
        this.esperanzaDeVida = esperanzaDeVida;
        this.tipoGestacion = tipoGestacion;
        this.tiempoGestacion = tiempoGestacion;
        this.numExtremidades = numExtremidades;
        this.nombreCientifico = nombreCientifico;
        this.nombre = nombre;
        this.raza = raza;
    }

    public int getEsperanzaDeVida() {
        return esperanzaDeVida;
    }

    public void setEsperanzaDeVida(int esperanzaDeVida) {
        this.esperanzaDeVida = esperanzaDeVida;
    }

    public boolean isTipoGestacion() {
        return tipoGestacion;
    }

    public void setTipoGestacion(boolean tipoGestacion) {
        this.tipoGestacion = tipoGestacion;
    }

    public int getTiempoGestacion() {
        return tiempoGestacion;
    }

    public void setTiempoGestacion(int tiempoGestacion) {
        this.tiempoGestacion = tiempoGestacion;
    }

    public int getNumExtremidades() {
        return numExtremidades;
    }

    public void setNumExtremidades(int numExtremidades) {
        this.numExtremidades = numExtremidades;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del animal : " + this.nombre + " , que es un -> " + this.getClass().getName());
        System.out.println("Raza : " + this.raza);
        System.out.println("Nombre cientifico : " + this.nombreCientifico);
        System.out.println("Tipo de gestación : " + this.tiempoGestacion);
        System.out.println("Tiempo de gestación : " + this.tiempoGestacion);
        System.out.println("Esperanza de vida : " + this.esperanzaDeVida);
        System.out.println("Número de extremidades : " + this.numExtremidades);
    }

}
