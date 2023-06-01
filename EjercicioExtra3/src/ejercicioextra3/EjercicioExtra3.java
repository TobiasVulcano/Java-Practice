
package ejercicioextra3;

/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje.*/

import java.util.Scanner;


public class EjercicioExtra3 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        analizarLetra(letra);
    }
    
    public static void analizarLetra (String letra){
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println(letra+ " es una vocal");
        }else
            System.out.println(letra+ " no es una vocal");
    }
    
}
