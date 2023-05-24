
package ejercicio7;
/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.*/

import java.util.Scanner;


public class Ejercicio7 {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String eureka = "eureka";
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        Boolean equals = frase.equals(eureka);
        if (equals == true)
            System.out.println("Correcto");
        else
            System.out.println("Incorrecto");
    }
    
}
