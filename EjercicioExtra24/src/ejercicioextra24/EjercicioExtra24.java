
package ejercicioextra24;

import java.util.Scanner;

/*Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci.*/


public class EjercicioExtra24 {

    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese el tamaño de la serie fibonacci");
         int num = leer.nextInt();
         int[] vector = new int [num];
         fibonacci(vector, num);
         mostrarVector(vector, num);
    }
    
    public static void fibonacci (int[] vector, int num){
        for (int i = 0; i<num; i++){
            if (i == 0 || i == 1){
                vector[i] = 1;
            }else {
                vector[i] = vector[i-1] + vector[i-2];
            }
        }
    }
    
    public static void mostrarVector (int[] vector, int num){
        for (int i = 0; i < num; i++){
            if (i != (num-1)){
                System.out.print(vector[i]+ ",");
            }else {
                System.out.println(vector[i]);
            }
        }
    }
}
