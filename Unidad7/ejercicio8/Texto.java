package Unidad7.ejercicio8;

import java.time.LocalDateTime;

public class Texto {
    int maxLongitud;
    String cadena;
    final LocalDateTime fechaCreacion;
    LocalDateTime ultimaModificacion;

    // Enum para las vocales
    private enum Vocales {
        A('A'), E('E'), I('I'), O('O'), U('U');

        private final char letra;

        Vocales(char letra) {
            this.letra = letra;
        }

        public char getLetra() {
            return letra;
        }

        // Verificar si un carácter es una vocal
        public static boolean esVocal(char c) {
            for (Vocales v : Vocales.values()) {
                if (v.getLetra() == Character.toUpperCase(c)) {
                    return true;
                }
            }
            return false;
        }
    }

    public Texto(int maxLongitud) {
        this.cadena = "";
        this.maxLongitud = maxLongitud;
        this.fechaCreacion = LocalDateTime.now();
        this.ultimaModificacion = fechaCreacion;
    }

    public Texto(String cadena, int maxLongitud) {
        this.cadena = cadena;
        this.maxLongitud = maxLongitud;
        this.fechaCreacion = LocalDateTime.now();
        this.ultimaModificacion = fechaCreacion;
    }

    public void hallarVocales() {
        int mayusculas = 0;
        int minusculas = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Vocales.esVocal(c)) {
                if (Character.isUpperCase(c)) {
                    mayusculas++;
                } else {
                    minusculas++;
                }
            }
        }

        System.out.println("Vocales mayúsculas: " + mayusculas);
        System.out.println("Vocales minúsculas: " + minusculas);
    }

    /*public Texto anadirCaracter(char caracter, boolean posicion) {
        // Verificar longitud maxima
        if (this.cadena.length() >= this.maxLongitud) {
            System.out.println("No se pueden añadir más caracteres. Has llegado al máximo de longitud establecido.");
            return this;
        }

        // Añadir carácter al principio o al final
        if (posicion) {
            this.cadena = caracter + this.cadena;
        } else {
            this.cadena += caracter;
        }

        // Actualizar modificacion
        this.ultimaModificacion = LocalDateTime.now();

        return this;
    }*/

    public Texto anadirTexto(String cadenaUsuario, boolean posicion) {
        // Verifica que no se haya alcanzado la longitud máxima
        if (this.cadena.length() + cadenaUsuario.length() > this.maxLongitud) {
            System.out.println("No se pueden añadir más caracteres. Has llegado al máximo de longitud establecido.");
            return this;
        }

        // Añadir cadena al principio o al final
        if (posicion) {
            this.cadena = cadenaUsuario + this.cadena;
        } else {
            this.cadena += cadenaUsuario;
        }

        // Actualizar moficacion
        this.ultimaModificacion = LocalDateTime.now();

        return this;
    }

    @Override
    public String toString() {
        return "Información sobre el objeto Texto:\n" +
                "\tLongitud máxima: " + this.maxLongitud + "\n" +
                "\tContenido: " + this.cadena + "\n" +
                "\tFecha creación: " + this.fechaCreacion + "\n" +
                "\tÚltima modificación: " + this.ultimaModificacion;
    }
}