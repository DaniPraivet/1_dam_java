package Unidad8.ejercicio1;



class Persona {
    public String nombre;
    private int edad;
    float estatura;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, int edad, float estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public void aumentarEdad(int incremento) {
        this.edad += incremento;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nEdad: " + edad + "\nEstatura: " + estatura + "m";
    }
}
