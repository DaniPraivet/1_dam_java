package Unidad12.ejercicio15;

import java.io.Serializable;
import java.time.LocalTime;

public class Registro implements Serializable {
    private double temperatura;
    private LocalTime hora;

    public Registro(double temperatura) {
        this.temperatura = temperatura;
        this.hora = LocalTime.now();
    }

    public double getTemperatura() {
        return temperatura;
    }

    public LocalTime getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return String.format("Hora: %s - Temperatura: %.2f °C", hora, temperatura);
    }
}