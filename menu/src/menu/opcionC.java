package menu;
import java.util.Scanner;
/**
 *
 * @author Jose Avila C.I: 31.778.251
 * @author Kasey Bermudez
 */
public class opcionC {
    //tipo de funcion con retorno, sin parametros
    public static float CalcularLaPotencia() {
        float baseUsuario,exponenteUsuario, resultadoPotencia = 0; 
        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("Calculador de Potencias");
        
        System.out.print("Ingresa la Base: ");
        baseUsuario = entrada.nextFloat(); 
        
        System.out.print("Ingresa el Exponente: ");
        exponenteUsuario = entrada.nextFloat(); 
        
        resultadoPotencia = (float) Math.pow(baseUsuario, exponenteUsuario); 
        
        return resultadoPotencia; 
    }
}
