package menu;

/**
 *
 * @author Jose Avila C.I: 31.778.251
 * @author Kasey Bermudez
 */
public class opcionD {

    //Leer un número si es entero y positivo calcular el coseno.
    // Tipo de funcion con retorno y parámetros.
    public static double leerNumero(double numero) {

        if (numero > 0 && numero % 1 == 0) {

            return Math.cos(numero);

        } else {
            return 0;
        }
    }

}
