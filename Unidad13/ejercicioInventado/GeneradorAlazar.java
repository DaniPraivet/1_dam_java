package Unidad13.ejercicioInventado;

public class GeneradorAlazar {
    public static void main(String[] args) {

        for (int i = 1; i < 36; i++) {
            int alumno = i;
            int dia = (int) (Math.random()*2);
            if (dia==0) {
                System.out.println("El alumno de la casilla " + alumno + " va a ser corregido el día 22");
            } else {
                System.out.println("El alumno de la casilla " + alumno + " va a ser corregido el día 26");
            }

        }

    }
}
