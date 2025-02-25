package Unidad8.ejercicio1;

class Alumno extends Persona {
    private Curso curso;

    public Alumno(String nombre, int edad, float estatura) {
        super(nombre, edad, estatura);
        this.curso = asignarCurso(edad);
    }
    enum Curso {
        PREESCOLAR, PRIMARIA, SECUNDARIA, BACHILLERATO, GRADO_SUPERIOR
    }

    private Curso asignarCurso(int edad) {
        if (edad <= 0 ) return null;
        else if (edad <= 6) return Curso.PREESCOLAR;
        else if (edad <= 12) return Curso.PRIMARIA;
        else if (edad <= 16) return Curso.SECUNDARIA;
        else if (edad < 18) return Curso.BACHILLERATO;
        else return Curso.GRADO_SUPERIOR;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCurso: " + curso + "\nHorario: " + (curso.ordinal() <= Curso.BACHILLERATO.ordinal() ? "Mañana" : "Tarde");
    }
}
