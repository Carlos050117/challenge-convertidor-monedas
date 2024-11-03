import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("Ingresa el valor que desea covertir:");
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println("El valor " + cantidad + " [" + monedaBase + "] " +
                "corresponde al valor final de =>>> " + cantidadConvertida + " [" + monedaTarget + "]\n");

    }
}
