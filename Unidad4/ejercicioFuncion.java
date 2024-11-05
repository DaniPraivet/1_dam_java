package Unidad4;

import java.util.Scanner;

public class ejercicioFuncion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre: ");
        String nombre = sc.nextLine();
        escribeMiNombre(nombre);
        escribeMiNombre(nombre);
        escribeMiNombre(nombre);


    }
    static void escribeMiNombre(String nombre) {
        System.out.println(nombre);
    }
}
