package Unidad7.ejercicio7;

public class Hora {
    int hora;
    int minuto;
    int segundo;

    // Constructor principal

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        sistemaHexadecimal(this);
    }

    // Getters y Setters
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void sumarSegundos (int segundo, int segundosASumar) {
        segundo += segundosASumar;
        setSegundo(segundo);

    }
    private Hora sistemaHexadecimal (Hora hora1) {
        int segundo = hora1.getSegundo();
        int minuto = hora1.getMinuto();
        int hora = hora1.getHora();


        if (segundo >= 60) {
            minuto += segundo / 60;
            segundo = segundo % 60;
        }
        if (minuto >= 60) {
            hora += minuto / 60;
            minuto = minuto % 60;
        }

        hora = hora % 24;
        hora1.setSegundo(segundo);
        hora1.setMinuto(minuto);
        hora1.setHora(hora);
        return hora1;
    }

}


