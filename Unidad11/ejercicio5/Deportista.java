package Unidad11.ejercicio5;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Deportista {
    final String DNI;
    String nombre;
    String fechaNacimiento;
    static int edad;
    Deportes deporte;



    public Deportista(String DNI, String nombre, String fechaNacimiento, int idDeporte) {

        this.DNI = DNI;
        this.deporte = Deportes.asignarDeporte(idDeporte);
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        edad = getEdad();
    }
    public Deportista(String DNI, String nombre, int anyo, int mes, int dia , int idDeporte) {

        this.DNI = DNI;
        this.deporte = Deportes.asignarDeporte(idDeporte);
        setFechaNacimiento(anyo, mes, dia);
        this.nombre = nombre;
        edad = getEdad();
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {

        return nombre;
    }

    public int getEdad() {
        String[] str = fechaNacimiento.split("-");
        int getEdad = LocalDateTime.now().getYear()  - Integer.parseInt(str[0]);
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Deportes getDeporte() {
        return deporte;
    }

    public void setDeporte(Deportes deporte) {
        this.deporte = deporte;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int anyo, int mes, int diaMes) {
        this.fechaNacimiento = anyo + "-" + mes + "-" + diaMes;
    }

    @Override
    public String toString() {
        return "Deportista{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", deporte=" + deporte +
                '}';
    }
}
