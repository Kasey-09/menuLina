package menu;

import java.util.Scanner;

/**
 *
 * @author Jose Avila C.I: 31.778.251
 * @author Kasey Bermudez C.l: 32078712
 */
public class opcionB {
    // Tipo de funcion sin retorno, ni parametros

    public static void CalcularCirculo() {

        double radio, perimetro = 0, area = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el radio del circulo: ");
        radio = entrada.nextFloat();

        perimetro = (2 * radio * Math.PI);
        System.out.println("El perimetro del circulo es: " + perimetro);

        area = (Math.PI * Math.pow(radio, 2));
        System.out.println("El area del circulo es: " + area);
    }
}
