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

    public static int getIdDeporte(Deportes deporte) {
        switch (deporte) {
            case NATACION -> {
                return 1;
            }
            case REMO -> {
                return 2;
            }
            case VELA -> {
                return 3;
            }
            case WATERPOLO -> {
                return 4;
            }
            default -> {
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        switch (this) {
            case NATACION -> {
                return "Natación";
            }
            case REMO -> {
                return "Remo";
            }
            case VELA -> {
                return "Vela";
            }
            case WATERPOLO -> {
                return "Waterpolo";
            }
            default -> {
                return "";
            }
        }
    }
}