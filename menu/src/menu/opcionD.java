package menu;

/**
 *
 * @author Kasey
 */
public class opcionD {

    //Leer un número si es entero y positivo calcular el coseno.
    public static double leerNumero(double numero) {

        if (numero > 0 && numero % 1 == 0) {

            return Math.cos(numero);

        } else {
            return 0;
        }
    }

}
