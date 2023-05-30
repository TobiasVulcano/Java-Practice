
package ejercicio15;

/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.*/

import java.util.Scanner;

public class Ejercicio15 {
 
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector;
        vector = llenarVector();
        for (int i = 99; i>=0; i--){
            System.out.println(vector[i]);
        }
        
    }
    public static int[] llenarVector (){
        int[] vector = new int[100];
        for (int i = 0; i<100;i++){
            vector[i] = i;
        }
        return vector;
    }
}
