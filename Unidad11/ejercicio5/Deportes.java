package Unidad11.ejercicio5;

public enum Deportes {
    NATACION,
    REMO,
    VELA,
    WATERPOLO;

    public static Deportes asignarDeporte(int idDeporte) {
        switch (idDeporte) {
            case 1 -> {
                return NATACION;
            }
            case 2 -> {
                return REMO;
            }
            case 3 -> {
                return VELA;
            }
            case 4 -> {
                return WATERPOLO;
            }
            default -> {
                throw new IdDeporteNoValidoException("Debes introducir un id válido de deporte");
            }
        }
    }
}