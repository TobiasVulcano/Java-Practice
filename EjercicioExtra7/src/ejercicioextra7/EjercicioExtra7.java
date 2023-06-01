
package ejercicioextra7;

/*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.*/

import java.util.Scanner;


public class EjercicioExtra7 {

    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         String eleccion;
         System.out.println("Ingrese la cantidad de numeros a calcular");
         int nums = leer.nextInt();
         System.out.println("Quiere la version hecha con while o la version hecha con do-while?");
         eleccion = leer.next();
         if (nums > 0){
         if (eleccion.equalsIgnoreCase("while")){
             calculoRealizadoConWhile(nums);
         }else if (eleccion.equalsIgnoreCase("do-while")){
             calculoRealizadoConDoWhile(nums);
         }else{
             System.out.println("Error en la eleccion");
         }
         }else {
             System.out.println("Nada a evaluar :)");
         }
    }
    
    public static void calculoRealizadoConWhile (int nums){
        Scanner leer = new Scanner(System.in);
        int prom = 0;
        int valorMin = Integer.MAX_VALUE;
        int valorMax = Integer.MIN_VALUE;
        int i = 1;
        int newnum;
        while (i < nums + 1){
            do {
            System.out.println("Ingrese un numero");
            newnum = leer.nextInt();
            }while (newnum < 0);
            if (newnum > valorMax){
                valorMax = newnum;
            }
            if (newnum < valorMin){
                valorMin = newnum;
            }
            prom = prom + newnum;
            i++;
        }
       
        
        prom = prom / nums;
        System.out.println("El promedio de los numeros es: " +prom+ ", el valor maximo es: " +valorMax+ " y el valor minimo es: " +valorMin);
    }
    
    
    public static void calculoRealizadoConDoWhile (int nums){
        Scanner leer = new Scanner(System.in);
        int prom = 0;
        int valorMin = Integer.MAX_VALUE;
        int valorMax = Integer.MIN_VALUE;
        int i = 1;
        int newnum;
        do {
            do {
            System.out.println("Ingrese un numero");
            newnum = leer.nextInt();
            }while (newnum < 0);
            if (newnum > valorMax){
                valorMax = newnum;
            }
            if (newnum < valorMin){
                valorMin = newnum;
            }
            prom = prom + newnum;
            i++;
        }while (i < nums + 1);
        
        prom = prom / nums;
        System.out.println("El promedio de los numeros es: " +prom+ ", el valor maximo es: " +valorMax+ " y el valor minimo es: " +valorMin);
    }
}
