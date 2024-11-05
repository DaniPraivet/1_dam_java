package Unidad3;

import java.util.Scanner;

public class ejercicioCalculoMental {
    public static void main(String[] args) {
        int opcion = 14;
        boolean terminar = false;
        Scanner sc = new Scanner(System.in);
        int rnd1 = (int) (Math.random() * 100 + 1);
        int rnd2 = (int) (Math.random() * 100 + 1);
        int rndS = rnd1 + rnd2;
        int chs = 0;
        int pnts = 1000;


        while (opcion != 4) {
            System.out.println("\n\nElige que modo de juego quieres jugar.");
            System.out.println("1. Modo normal");
            System.out.println("2. Modo infinito");
            System.out.println("3. Ayuda");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    do {
                        rndS = rnd1 + rnd2;
                        System.out.println("Tu puntuación: " + pnts);
                        System.out.println("\n" + rnd1 + " " + "+ " + rnd2 + " = " + "_");
                        System.out.println("Cuál es el valor de _ ?");

                        chs = sc.nextInt();
                        if (chs == -1 || pnts == 0) terminar = true;
                        else {
                            if (chs != rndS) {
                                pnts = pnts - 100;
                                int newrnd1 = (int) (Math.random() * 100 + 1);
                                int newrnd2 = (int) (Math.random() * 100 + 1);
                                rnd1 = newrnd1;
                                rnd2 = newrnd2;
                            } else {
                                System.out.println("Correcto");
                            }
                            if (pnts == 0) {
                                chs = rndS;
                                System.out.println("0 points = 0 Game :>");
                            }
                        }
                    }
                    while (chs != rndS);
                }
                case 2 -> {
                    do {
                        rndS = rnd1 + rnd2;
                        System.out.println("Tu puntuación: " + pnts);
                        System.out.println("\n" + rnd1 + " " + "+ " + rnd2 + " = " + "_");
                        System.out.println("Cuál es el valor de _ ?");

                        chs = sc.nextInt();
                        if (chs == -1 || pnts == 0) terminar = true;
                        else {
                            if (chs != rndS) {
                                pnts = pnts - 100;
                                int newrnd1 = (int) (Math.random() * 100 + 1);
                                int newrnd2 = (int) (Math.random() * 100 + 1);
                                rnd1 = newrnd1;
                                rnd2 = newrnd2;
                            } else {
                                pnts = pnts + 50;
                                System.out.println("Correcto");
                                int newrnd1 = (int) (Math.random() * 100 + 1);
                                int newrnd2 = (int) (Math.random() * 100 + 1);
                                rnd1 = newrnd1;
                                rnd2 = newrnd2;
                            }
                        }
                    }
                    while (!terminar);
                }
                case 3 -> {
                    System.out.println("Modo normal:");
                    System.out.println("\fConsiste en adivinar el número que se generará del 1-100.");
                    System.out.println("\fSi fallas tendrás otra oportunidad de responder, pero a cambio");
                    System.out.println("\fperderás 100 puntos, si llegas a 0, terminas la partida.");
                    System.out.println("\fSi aciertas, ganas y finaliza la partida.");
                    System.out.println("\n\nModo infinito:");
                    System.out.println("\fEl mismo objetivo es el mismo que el normal, solo que si ganas");
                    System.out.println("\fganas puntos, y te formulan una nueva pregunta, pierdes cuando");
                    System.out.println("\fllegas a 0 puntos, o también te puedes rendir con el valor -1.");
                }
                default -> System.out.println("Selecciona una opción válida.");
            }
        }
        System.out.println("Gracias por usar este programa");

    }
}
