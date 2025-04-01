package Unidad11.ejercicio3;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Tabla {
    private static final String FILE_PATH = "Unidad11/ejercicio3/socios.dat";
    Socio[] socios = new Socio[0];
    int totalSocios = 0;

    public Tabla() {
        cargarSocios();
    }

    public void nuevoSocio(Scanner sc) {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Dirección: ");
        String direccion = sc.nextLine();

        socios = Arrays.copyOf(socios,socios.length+1);
        socios[totalSocios++] = new Socio(totalSocios,nombre,direccion);
        System.out.println("Socio agregado.");
    }

    public void guardarSocios() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            for (int i = 0; i < totalSocios; i++) {
                oos.writeObject(socios[i]);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar la tabla.");
        }
    }

    public void cargarSocios() {
        File archivo = new File(FILE_PATH);
        if (!archivo.exists()) return;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            Socio s;
            while ((s = (Socio) ois.readObject()) != null) {
                socios = Arrays.copyOf(socios,socios.length+1);
                socios[totalSocios++] = s;

            }
        } catch (IOException e) {
            System.out.println("Error al cargar la tabla.");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        String str = "Tabla{" + "\n socios=";
        for (int i = 0; i < totalSocios; i++) {
            str += socios[i].toString();
        }


        return str + "\n, totalSocios=" + totalSocios +
                '}';
    }
}
