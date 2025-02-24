package Unidad7.problema;

public class Clase {
    String nombre;
    Sitio[][] sitios = new Sitio[5][7];

    public Clase(String nombre, Sitio[][] sitios) {
        this.nombre = nombre;
        this.sitios = sitios;
    }

    public void mostrarInformacion(Clase clase) {
        System.out.println("Sitios de la clase " + this.nombre);

        for (int i = 0; i < sitios.length; i++) {
            for (int j = 0; j < sitios[0].length; j++) {
                System.out.print("[" + sitios[i][j] + "] ");
            }
            System.out.println("");
        }
    }
}
