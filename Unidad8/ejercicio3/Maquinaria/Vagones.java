package Unidad8.ejercicio3.Maquinaria;

class Vagones {
    int identificador;
    int cargaMaxima;
    int cargaActual;
    String tipoMercancia;

    public Vagones(int identificador, int cargaMaxima, int cargaActual, String tipoMercancia) {
        this.identificador = identificador;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
    }
}
