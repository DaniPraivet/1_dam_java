package Unidad6;

import Utils.ConsoleUtils;

import java.util.Scanner;

public class ejercicioClase4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // El primer jugador introduce la contraseña
        System.out.println(ConsoleUtils.RED_BOLD + "Jugador 1: \nIntroduce tu contraseña:" + ConsoleUtils.RESET);
        String contrasena = sc.nextLine();

        System.out.println(ConsoleUtils.CYAN_BOLD + "¿Quieres jugar la primera versión o la segunda?" + ConsoleUtils.RESET);
        int modo_juego = sc.nextInt();
        sc.nextLine(); // para evitar errores (al tener otro sc.nextLine al parecer obtiene un "ENTER" / "\n")

        switch (modo_juego) {
            case 1:
                jugarVersion1(sc, contrasena);
                break;

            case 2:
                jugarVersion2(sc, contrasena);
                break;

            default:
                System.out.println(ConsoleUtils.YELLOW_BOLD + "Solo puedes usar como opción el número 1 o 2." + ConsoleUtils.RESET);
                break;
        }
    }

    private static void jugarVersion1(Scanner sc, String contrasena) {
        System.out.println(ConsoleUtils.BLUE_BOLD + "Jugador 2: Intenta adivinar la contraseña." + ConsoleUtils.RESET);
        while (true) {
            System.out.println(ConsoleUtils.WHITE_BOLD + "Introduce tu palabra:" + ConsoleUtils.RESET);
            String intento = sc.nextLine();

            if (intento.equals(contrasena)) {
                System.out.println(ConsoleUtils.GREEN_BOLD + "Has acertado la contraseña." + ConsoleUtils.RESET);
                break;
            } else if (intento.compareTo(contrasena) < 0) {
                System.out.println(ConsoleUtils.YELLOW + "La contraseña es mayor." + ConsoleUtils.RESET);
            } else {
                System.out.println(ConsoleUtils.YELLOW + "La contraseña es menor." + ConsoleUtils.RESET);
            }
        }
    }

    private static void jugarVersion2(Scanner sc, String contrasena) {
        System.out.println(ConsoleUtils.BLUE_BOLD + "Jugador 2: Intenta adivinar la contraseña." + ConsoleUtils.RESET);
        int longitud = contrasena.length();
        char[] pistas = new char[longitud];
        for (int i = 0; i < longitud; i++) {
            pistas[i] = '*';
        }

        while (true) {
            System.out.println(ConsoleUtils.WHITE_BOLD + "Introduce tu palabra:" + ConsoleUtils.RESET);
            String intento = sc.nextLine();

            if (intento.equals(contrasena)) {
                System.out.println(ConsoleUtils.GREEN_BOLD + "Has acertado la contraseña." + ConsoleUtils.RESET);
                break;
            }

            // Actualizamos las pistas
            for (int i = 0; i < longitud; i++) {
                if (i < intento.length() && intento.charAt(i) == contrasena.charAt(i)) {
                    pistas[i] = contrasena.charAt(i);
                }
            }

            // Mostramos las pistas
            System.out.println(ConsoleUtils.YELLOW_BOLD + "Pistas: " + ConsoleUtils.RESET + new String(pistas));
        }
    }
}
