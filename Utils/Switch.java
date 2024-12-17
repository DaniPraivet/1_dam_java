package Utils;

import java.util.Scanner;

public class Switch {
    // Preset de Switch en Java
    public static void autoSwitchGenerator () {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime el número de casos que quieres en el Switch: ");
        int c = s.nextInt();

        String[] array = new String [c+2];

        array[0] = "        Scanner sc = new Scanner(System.in);\n" +
                "        int opcion = 1;\n" +
                "while (opcion != 0) {\n" +
                "            System.out.println(\"Titulo menu\");\n" +
                "            System.out.println(\"\\t1. \");\n" +
                "            System.out.println(\"\\t0. Salir\");\n" +
                "            opcion = sc.nextInt();\n" +
                "            switch (opcion) {";
        for (int i = 1; i < array.length-1; i++) {
            array[i] = "               case "+i+" -> {" +
                    "}";
        }
        array[array.length-1] = "                case 0 -> System.out.println(\"Saliendo del programa. Nos vemos o/\");\n" +
                "                default -> throw new IllegalStateException(\"Valor no identificado: \" + opcion);\n" +
                "\n" +
                "            }\n" +
                "        }";
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
