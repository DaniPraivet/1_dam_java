package Unidad6;

import java.io.File;
import java.util.Scanner;

public class ejercicioClase2 {
    /*
    Teniendo un array de 3 usuarios y un array de 3
    contraseñas.

    Pediremos al usuario que introduzca su usuario y su
    contraseña.

        Si ambos son correctos, le saldrá un mensaje de
        felicitación

        Si falla 3 veces seguidas, terminaremos el
        programa.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] usuarios = {"Daniel", "Andrés", "Álvaro"};
        String[] contrasenas = {"Da", "An", "Al"};
        int contador = 0;
        String usuario = "";
        String contrasena = "";
        boolean inicio = false;

        while (contador < 3) {
            System.out.println("Dime tu nombre de usuario: ");
            usuario = sc.nextLine();
            System.out.println("Dime tu contraseña: ");
            contrasena = sc.nextLine();

            for (int i = 0; i < usuarios.length; i++) {
                if (usuario.equals(usuarios[i]) && contrasena.equals(contrasenas[i])) {
                    inicio = true;
                    contador = 3;
                    System.out.println("Has conseguido iniciar sesión correctamente.");
                }

            }

            if (!inicio) {
                contador++;
                System.out.println("No has introducido correctamente el usuario/contraseña.");
            }
        }
    }
}
