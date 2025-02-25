package Unidad8.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Carlos", 30, 1.75f);
        System.out.println(p1.toString());
        p1.aumentarEdad(2);
        System.out.println("Edad actualizada: " + p1.getEdad());

        System.out.println();
        Alumno a1 = new Alumno("Ana", 21, 1.60f);
        System.out.println(a1.toString());
    }
}