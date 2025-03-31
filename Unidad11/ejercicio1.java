package Unidad11;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ejercicio1 implements Serializable {
    public static void main(String[] args) {
        String path = "Unidad11/archivos";
        File archivo = new File(path+"datos.dat");
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        // Normal
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))){
            /*for (int i : arr) {
                out.writeInt(i);
            }*/
            out.writeObject(arr);

        } catch (IOException e) {
            System.out.println("Error.");
        }

        // V1 - V2
        /*try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            int[] arrLeido = new int[arr.length];
            for (int i = 0; i < arrLeido.length; i++) {
                arrLeido[i] = in.readInt();
            }
            System.out.println(Arrays.toString(arrLeido));
        } catch (IOException e) {
            System.out.println("Error");
        }*/

        // V2
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            int[] array = (int[]) in.readObject();
            System.out.println(Arrays.toString(array));
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
