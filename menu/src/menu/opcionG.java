package menu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Kasey
 */
public class opcionG {

    public opcionG() {
    }

    //Leer los radianes de un triángulo y calcular el seno y el coseno
    public static void LeerRadianes(double radianes) {

        try {
            double seno = Math.sin(radianes);
            double coseno = Math.cos(radianes);

            System.out.printf("El Seno es: %.4f%n", seno);
            System.out.printf("El Coseno es: %.4f%n", coseno);

        } //Atrapa el error si hay.
        catch (NumberFormatException e) {
            System.out.println("Error: Por favor ingrese un número válido.");
        }

    }

}
