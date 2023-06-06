
package ejercicioextra11;

/*Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división.*/

import java.util.Scanner;


public class EjercicioExtra11 {


    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese un numero");
         int num = leer.nextInt();
         calcular(num);
         
    }
    
    public static void calcular (int num){
        int cant = 0;
        int aux = num;
        while (aux > 9){
            aux = (int) (aux / 10);
            cant = cant + 1;
        }
        cant = cant + 1;
        
        System.out.println("El numero " +num+ " tiene " +cant+ " numeros");
    }
}
