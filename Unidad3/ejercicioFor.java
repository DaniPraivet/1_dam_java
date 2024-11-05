package Unidad3;

public class ejercicioFor {
    public static void main(String[] args) {

        int row = 4;

        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("B  ");
                }
                else {
                    System.out.print("N  ");
                }
            }
            System.out.println();
        }


        /*int f = 0; // Suspensos
        int a = 0; // Aprbados
        int c = 0; // Condicionados
        int n = 0; // Nota
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Nota: ");
            n = sc.nextInt();
            if (n > 5) ;
            {
                a++;
            }
         else if (n < 4) ;
            {
                f++;
            }
         else{
                c++;
            }

        }
        System.out.println("Tienes " + a + " aprobados, " + c + "condicionados y " + f + " notas suspensas.");
     */
     /*
     int row = 5;

     for (int i = 1; i <= row; i++) {
         for (int j = 1; j <= i; j++)
         System.out.print(j + "");
         System.out.println();
     }
        */

    }
}
