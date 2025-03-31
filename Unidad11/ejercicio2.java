package Unidad11;

import java.io.*;

public class ejercicio2 implements Serializable {
    public static void main(String[] args) {
        String cadena = """
                La bandera blanca y verde
                vuelve, tras siglos de guerra,
                a decir paz y esperanza
                bajo el sol de nuestra tierra.
                """;
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Unidad11/archivos/himno.dat"))){
            out.writeObject(cadena);
        } catch (IOException e) {
            System.out.println("Error");
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Unidad11/archivos/himno.dat"))) {
            String texto = (String) in.readObject();
            System.out.println(texto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
