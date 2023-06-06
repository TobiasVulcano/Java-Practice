
package ejercicioextra16;

/*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/

import java.util.Scanner;


public class EjercicioExtra16 {


    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         String continuar = "";
         do {
             System.out.println("Ingrese su nombre");
             String nombre = leer.next();
             System.out.println("Ingrese su edad");
             int edad = leer.nextInt();
             if (edad < 18){
                 System.out.println("Su nombre es: " +nombre+ " y es menor de edad");
             }else {
                 System.out.println("Su nombre es: " +nombre+ " y es mayor de edad");
             }
             System.out.println("Desea continuar?");
             continuar = leer.next();
         }while (continuar.equalsIgnoreCase("si"));

    }
    
}
