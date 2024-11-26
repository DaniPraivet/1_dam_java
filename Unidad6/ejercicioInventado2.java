package Unidad6;

public class ejercicioInventado2 {
    public static void main(String[] args) {
        String fichero1 = "index.html";
        String[] partes = fichero1.split("\\.");
        for (int i = 0; i < partes.length; i++) {
            System.out.println(partes[i]);
        }
    }
}
