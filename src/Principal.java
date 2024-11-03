import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion=0;
        while (opcion !=7){
            System.out.println("************************************\n" +
            "Sea bienvenido/a al conversor de moneda =]\n\n" +
            "1) Dólar =>> Peso argentino\n" +
            "2) Peso argentino =>> Dólar\n" +
            "3) Dólar =>> Real brasileño\n" +
            "4) Real brasileño =>> Dólar\n" +
            "5) Dólar =>> Peso colombiano\n" +
            "6) Peso colombiano =>> Dólar\n" +
            "7) Salir\n\n" +
            "Elija una opción válida:");

        opcion = lectura.nextInt();
        lectura.nextLine();

        switch (opcion){
            case 1:
                ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                break;
            case 2:
                ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                break;
            case 3:
                ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                break;
            case 4:
                ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                break;
            case 5:
                ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                break;
            case 6:
                ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                break;
            case 7:
                System.out.println("Muchas gracias, vuelva pronto.\n");
                break;

            default:
                System.out.println("Opcióm no válida.\n");
                break;
            }
        }
    }
}
