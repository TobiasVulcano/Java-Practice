
package ejercicioextra5;

/*Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.*/

import java.util.Scanner;


public class EjercicioExtra5 {


    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese que tipo de socio es (A/B/C)");
         String socio = leer.next();
         System.out.println("Ingrese el costo del tratamiento");
         int costo = leer.nextInt();
         calcularCosto(socio, costo);
    }
    
    public static void calcularCosto (String socio, int costo){
        boolean error = false;
        if (socio.equalsIgnoreCase("A")){
            costo = (int) (costo * 0.50);
        }else if (socio.equalsIgnoreCase("B")){
            costo = (int) (costo * 0.65);
        }else if (socio.equalsIgnoreCase("C")){
            costo = costo;
        }else{
            error = true;
            System.out.println("Error en el tipo de socio");
        }
        
        if (error == false){
            System.out.println("El costo total del tratamiento seria: " +costo+ "$");
        }
    }
} 
