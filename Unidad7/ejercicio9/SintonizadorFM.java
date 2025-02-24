package Unidad7.ejercicio9;

public class SintonizadorFM {
    float frecuencia = 80.0f;

public SintonizadorFM (float frecuencia) {
    if (frecuencia >= 80 && frecuencia <= 108) {
        this.frecuencia = frecuencia;
    }
}

public SintonizadorFM modificarFrecuencia (boolean modificar) {
    if (modificar) {
        frecuencia += 0.5f;
    } else {
        frecuencia -= 0.5f;
    }
    return this;
}

public void mostrarDatos () {
    System.out.println("Frecuencia: " + this.frecuencia);
}


}

