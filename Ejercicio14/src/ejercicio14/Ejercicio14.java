
package ejercicio14;

/*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/

import java.util.Scanner;


public class Ejercicio14 {


    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        String conve;
        System.out.println("Ingrese la cantidad de euros a convertir");
        int euros = leer.nextInt();
        System.out.println("Ingrese a que valor se convertira");
        conve = leer.next();
        convertirMoneda(euros, conve);
    }
    
    public static void convertirMoneda(int euros, String conve){
       String libras = "libras";
       String dolares = "dolares";
       String yenes = "yenes";
       int cuenta = 0;
       conve = conve.toLowerCase();
       if (conve.equals(libras)){
           cuenta = (int) (euros * 0.86); 
           System.out.println("La cantidad equivalente de libras es: " +cuenta);
       }else if (conve.equals(dolares)) {
           cuenta = (int) (euros * 1.28611);
           System.out.println("La cantidad equivalente de dolares es: " +cuenta);
       }else if (conve.equals(yenes)){
           cuenta = (int) (euros * 129.852);
           System.out.println("La cantidad equivalente de yenes es: " +cuenta);
       }
       
       
           }
}
