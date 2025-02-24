package Unidad8.ejercicio1;

class Alumno extends Persona {
    private Curso curso;

    public Alumno(String nombre, int edad, float estatura) {
        super(nombre, edad, estatura);
        this.curso = asignarCurso(edad);
    }

    private Curso asignarCurso(int edad) {
        if (edad >= 3 && edad <= 5) return Curso.PREESCOLAR;
        else if (edad >= 6 && edad <= 11) return Curso.PRIMARIA;
        else if (edad >= 12 && edad <= 16) return Curso.SECUNDARIA;
        else if (edad >= 17 && edad <= 18) return Curso.BACHILLERATO;
        else if (edad >= 19 && edad <= 22) return Curso.GRADO_SUPERIOR;
        else return Curso.GRADO_UNIVERSITARIO;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCurso: " + curso + "\nHorario: " + (curso.ordinal() <= Curso.BACHILLERATO.ordinal() ? "Mañana" : "Tarde");
    }
}
