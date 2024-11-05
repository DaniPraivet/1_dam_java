import java.util.Scanner;

public class ejercicioMundo {
    public static void main(String[] args) {

        boolean norte; // Crear variable norte
        boolean este; // Crear variable este
        String ubicacion = ""; // Almacenar la ubicación dependiendo de los parametros elegidos en el Scanner
        Scanner sc = new Scanner(System.in);


        // Norte o Sur
        System.out.println("¿Vives en el hemisferio norte? (true/false): ");
        norte = sc.nextBoolean();
        // Este u Oeste
        System.out.println("¿Vives en el este? (true/false): ");
        este = sc.nextBoolean();

        // Podría haber terminado aquí el script pero quería complicarme la vida aprendiendo como funciona un switch
        // Por eso he creado la variable ubicación, sino en cada if podria haber puesto de donde eres

        if (norte && este) {
            //ubicacion = "ne";
            System.out.println("Eres de Europa");
        } else if (norte && !este) {
            //ubicacion = "nw";
            System.out.println("Eres de América del Norte");
        } else if (!norte && este) {
            //ubicacion = "se";
            System.out.println("Eres de África");
        } else if (!norte && !este) {
            //ubicacion = "sw";
            System.out.println("Eres de América del Sur");
        }

        /*switch (ubicacion) {
            case "ne" -> System.out.println("Eres de Europa");
            case "nw" -> System.out.println("Eres de América del Norte");
            case "se" -> System.out.println("Eres de África");
            case "sw" -> System.out.println("Eres de América del Sur");
        }*/


    }
}
