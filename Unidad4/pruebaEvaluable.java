package Unidad4;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class pruebaEvaluable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcionMenu = 1; // Creamos la variable para operar luego con el Switch

        while (opcionMenu != 0) {
            System.out.println("CALCULADORA");
            System.out.println("\t1. Área de un cuadrado");
            System.out.println("\t2. Área de un triángulo");
            System.out.println("\t3. Área de un círculo");
            System.out.println("\t4. Volumen de un cubo");
            System.out.println("\t5. Volumen de una pirámide de base cuadrada");
            System.out.println("\t6. Volumen de una esfera");
            System.out.println("\t7. Volumen de un cilindro");
            System.out.println("\t8. Volumen de un cono");
            System.out.println("\t0. Salir");

            opcionMenu = sc.nextInt();

            switch (opcionMenu) {
                case 1 -> {
                    System.out.println("Dime el valor del lado: ");
                    float lbr = sc.nextFloat(); // Elijo este nombre para no crear 3 variables distintas que den sentido a --> Lado/Base/Radio (LBR).
                    System.out.println("El área es: " + cuadradoArea(lbr));
                }
                case 2 -> {
                    System.out.println("Dime el valor de la base: ");
                    float lbr = sc.nextFloat();
                    System.out.println("Dime la altura: ");
                    float a = sc.nextFloat();
                    System.out.println("El área es: " + trianguloArea(lbr,a));
                }
                case 3 -> {
                    System.out.println("Dime el valor del radio: ");
                    float lbr = sc.nextFloat();
                    System.out.println("El área es: " + circuloArea(lbr));
                }
                case 4 -> {
                    System.out.println("Dime el valor del lado: ");
                    float lbr = sc.nextFloat();
                    System.out.println("El volumen es: " + cuboVolumen(lbr));
                }
                case 5 -> {
                    System.out.println("Dime el valor del lado: ");
                    float lbr = sc.nextFloat();
                    System.out.println("Dime la altura: ");
                    float a = sc.nextFloat();
                    System.out.println("El volumen es: " + piramideCuadrangularVolumen(lbr,a));
                }
                case 6 -> {
                    System.out.println("Dime el valor del radio: ");
                    float lbr = sc.nextFloat();
                    System.out.println("El volumen es: " + esferaVolumen(lbr));
                }
                case 7 -> {
                    System.out.println("Dime el valor del radio: ");
                    float lbr = sc.nextFloat();
                    System.out.println("Dime la altura: ");
                    float a = sc.nextFloat();
                    System.out.println("El volumen es: " + cilindroVolumen(lbr,a));
                }
                case 8 -> {
                    System.out.println("Dime el valor del radio: ");
                    float lbr = sc.nextFloat();
                    System.out.println("Dime la altura: ");
                    float a = sc.nextFloat();
                    System.out.println("El volumen es: " + conoVolumen(lbr,a));
                }
                case 0 -> {
                    System.out.println("Nos vemos o/ ");
                }
                default -> {
                    System.out.println("Escribe valores comprendidos entre 1 y 8, en caso que quieras salir, pulsa 0 y omite la entrada de lado/base/radio");
                }

            }
        }
    }

    static double cuadradoArea(float lbr) {
        //l^2
        return pow(lbr, 2);
    }
    static double trianguloArea(float lbr, float a) {
        //(b*h)/2
        return (lbr*a) / 2;
    }
    static double circuloArea(float lbr) {
        //(PI * r^2)
        return PI * pow(lbr, 2);
    }
    static double cuboVolumen(float lbr) {
        //l^2*l == l^3
        return cuadradoArea(lbr) * lbr;
    }
    static double piramideCuadrangularVolumen(float lbr, float a) {
        //(l^2*h)/3
        return (cuadradoArea(lbr)*a)/3;
    }
    static double esferaVolumen(float lbr) {
        //4/3PI*r^3 == (4*PI * r^3)/3
        return ((4 * PI) * pow(lbr, 3)) / 3;
    }
    static double cilindroVolumen(float lbr, float a) {
        //(PI * r^2)*h
        return circuloArea(lbr) * a;
    }
    static double conoVolumen(float lbr, float a) {
        //1/3PI*r^2*h == (PI * r^2*h)/3
        return cilindroVolumen(lbr, a) / 3;
    }




}

