package menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


/**
 *
 *  @author Jose Avila C.I: 31.778.251
 *  @author Kasey Bermudez
 */
public class Menu {


    public static void main(String[] args) throws IOException {

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String opc_usu;

        System.out.println("Elige una opcion:");
        System.out.println("B,C,D,G");

        opc_usu = leer.readLine().toUpperCase();

        switch (opc_usu) {

            case "G":

                System.out.println("-----Programa para Leer los radianes de un triángulo y calcular el seno y el coseno-----");
                System.out.println("Ingresa los radianes: ejem: 0.65");

                double radianes_usu = Double.parseDouble(leer.readLine());

                opcionG.LeerRadianes(radianes_usu);

                break;

            case "D":
                System.out.println("-----Programa para Leer un número si es entero y positivo calcular el coseno-----");
                System.out.println("Ingresa el numero: ");
                double valor_usu = Double.parseDouble(leer.readLine());
                double respuesta = opcionD.leerNumero(valor_usu);

                if (respuesta != 0) {
                    System.out.println("El coseno del numero es: " + respuesta);
                } else {

                    System.out.println("El numero no cumple los requisitos para calcular su coseno. verifique e intente de nuevo");

                }

                break;
                
                
            case "B":
                
                System.out.println("-----Programa para Leer el radio de un círculo, y calcule su perímetro y su área-----");
                
                opcionB.CalcularCirculo();
                
                break;
                
                
            case "C":
                
                System.out.println("-----Programa para Leer la base y el exponente y calcular la potencia-----");
                
                float resultado = opcionC.CalcularLaPotencia();
                System.out.println(resultado);
                
                break;

            default:
                System.out.println("Opcion inválida, verifique e intente de nuevo.");
                
                

        }
    }



}
