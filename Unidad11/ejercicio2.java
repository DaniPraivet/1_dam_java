package Unidad11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ejercicio2 implements Serializable {
    public static void main(String[] args) {
        String cadena = """
                La bandera blanca y verde
                vuelve, tras siglos de guerra,
                a decir paz y esperanza
                bajo el sol de nuestra tierra.
                """;
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Unidad11/archivos/himno.dat"))){
            out.writeChars(cadena);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
