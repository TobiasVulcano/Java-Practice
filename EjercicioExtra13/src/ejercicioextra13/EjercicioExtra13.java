
package ejercicioextra13;

/*Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar.*/

import java.util.Scanner;


public class EjercicioExtra13 {


    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese un numero");
         int num = leer.nextInt();
         escalera(num);
    }
    
    public static void escalera (int num){
        int aux = 1;
        for (int i = 1; i<num + 1; i++){
            System.out.print(" " +i);
            if (i == aux){
                System.out.println("");
                aux++;
                i = 0;
            }
            if (aux == (num+1)){
                break;
            }
        }
    }
}
