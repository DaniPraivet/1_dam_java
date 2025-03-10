package Unidad8.ejercicio3.Empleados;

public class Mecanico extends Empleado {
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
        super(nombre, dni);
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

    @Override
    public void mostrarInformacion() {
        System.out.println("\t\t--\tMecánico\t--");
        super.mostrarInformacion();
        System.out.println("\t\t\t Especialidad: " + this.getEspecialidad());
        System.out.println("\t\t\t Nombre: " + this.getTlf());
    }
}
