import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Mago m1 = new Mago("Llefry", 100, 4);
        Guerrero g1 = new Guerrero("Estuard", 250, 1);
        Guerrero g2 = new Guerrero("Nipard", 90, 2);
        Guerrero g3 = new Guerrero("Ixgal", 120, 3);
        Scanner sc = new Scanner(System.in);
        int opcion = 1;


        while (opcion != 0) {
            System.out.println("---- Videojuego ----");
            System.out.println("1. Mago");
            System.out.println("2. Guerrero");
            System.out.println("3. Mostrar Información de todos los personajes");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                    case 1 -> {
                        int opcionMago = 1;

                        while (opcionMago != 0) {
                            System.out.println("¿Qué quieres hacer con el mago?");
                            System.out.println("1. Lanzar Hechizo");
                            System.out.println("2. Mostrar Información");
                            System.out.println("0. Salir");
                            opcionMago = sc.nextInt();
                            switch (opcionMago) {
                                case 1 -> {
                                    System.out.println("¿A quien le quieres lanzar el hechizo?");
                                    System.out.println("\t1. Guerrero 1");
                                    System.out.println("\t2. Guerrero 2");
                                    System.out.println("\t3. Guerrero 3");
                                    int quienAtacar = sc.nextInt();
                                    switch (quienAtacar) {
                                        case 1 -> m1.lanzarHechizo(g1);
                                        case 2 -> m1.lanzarHechizo(g2);
                                        case 3 -> m1.lanzarHechizo(g3);
                                    }
                                }
                                case 2 -> m1.mostrarInformacion();
                                case 0 -> System.out.println("Volviendo al menú inicial. \n\n\n");
                            }
                        }

                    }
                case 2 -> {
                    int opcionGuerrero, opcionSeleccionGuerrero = 1;

                    while (opcionSeleccionGuerrero != 0) {
                        System.out.println("¿A qué guerrero te refieres?");
                        System.out.println("\t 1. " + g1.getNombre());
                        System.out.println("\t 2. " + g2.getNombre());
                        System.out.println("\t 3. " + g3.getNombre());
                        System.out.println("\t 0. Ninguno");
                        opcionSeleccionGuerrero = sc.nextInt();
                        switch (opcionSeleccionGuerrero) {
                            case 1 -> {
                                System.out.println("¿Qué quieres hacer con el Guerrero 1?");
                                System.out.println("1. Atacar");
                                System.out.println("2. Activar protección");
                                System.out.println("3. Mostrar Información");
                                System.out.println("0. Salir");
                                opcionGuerrero = sc.nextInt();
                                switch (opcionGuerrero) {
                                    case 1 -> {
                                        System.out.println("¿A quien le quieres lanzar el hechizo?");
                                        System.out.println("\t1. Mago 1");
                                        System.out.println("\t2. Guerrero 2");
                                        System.out.println("\t3. Guerrero 3");
                                        int quienAtacar = sc.nextInt();
                                        switch (quienAtacar) {
                                            case 1 -> g1.atacar(m1);
                                            case 2 -> g1.atacar(g2);
                                            case 3 -> g1.atacar(g3);
                                        }
                                    }
                                    case 2 -> g1.activarProteccion();
                                    case 3 -> g1.mostrarInformacion();
                                    case 0 -> System.out.println("Volviendo al menú inicial. \n\n\n");
                                }
                            }
                            case 2 -> {
                                System.out.println("¿Qué quieres hacer con el Guerrero 2?");
                                System.out.println("1. Atacar");
                                System.out.println("2. Mostrar Información");
                                System.out.println("0. Salir");
                                opcionGuerrero = sc.nextInt();
                                switch (opcionGuerrero) {
                                    case 1 -> {
                                        System.out.println("¿A quien le quieres lanzar el hechizo?");
                                        System.out.println("\t1. Mago 1");
                                        System.out.println("\t2. Guerrero 1");
                                        System.out.println("\t3. Guerrero 3");
                                        int quienAtacar = sc.nextInt();
                                        switch (quienAtacar) {
                                            case 1 -> g2.atacar(m1);
                                            case 2 -> g2.atacar(g1);
                                            case 3 -> g2.atacar(g3);
                                        }
                                    }
                                    case 2 -> g2.activarProteccion();
                                    case 3 -> g2.mostrarInformacion();
                                    case 0 -> System.out.println("Volviendo al menú inicial. \n\n\n");
                                }
                            }

                            case 3 -> {
                                System.out.println("¿Qué quieres hacer con el Guerrero 3?");
                                System.out.println("1. Atacar");
                                System.out.println("2. Mostrar Información");
                                System.out.println("0. Salir");
                                opcionGuerrero = sc.nextInt();
                                switch (opcionGuerrero) {
                                    case 1 -> {
                                        System.out.println("¿A quien le quieres lanzar el hechizo?");
                                        System.out.println("\t1. Mago 1");
                                        System.out.println("\t2. Guerrero 1");
                                        System.out.println("\t3. Guerrero 2");
                                        int quienAtacar = sc.nextInt();
                                        switch (quienAtacar) {
                                            case 1 -> g3.atacar(m1);
                                            case 2 -> g3.atacar(g1);
                                            case 3 -> g3.atacar(g2);
                                        }
                                    }
                                    case 2 -> g3.activarProteccion();
                                    case 3 -> g3.mostrarInformacion();
                                    case 0 -> System.out.println("Volviendo al menú inicial. \n\n\n");
                                }
                            }

                            case 0 -> {}
                        }
                    }
                }
                case 3 -> {
                    System.out.println("---- Información Mago ----");
                    m1.mostrarInformacion();
                    System.out.println("---- Información Guerrero 1 ----");
                    g1.mostrarInformacion();
                    System.out.println("---- Información Guerrero 2 ----");
                    g2.mostrarInformacion();
                    System.out.println("---- Información Guerrero 3 ----");
                    g3.mostrarInformacion();
                }
                case 0 -> {
                    System.out.println("Nos vemos jugador o/.");
                }
            }
        }
    }
}
