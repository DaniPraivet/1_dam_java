package Unidad7.ejercicio10.Empleados;

public class Mecanico {
    String nombre;
    String dni;
    String tlf;
    enum Especialidad {
        FRENOS("Frenos"), HIDRAULICA("Hidráulica"), ELECTRICIDAD("Electricidad"), MOTOR("Motor");

        private final String especialidad;
        Especialidad(String especialidad) {
            this.especialidad = especialidad;
        }
    }
    String especialidad;

    public Mecanico(String nombre, String dni, String tlf, String especialidad) {
        this.nombre = nombre;
        this.dni = dni;
        this.tlf = tlf;
        this.especialidad = String.valueOf(Especialidad.valueOf(especialidad));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void mostrarInformacion() {
        System.out.println("\t\t--\tMecánico\t--");
        System.out.println("\t\t\t Nombre: " + this.getNombre());
        System.out.println("\t\t\t DNI: " + this.getDni());
        System.out.println("\t\t\t Especialidad: " + this.getEspecialidad());
        System.out.println("\t\t\t Nombre: " + this.getTlf());
    }
}
