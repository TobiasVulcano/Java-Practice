
package ejercicio.pkg5;

/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número.*/

import java.util.Scanner;

class Ejercicio5 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese un numero entero");
         int num = leer.nextInt();
         System.out.println( num * 2);
         System.out.println(num * 3);
         System.out.println(Math.sqrt(num));

    }
    
}
