
package ejercicio4;

import java.util.Scanner;

/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/

public class Ejercicio4 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int F;  
        System.out.println("Ingrese la temperatura en celsius");
        int C = leer.nextInt();
        F = 32 + (9 * C / 5);
        System.out.println("La temperatura en Fahrenheit es: " + F + "°");
    }
}