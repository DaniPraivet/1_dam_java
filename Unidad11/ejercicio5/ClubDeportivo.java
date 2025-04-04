package Unidad11.ejercicio5;

import Unidad11.ejercicio3.Socio;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class ClubDeportivo {
    private static final String FILE_PATH = "Unidad11/ejercicio5/ClubDeportivo.dat";
    Deportista[] deportistas = new Deportista[0];

    public ClubDeportivo() {
        cargarDeportistas();
    }

    public void darAlta(Deportista d) {
        boolean duplicado = false;
        for (Deportista deportista : deportistas) {
            if (d.equals(deportista)) {
                duplicado = true;
                System.out.println("Deportista duplicado.");
                break;
            }
        }
        if (!duplicado) {
            deportistas = Arrays.copyOf(deportistas, deportistas.length+1);
            deportistas[deportistas.length-1] = d;
            System.out.println("Deportista agregado.");
        }

    }

    public void darBaja(String dni) {

        boolean encontrado = false;
        for (Deportista deportista : deportistas) {
            if (deportista.getDNI().equalsIgnoreCase(dni)) {
                encontrado = true;
                deportista.setNombre("");
                Arrays.sort(deportistas,0,deportistas.length, (d1,d2) -> d1.getNombre().compareToIgnoreCase(d2.getNombre()));
                deportistas = Arrays.copyOf(deportistas,deportistas.length-1);
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado el deportista.");
        }
    }

    public void buscarDeportista(String busqueda) {
        boolean encontrado = false;

        for (int i = 0; i < deportistas.length; i++) {
            if (deportistas[i].getNombre().toLowerCase().contains(busqueda)) {
                System.out.println(deportistas[i].getNombre() + " - " + deportistas[i].getDNI());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado el deportista.");
        }
    }

    public String listarAlfNombres() {
        String str = "Club Deportivo{" + "\n deportistas=\n";

        Arrays.sort(deportistas, 0, deportistas.length, (d1, d2) -> d1.getNombre().compareToIgnoreCase(d2.getNombre()));
        for (int i = 0; i < deportistas.length; i++) {
            str += "\t"+deportistas[i].toString()+"\n";
        }
        return str + "\n}";
    }

    public String listarEdad() {
        String str = "Club Deportivo{" + "\n deportistas=\n";

        Arrays.sort(deportistas, 0, deportistas.length, Comparator.comparingInt(Deportista::getEdad));
        for (int i = 0; i < deportistas.length; i++) {
            str += "\t"+deportistas[i].toString()+"\n";
        }
        return str + "\n}";
    }


    public void guardarDeportistas() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            for (int i = 0; i < deportistas.length; i++) {
                oos.writeObject(deportistas[i]);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar la tabla.");
        }
    }

    public void cargarDeportistas() {
        File archivo = new File(FILE_PATH);
        if (!archivo.exists()) return;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            Deportista d;
            while ((d = (Deportista) ois.readObject()) != null) {
                deportistas = Arrays.copyOf(deportistas,deportistas.length+1);
                deportistas[deportistas.length-1] = d;

            }
        } catch (IOException e) {
            System.out.println("Error al cargar el club deportivo.");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
