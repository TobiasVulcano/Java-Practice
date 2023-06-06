
package ejercicioextra17;

/*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.*/

import java.util.Scanner;


public class EjercicioExtra17 {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean primo;
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        primo = averiguar(num);
        if (primo == true){
            System.out.println("El numero es primo");
        }else {
            System.out.println("El numero no es primo");
        }
        
    }
    
    public static boolean averiguar (int num){
        boolean verdad = true;
        if (num == 0 || num == 1 || num == 4) {
        verdad = false;
        }else {
         for (int i = 2;  i< num / 2; i++) {
             if (verdad == true){
                 if (num % i == 0){
                     verdad = false;
                 }
             }
                 
             }
         }

        return verdad;
}
}
