
package ejercicio.pkg3;

/* Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. */
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String fraseMin;
        String fraseMay;
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        fraseMin = frase.toLowerCase();
        fraseMay = frase.toUpperCase();
        System.out.println(fraseMay);
        System.out.println(fraseMin);
    }
}
