public class ejercicioSwitch {
    public static void main(String[] args) {
        int a = 10;
        switch (a-2) {
            case 1:
                System.out.print("Hola ");
                break;
            case 5:
                System.out.print("Me ");
                break;
            case 8:
                System.out.print("Alegro ");
                break;
            case 9:
                System.out.print("De ");
                break;
            case 11:
                System.out.print("Conocerte.");
                break;
            default:
                System.out.print("Sin coincidencia");
                break;
        }
    }
}
